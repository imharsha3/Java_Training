package com.java.pratice.java8_examples;

interface Sayable1{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}

public class StaticMethodExample implements Sayable1{
    @Override
    public void sayMore(String msg) {
        System.out.println(msg);
    }
    public static void main(String[] args) {
        StaticMethodExample sm = new StaticMethodExample();
        sm.say();                       // calling default method
        sm.sayMore("Work is worship");      // calling abstract method
        Sayable1.sayLouder("Helloooo...");   // calling static method
    }
}
