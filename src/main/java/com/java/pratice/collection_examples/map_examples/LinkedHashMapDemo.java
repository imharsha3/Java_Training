package com.java.pratice.collection_examples.map_examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args)
    {

        // Creating an empty LinkedHashMap
        Map<String, Integer> map = new LinkedHashMap<>();

        // Inserting pair entries in above Map
        // using put() method
        map.put("dhoni", 10);
        map.put("sachin", 30);
        map.put("virat", 20);
        map.put("Abc", 40);

        System.out.println("Linked HashMap:" +map);
        map.remove("Abc");
        // Iterating over Map
        for (Map.Entry<String, Integer> e : map.entrySet())

            // Printing key-value pairs
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}
