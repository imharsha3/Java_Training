package com.java.pratice.multithread_examples;

public class ThreadExample extends Thread{
    private String threadName;

    public ThreadExample(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName+ " is starting.");
        try{
            for(int i=1;i <=5;i++){
                System.out.println(threadName+ " is running: "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName+ " is finished.");
    }
}
