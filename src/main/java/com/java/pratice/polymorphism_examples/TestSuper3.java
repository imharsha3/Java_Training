package com.java.pratice.polymorphism_examples;

// Java Code to show use of
// super keyword with constructor

// superclass Person
class Person1 {
    Person1()
    {
        System.out.println("Person class Constructor");
    }
}

// subclass Student extending the Person class
class Student2 extends Person1 {
    Student2()
    {
        // invoke or call parent class constructor
        super();

        System.out.println("Student class Constructor");
    }
}

class TestSuper3 {
    public static void main(String[] args)
    {
        Student2 s = new Student2();
    }
}
