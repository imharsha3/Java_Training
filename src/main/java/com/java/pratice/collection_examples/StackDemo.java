package com.java.pratice.collection_examples;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String args[])
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Java");
        stack.push("C++");
        stack.push("Phyton");
        stack.push(".Net");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
