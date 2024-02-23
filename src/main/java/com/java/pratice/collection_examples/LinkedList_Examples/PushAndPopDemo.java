package com.java.pratice.collection_examples.LinkedList_Examples;

import java.util.LinkedList;

public class PushAndPopDemo {
    public static void main(String[] args)
    {

        // Creating a LinkedList object to represent a stack.
        LinkedList<String> stack = new LinkedList<>();

        // Pushing an element in the stack
        stack.push("Java");

        // Pushing an element in the stack
        stack.push("is");
        System.out.println(stack);

        // Pop an element from stack
        String s = stack.pop();

        // Printing the popped element.
        System.out.println(s);

        // Pushing an element in the stack
        stack.push("Powerful");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
}
