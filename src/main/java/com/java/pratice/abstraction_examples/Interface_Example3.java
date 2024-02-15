package com.java.pratice.abstraction_examples;

interface Add{
    void addition();
}
interface Sub{
    void Substraction();
}

class Math implements Add,Sub{
    @Override
    public void addition() {
        System.out.println("In Addition method");
    }

    @Override
    public void Substraction() {
        System.out.println("In Substraction method");
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.addition();
        math.Substraction();
    }
}

