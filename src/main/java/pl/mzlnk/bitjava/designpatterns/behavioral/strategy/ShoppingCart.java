package pl.mzlnk.bitjava.designpatterns.behavioral.strategy;

import lombok.NoArgsConstructor;
import pl.mzlnk.bitjava.designpatterns.behavioral.strategy.payment.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double calculateTotal() {
        return items
                .stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void pay(PaymentStrategy paymentMethod) {
        double amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
