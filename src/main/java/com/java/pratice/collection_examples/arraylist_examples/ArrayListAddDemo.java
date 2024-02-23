package com.java.pratice.collection_examples.arraylist_examples;

import java.util.ArrayList;

public class ArrayListAddDemo {
    public static void main(String args[])
    {
        // Creating an Array of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom inputs
        al.add("Java");
        al.add("Powerful");

        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "Is");

        // Printing all the elements in an ArrayList
        System.out.println(al);
    }
}
