package com.java.pratice.thiskeyword_examples;

// Java code for using this() to
// invoke current class constructor
public class ThisExample2 {
    int a;
    int b;

    // Default constructor
    ThisExample2()
    {
        this(10, 20);
        System.out.println(
                "Inside  default constructor");
    }

    // Parameterized constructor
    ThisExample2(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println(
                "Inside parameterized constructor:"+a+","+b);
    }

    public static void main(String[] args)
    {
        ThisExample2 thisExample2 = new ThisExample2();
    }
}
