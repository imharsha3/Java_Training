package com.java.pratice.thiskeyword_examples;

// Java code for using 'this' keyword
// to return the current class instance
class ThisExample3 {
    int a;
    int b;

    // Default constructor
    ThisExample3()
    {
        a = 10;
        b = 20;
    }

    // Method that returns current class instance
    ThisExample3 get() { return this; }

    // Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args)
    {
        ThisExample3 object = new ThisExample3();
        object.get().display();
    }
}

