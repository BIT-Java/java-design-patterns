package pl.mzlnk.bitjava.designpatterns.behavioral.strategy.payment;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankTransferStrategy implements PaymentStrategy {

    private String bankAccount;
    private String accountOwner;
    private String address;

    @Override
    public void pay(double amount) {
        System.out.println(amount + "$ paid with bank transfer.");
    }

}
