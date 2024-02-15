package com.java.pratice.abstraction_examples;

abstract class Base{

    void test(){
        System.out.println("In Base class");
    }
}

class Child extends Base{

}

public class TestAbstraction3 {
    public static void main(String[] args) {
        Child child = new Child();
        child.test();
    }
}
