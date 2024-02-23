package com.java.pratice.collection_examples.LinkedList_Examples;

import java.util.LinkedList;

public class LinkedListToArrayDemo {
    public static void main(String[] args)
            throws IllegalStateException
    {

        // Create object of LinkedList
        LinkedList<Integer> list
                = new LinkedList<Integer>();

        // Add numbers to end of LinkedList
        list.add(23223223);
        list.add(98098090);
        list.add(31516512);
        list.add(56465456);

        // Prints the LinkedList elements
        System.out.println("LinkedList: " + list);

        // Convert LinkedList into an Array the method has
        // no parameter
        Object[] a = list.toArray();

        // Print all elements of the Array
        System.out.print(
                "After converted LinkedList to Array: ");
        for (Object element : a)
            System.out.print(element + " ");
    }
}
