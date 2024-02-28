package com.java.pratice.collection_examples.set_examples;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo2 {
    public static void main(String[] args)
    {

        // Instantiate an object of Set
        // Since LinkedHashSet implements Set
        // Set points to LinkedHashSet
        Set<String> hs = new LinkedHashSet<String>();

        // Adding elements to above Set
        // using add() method
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");

        // Iterating though the LinkedHashSet
        // using iterators
        Iterator itr = hs.iterator();

        while (itr.hasNext())
            System.out.print(itr.next() + ", ");

        // New line
        System.out.println();

        // Using enhanced for loop for iteration
        for (String s : hs)
            System.out.print(s + ", ");
        System.out.println();
    }
}
