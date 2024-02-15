package com.java.pratice.string_examples;

public class CompareToExample2 {
    public static void main(String argvs[])
    {

// input string in uppercase
        String st1 = new String("INDIA IS MY COUNTRY");

// input string in lowercase
        String st2 = new String("india is my country");

        System.out.println(st1.compareToIgnoreCase(st2));
    }
}
