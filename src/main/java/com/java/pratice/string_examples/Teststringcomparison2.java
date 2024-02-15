package com.java.pratice.string_examples;

public class Teststringcomparison2 {

    public static void main(String args[]) {
        String s1 = "java";
        String s2 = "JAVA";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
}
