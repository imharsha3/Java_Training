package com.java.pratice.encapsulation_examples;

class Account{

    private int acc_no;
    private String name,email,address;
    private float amount;

    public int getAcc_no(){
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}

public class Encapsulation_example {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAcc_no(101);
        account.setName("Java");
        account.setEmail("java@gmail.com");
        account.setAddress("India");
        account.setAmount(100000f);

        System.out.println("Account No:"+account.getAcc_no()+"Account Name:"+account.getName()+"Email:"
                +account.getEmail()+"Address:"+account.getAddress()+"Amount:"+account.getAmount());
    }
}
