package com.java.pratice.exception_handling;

//in case subclass overridden method declares subclass exception
class Parent4{
    void msg()throws Exception {
        System.out.println("parent method");
    }
}

class TestExceptionChild4 extends Parent4{
    void msg()throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent4 p = new TestExceptionChild4();

        try {
            p.msg();
        }
        catch(Exception e) {}
    }
}
