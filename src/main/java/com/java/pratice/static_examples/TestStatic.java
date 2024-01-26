package com.java.pratice.static_examples;

public class TestStatic {

    static int i=10;
    int j=5;

    static void m1(){
        i=20;
        System.out.println("from m1()");
m2();

    }

    static void m2(){
        System.out.println("from m2()");
    }

    public static void main(String[] args) {
    m1();
    }
}
