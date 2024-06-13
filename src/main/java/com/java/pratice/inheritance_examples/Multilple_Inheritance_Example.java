package com.java.pratice.inheritance_examples;

interface Parent1{

    default void display(){
        System.out.println("In Parent1 Class");
    }
}
interface Parent2{

    default void display(){
        System.out.println("In Parent2 Class");
    }
}

public class Multilple_Inheritance_Example implements Parent1,Parent2{
    public static void main(String[] args) {
        Multilple_Inheritance_Example mie = new Multilple_Inheritance_Example();
        mie.display();
    }

    @Override
    public void display() {
        Parent1.super.display();
    }
}
