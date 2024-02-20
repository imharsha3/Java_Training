package com.java.pratice.exception_handling;

class Parent3{
    void msg() throws Exception {
        System.out.println("parent method");
    }
}

public class TestExceptionChild3 extends Parent3 {
    void msg()throws Exception {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent3 p = new TestExceptionChild3();

        try {
            p.msg();
        }
        catch(Exception e) {}
    }
}
