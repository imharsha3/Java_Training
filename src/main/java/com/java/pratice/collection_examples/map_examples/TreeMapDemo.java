package com.java.pratice.collection_examples.map_examples;

import java.util.TreeMap;

public class TreeMapDemo {
    static void Example1stConstructor()
    {
        // Creating an empty TreeMap
        TreeMap<Integer, String> tree_map
                = new TreeMap<Integer, String>();

        // Mapping string values to int keys
        // using put() method
        tree_map.put(10, "Java");
        tree_map.put(25, "Welcomes");
        tree_map.put(30, "You");
        tree_map.put(5,"Hi.");

        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        System.out.println("TreeMap using "
                + "TreeMap() constructor:\n");

        // Calling constructor
        Example1stConstructor();
    }
}
