package com.java.pratice.abstraction_examples;

abstract class Base1{
    final void test(){
        System.out.println("In Final Method");
    }
}
class Child1 extends Base1{

}

public class TestAbstraction4 {
    public static void main(String[] args) {
        Base1 base1 = new Child1();
    }
}
