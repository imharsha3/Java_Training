package com.java.pratice.inheritance_examples;

public class BankSystem {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Java" , 1000);
        savingAccount.deposit(1000);
        savingAccount.applyInterest();
        savingAccount.withdraw(500);

        CurrentAccount currentAccount = new CurrentAccount("AWS", 500);
        currentAccount.withdraw(1000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(1000);
        currentAccount.deposit(1000);
        currentAccount.withdraw(1000);
    }
}
