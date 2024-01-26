package com.java.pratice.thiskeyword_examples;

public class ThisExample1 {
    int a;
    int b;

    //ambiguity code
    ThisExample1(int a, int b)
    {
        a = a;
        b = b;
    }

    // using this keyword to distinguish local variable and instance variable
//    ThisExample1(int a, int b)
//    {
//        this.a = a;
//        this.b = b;
//    }

    void display()
    {
        // Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }

    public static void main(String[] args)
    {
        ThisExample1 thisExample1 = new ThisExample1(10, 20);
        thisExample1.display();
    }
}
