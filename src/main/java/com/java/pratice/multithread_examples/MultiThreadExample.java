package com.java.pratice.multithread_examples;

public class MultiThreadExample {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();

        t1.start();
        t2.start();
    }
}
