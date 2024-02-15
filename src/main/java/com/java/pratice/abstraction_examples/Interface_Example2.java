package com.java.pratice.abstraction_examples;

interface Bank{
    float interestRate();

    int i =10;
}

class AXIS implements Bank
{
    @Override
    public float interestRate() {
        return 8.2f;
    }
}
class SBI implements Bank{
    @Override
    public float interestRate() {
        return 7.5f;
    }
}
class HDFC implements Bank{
    @Override
    public float interestRate() {
        return 9.0f;
    }
}
public class Interface_Example2 {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("Rate of Interest:"+b.interestRate());
    }
}
