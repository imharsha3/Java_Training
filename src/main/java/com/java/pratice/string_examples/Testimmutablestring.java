package com.java.pratice.string_examples;

public class Testimmutablestring {
    public static void main(String args[]){
        String s="Java";
        s=s.concat(" Programming");//concat() method appends the string at the end
        System.out.println(s);//will print Java because strings are immutable objects
    }
}
