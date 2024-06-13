package com.java.pratice.collection_examples.set_examples;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithComparator {
    public static void main(String[] args) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int length = Integer.compare(s1.length(), s2.length());
                if(length == 0){
                    return s1.compareTo(s2);
                }
                return length;
            }
        };

        TreeSet<String> treeSet = new TreeSet<>(comparator);

        treeSet.add("Date");
        treeSet.add("Apple");
        treeSet.add("Fig");
        treeSet.add("Pistachios");
        treeSet.add("Cashew");
        treeSet.add("Banana");

        System.out.println("TreeSet sorted by length:" +treeSet);

    }
}
