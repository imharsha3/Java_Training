package com.java.pratice.collection_examples;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Java");
        ts.add("Is");
        ts.add("Very");
        ts.add("Very");
        ts.add("Helpful");
        ts.add("ABC");

        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
