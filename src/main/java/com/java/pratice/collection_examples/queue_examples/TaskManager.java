package com.java.pratice.collection_examples.queue_examples;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskManager {
    public static void main(String[] args) {
        Deque<String> dq
                = new ArrayDeque<String>();
        dq.offerLast("task1");
        dq.offerLast("task2");
        dq.offerLast("task3");

        dq.offerFirst("Urgent task");
        dq.offerLast("task4");

        System.out.println("Current tasks:" +dq);
        while(!dq.isEmpty()){
            System.out.println("Processing task:" +dq.pollFirst());
        }
    }
}
