package com.java.pratice.inheritance_examples;

public class Account {
    String accountHolderName;
    double balance;

    public Account(String accountHolderName, double balance) {
        if( accountHolderName == null || accountHolderName.isEmpty()){
            throw new IllegalArgumentException("Account holder name can't be empty");
        }
        if(balance < 0){
            throw new IllegalArgumentException(" Initial balance can't be negative");
        }
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println(amount + "Deposited. New Balance: " + balance);
        }else {
            System.out.println("Invalid deposit!!");
        }
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + "with drawn. Remaining Balance: " +balance);
        } else {
            System.out.println("Insufficient funds!!");
        }
    }


}
