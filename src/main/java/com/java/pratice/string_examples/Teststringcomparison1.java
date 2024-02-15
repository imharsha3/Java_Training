package com.java.pratice.string_examples;

public class Teststringcomparison1 {
    public static void main(String args[]) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "Phyton";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
    }
}