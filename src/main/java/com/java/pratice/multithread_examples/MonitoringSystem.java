package com.java.pratice.multithread_examples;

class Task implements Runnable{

    private final String taskName;
    private final int priority;

    Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }

    @Override
    public void run() {
        try{
            for(int i=0; i< 5 ; i++){
                System.out.println(taskName+" with priority "+priority+ " is running");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MonitoringSystem {
    public static void main(String[] args) {
        Thread high = new Thread(new Task("High-priority Task", Thread.MAX_PRIORITY));
        Thread medium = new Thread(new Task("Medium-priority Task", Thread.NORM_PRIORITY));
        Thread low = new Thread(new Task("Low-priority task", Thread.MIN_PRIORITY));

        high.setPriority(Thread.MAX_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        low.start();
        medium.start();
        high.start();
    }
}
