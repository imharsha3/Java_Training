package com.java.pratice.inheritance_examples;

public class CurrentAccount extends Account {
    double overDraftLimit = 500;
    public CurrentAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if( amount <= balance + overDraftLimit) {
            balance = balance-amount;
            System.out.println(amount+ " withdrawn from the current account. Remaining balance: " +balance);
        }else {
            System.out.println("Overdraft limit exceeded");
        }
    }
}
