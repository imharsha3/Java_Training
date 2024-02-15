package com.java.pratice.string_examples;

public class TestSubstring {
    public static void main(String args[]){
        String s="JavaProgramming";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 6: " +s.substring(4));//Programming
        System.out.println("Substring starting from index 0 to 6: "+s.substring(0,4)); //Java
    }
}
