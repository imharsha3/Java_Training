package com.java.pratice.multithread_examples;

public class ThreadJoinExample {
    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample("Thread 1");
        ThreadExample thread2 = new ThreadExample("Thread 2");
        ThreadExample thread3 = new ThreadExample("Thread 3");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads are completed.");
    }
}
