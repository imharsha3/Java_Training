package com.java.pratice.java8_examples;

// functional interface
// without parameters
interface Test1 {
    void print();
}

public class LambdaDemo {
    // functional interface parameter is passed
    static void fun(Test1 t) {
        t.print();
    }
    public static void main(String[] args)
    {
        // lambda expression is passed
        // without parameter to functional interface t
        fun(() -> System.out.println("Hello"));
    }
}
