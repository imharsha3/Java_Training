package com.java.pratice.multithread_examples;

public class MultiThreadExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberRunnable());
        Thread t2 = new Thread(new LetterRunnable());

        t1.start();
        t2.start();
    }
}
