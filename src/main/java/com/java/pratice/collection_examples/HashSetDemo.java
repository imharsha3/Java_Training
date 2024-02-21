package com.java.pratice.collection_examples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Java");
        hs.add("Is");
        hs.add("Powerful");
        hs.add("Java");
        hs.add("Language");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
