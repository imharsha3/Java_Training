package com.java.pratice.polymorphism_examples;

// Java Program to Illustrate Method Overloading
// By Changing Data Types of the Parameters

class Multiply {
    // Multiplying three integer values
    public int Mul(int a, int b, int c)
    {
        int prod1 = a * b * c;
        return prod1;
    }

    // Multiplying three double values.
    public double Mul(double a, double b, double c)
    {
        double prod2 = a * b * c;
        return prod2;
    }
}

class Overload_Example2 {
    public static void main(String[] args)
    {
        Multiply obj = new Multiply();

        int prod1 = obj.Mul(1, 2, 3);
        System.out.println(
                "Product of the three integer value :" + prod1);

        double prod2 = obj.Mul(1.0, 2.0, 3.0);
        System.out.println(
                "Product of the three double value :" + prod2);
    }
}

