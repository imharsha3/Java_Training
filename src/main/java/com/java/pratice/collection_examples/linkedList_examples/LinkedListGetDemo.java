package com.java.pratice.collection_examples.linkedList_examples;

import java.util.LinkedList;

public class LinkedListGetDemo {
    public static void main(String args[])
    {
        LinkedList<String> ll
                = new LinkedList<>();

        ll.add("Java");
        ll.add("Phyton");
        ll.add(1, "C++");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : ll)
            System.out.print(str + " ");
    }
}
