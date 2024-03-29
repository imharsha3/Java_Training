package com.java.pratice.collection_examples.set_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetSort {
    public static void main(String args[])
    {
        // Creating a HashSet
        HashSet<String> set = new HashSet<String>();

        // Adding elements into HashSet using add()
        set.add("java");
        set.add("c++");
        set.add("aws");
        set.add("phyton");

        System.out.println("Original HashSet: "
                + set);

        // Sorting HashSet using List
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        // Print the sorted elements of the HashSet
        System.out.println("HashSet elements "
                + "in sorted order "
                + "using List: "
                + list);
    }
}
