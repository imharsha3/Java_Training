package com.java.pratice.collection_examples.LinkedList_Examples;

import java.util.LinkedList;

public class LinkedlListSetDemo {
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Java");
        ll.add("AWS");
        ll.add(1, "Phyton");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "C++");

        System.out.println("Updated LinkedList " + ll);
    }
}
