package com.java.pratice.exception_handling;

class Parent1{
    void msg() {
        System.out.println("parent method");
    }
}

class TestExceptionChild1 extends Parent1{
    void msg()throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent1 p = new TestExceptionChild1();
        p.msg();
    }
}
