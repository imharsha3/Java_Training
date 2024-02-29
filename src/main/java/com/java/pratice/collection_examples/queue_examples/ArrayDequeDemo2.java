package com.java.pratice.collection_examples.queue_examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo2 {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq
                = new ArrayDeque<String>();

        // add() method to insert
        dq.add("is");
        dq.addFirst("Java");
        dq.addLast("powerful");

        System.out.println(dq);

        System.out.println(dq.pop());

        System.out.println(dq.poll());

        System.out.println(dq.pollFirst());

        System.out.println(dq.pollLast());
    }
}
