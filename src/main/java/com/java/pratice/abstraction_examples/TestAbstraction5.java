package com.java.pratice.abstraction_examples;

abstract class Base2{
    static void test(){
        System.out.println("In Static method");
    }
}

public class TestAbstraction5 extends Base2 {
    public static void main(String[] args) {
        Base2.test();
    }
}
