package com.java.pratice.collection_examples.set_examples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args)
    {
        // Creating a Set interface with reference to
        // TreeSet
        Set<String> ts1 = new TreeSet<>();

        // Elements are added using add() method
        ts1.add("A");
        ts1.add("C");
        ts1.add("D");

        // Duplicates will not get insert
        ts1.add("B");

        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
    }
}
