package com.java.pratice.polymorphism_examples;

class InstanceOf_Example1 {
}

class InstanceOf_Example2 extends InstanceOf_Example1{
    public static void main(String[] args) {
        InstanceOf_Example2 ie = null;
        System.out.println(ie instanceof InstanceOf_Example1);
    }
}