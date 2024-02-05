package com.java.pratice.polymorphism_examples;


class Animal2{
    Animal2(){
        System.out.println("We are in Animal2 class");
    }
}
class Cat extends Animal2{
    Cat(){
        System.out.println("We are in Cat class");
    }

}
public class TestSuper4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}
