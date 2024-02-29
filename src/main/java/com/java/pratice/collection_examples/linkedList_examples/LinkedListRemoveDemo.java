package com.java.pratice.collection_examples.linkedList_examples;

import java.util.LinkedList;

public class LinkedListRemoveDemo {
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Java");
        ll.add("Phyton");
        ll.add(1, "AWS");

        System.out.println("Initial LinkedList " + ll);

        // Function call
        ll.remove(1);

        System.out.println("After the Index Removal " + ll);

        ll.remove("Phyton");

        System.out.println("After the Object Removal "
                + ll);
    }
}
