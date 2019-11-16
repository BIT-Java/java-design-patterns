package pl.mzlnk.bitjava.designpatterns.behavioral.strategy.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    @Override
    public void pay(double amount) {
        System.out.println(amount + "$ paid with credit/debit card");
    }

}
