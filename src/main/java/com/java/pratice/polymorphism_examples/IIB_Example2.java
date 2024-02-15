package com.java.pratice.polymorphism_examples;

public class IIB_Example2 extends IIB_Example{

    IIB_Example2(){
        super();
        System.out.println("IIB Example 2 constructor");
    }
    {
        System.out.println("Exmaple 2 IIB Block");
    }

    public static void main(String[] args) {
        IIB_Example2 iib_example2 = new IIB_Example2();
    }
}
