package com.java.pratice.collection_examples.set_examples;

import java.util.Collections;
import java.util.HashSet;

public class HashSetMax {
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(50);
        set.add(40);

        int max = -1;

        // Iterate HashSet to get Maximum value
        for (int val : set) {
            if (max == -1) {
                max = val;
            }
            else if (val > max) {
                max = val;
            }
        }
        System.out.println("Maximum value of HashSet : "
                + max);

        // Print Maximum value using max method of
        // Collections class
        System.out.println("Maximum value of HashSet : "
                + Collections.max(set));
    }
}
