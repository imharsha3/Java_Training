package com.java.pratice.java8_examples;

interface Sayable{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
}

public class DefaultMethodExample implements Sayable{
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        DefaultMethodExample dm = new DefaultMethodExample();
        dm.say();   // calling default method
        dm.sayMore("Work is worship");  // calling abstract method

    }
}
