//package com.java.pratice.exception_handling;
//
//import java.io.IOException;
//
//class Parent{
//
//    // defining the method
//    void msg() {
//        System.out.println("parent method");
//    }
//}
//
//public class TestExceptionChild extends Parent{
//
//    // overriding the method in child class
//    // gives compile time error
//    void msg() throws IOException {
//        System.out.println("TestExceptionChild");
//    }
//
//    public static void main(String args[]) {
//        Parent p = new TestExceptionChild();
//        p.msg();
//    }
//}
