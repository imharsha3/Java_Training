package com.java.pratice.polymorphism_examples;

class Animal{
    String color="white";
    String color2="blue";
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color2);//prints color of Animal class
    }
}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }
}
