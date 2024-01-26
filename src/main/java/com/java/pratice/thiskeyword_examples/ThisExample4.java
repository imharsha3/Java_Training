package com.java.pratice.thiskeyword_examples;

// Java code for using 'this'
// keyword as method parameter
class ThisExample4 {
    int a;
    int b;

    // Default constructor
    ThisExample4()
    {
        a = 10;
        b = 20;
    }

    // Method that receives 'this' keyword as parameter
    void display(ThisExample4 obj)
    {
        System.out.println("a = " + obj.a
                + " b = " + obj.b);
    }

    // Method that returns current class instance
    void get() { display(this); }

    // main function
    public static void main(String[] args)
    {
        ThisExample4 object = new ThisExample4();
        object.get();
    }
}

