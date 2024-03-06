package com.java.pratice.collection_examples.hashtable_examples;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements to the hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);

        // Getting values from the hashtable
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);

        // Removing elements from the hashtable
        hashtable.remove("B");

        // Enumerating the elements of the hashtable
        for (Map.Entry<String, Integer> e : hashtable.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());
    }
}
