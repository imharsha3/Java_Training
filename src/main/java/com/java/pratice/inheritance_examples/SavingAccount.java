package com.java.pratice.inheritance_examples;

public class SavingAccount extends Account{
    double interestRate = 0.05;
    public SavingAccount(String accountHolderName, double balance) {
        super(accountHolderName, balance);
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        deposit(interest);
        System.out.println("Interest of " +interest+ " added.");
    }
}
