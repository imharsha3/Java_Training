package com.java.pratice.thiskeyword_examples;

public class ThisExample5 {
    void method1(){
        System.out.println("hello method1");
    }
    void method2(){
        System.out.println("hello method2");
        //m();//same as this.m()
        this.method1();
    }
}
class TestThis4 {
    public static void main(String args[]) {
        ThisExample5 thisExample5 = new ThisExample5();
        thisExample5.method2();
    }
}