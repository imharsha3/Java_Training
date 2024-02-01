package com.java.pratice.polymorphism_examples;

// Java Program to Illustrate Method Overloading
// By changing the Order of the Parameters

import java.io.*;

class Student {
    // Method 1
    public void StudentId(String name, int roll_no)
    {
        System.out.println("Name :" + name + " "
                + "Roll-No :" + roll_no);
    }

    // Method 2
    public void StudentId(int roll_no, String name)
    {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " "
                + "Name :" + name);
    }
}

class Overload_Example3 {
    // Main function
    public static void main(String[] args)
    {
        // Creating object of above class
        Student obj = new Student();

        // Passing name and id
        // Note: Reversing order
        obj.StudentId("Java", 1);
        obj.StudentId(2, "Phyton");
    }
}

