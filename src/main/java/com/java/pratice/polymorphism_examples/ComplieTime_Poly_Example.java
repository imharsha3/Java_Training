package com.java.pratice.polymorphism_examples;

public class ComplieTime_Poly_Example {

    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(2,3));
        System.out.println(add(2.0,4.0));

    }
}
