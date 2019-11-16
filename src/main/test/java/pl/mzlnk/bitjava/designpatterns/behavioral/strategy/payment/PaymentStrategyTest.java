package pl.mzlnk.bitjava.designpatterns.behavioral.strategy.payment;

import org.junit.jupiter.api.Test;
import pl.mzlnk.bitjava.designpatterns.behavioral.strategy.Item;
import pl.mzlnk.bitjava.designpatterns.behavioral.strategy.ShoppingCart;

import java.util.UUID;

class PaymentStrategyTest {

    @Test
    void test() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(UUID.randomUUID(), 10.0);
        Item item2 = new Item(UUID.randomUUID(), 45.5);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new PayPalStrategy("myemail@example.com", "passwd"));

        //pay by credit card
        cart.pay(new CreditCardStrategy("John Smiths", "0000 0000 0000 0000", "123", "12/25"));

        // custom payment with lambda
        cart.pay(amount -> System.out.println(amount + "$ paid with custom payment method."));

        cart.pay(new PaymentStrategy() {
            @Override
            public void pay(double amount) {
                System.out.println(amount + "$ paid with custom payment method.");
            }
        });
    }

}