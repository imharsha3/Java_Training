package com.java.pratice.polymorphism_examples;

public class RuntimePoly_Example {

    void test(){
        System.out.println("In super class");
    }
}
class Runtimepoly_Example2 extends RuntimePoly_Example{
    @Override
    void test() {
        System.out.println("In Sub class");
    }

    public static void main(String[] args) {
        RuntimePoly_Example re = new Runtimepoly_Example2();
        re.test();
    }
}
