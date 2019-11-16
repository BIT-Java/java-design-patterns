package pl.mzlnk.bitjava.designpatterns.behavioral.strategy.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PayPalStrategy implements PaymentStrategy {

    private String emailId;
    private String password;

    @Override
    public void pay(double amount) {
        System.out.println(amount + "$ paid with Paypal.");
    }

}
