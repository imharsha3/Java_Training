package com.java.pratice.collection_examples.map_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapComputeDemo {
    public static void main(String[] args)
    {

        // Create a Map and add some values
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Java");
        map.put("Address", "Texas");

        // Print the map
        System.out.println("Map: " + map);

        // remap the values using compute() method
        map.compute("Name", (key, val) -> val.concat(" AWS"));
        map.compute("Address", (key, val) -> val.concat(" United-States"));

        // print new mapping
        System.out.println("New Map: " + map);
    }
}
