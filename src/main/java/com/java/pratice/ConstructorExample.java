package com.java.pratice;

public class ConstructorExample {
    ConstructorExample()
    {
        super();
        System.out.println("Constructor Called");
    }

    // main function
    public static void main(String[] args)
    {
        ConstructorExample constructorExample = new ConstructorExample();
    }
}
