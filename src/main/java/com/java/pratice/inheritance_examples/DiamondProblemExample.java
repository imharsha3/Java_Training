package com.java.pratice.inheritance_examples;

interface DiamondProblemExample {
    default void display() {
        System.out.println("From DiamondProblemExample");
    }
}

interface B extends DiamondProblemExample {
    default void display() {
    System.out.println("From B");
    }
}

interface C extends DiamondProblemExample {
    default void display() {
        System.out.println("From C");
    }
}

class D implements B, C{
    @Override
    public void display() {
        B.super.display();
        C.super.display();
    }
}

class Main{
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}