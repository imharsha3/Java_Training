package com.java.pratice.polymorphism_examples;

// super keyword in java example

// superclass Person
class Person {
    void message()
    {
        System.out.println("This is person class\n");
    }
}
// Subclass Student
class Students extends Person {
    void message()
    {
        System.out.println("This is students class");
    }
    // Note that display() is
    // only in Student class
    void display()
    {
        // will invoke or call current
        // class message() method
        message();

        // will invoke or call parent
        // class message() method
        super.message();
    }
}
class TestSuper2 {
    public static void main(String args[])
    {
        Students s = new Students();

        // calling display() of Student
        s.display();
    }
}

