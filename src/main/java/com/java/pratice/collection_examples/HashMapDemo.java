package com.java.pratice.collection_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[])
    {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm
                = new HashMap<Integer, String>();

        hm.put(1, "Java");
        hm.put(2, "C++");
        hm.put(3, "Phyton");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}
