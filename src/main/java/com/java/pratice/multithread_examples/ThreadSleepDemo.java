package com.java.pratice.multithread_examples;

public class ThreadSleepDemo extends Thread{
    public void run()
    {
        // thread 0

        // we can also use throws keyword followed by
        // exception name for throwing the exception
        try {
            for (int i = 0; i < 5; i++) {

                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                Thread.sleep(1000);

                // This Thread.sleep() method will sleep the
                // thread 0.
                // printing the value of the variable
                System.out.println(Thread.currentThread().getName()+""+i);
            }
        }
        catch (Exception e) {

            // catching the exception
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // main thread
        ThreadSleepDemo threadSleepDemo = new ThreadSleepDemo();
        threadSleepDemo.start();

        Thread.sleep(500);

        ThreadSleepDemo threadSleepDemo1 = new ThreadSleepDemo();
        threadSleepDemo1.start();
    }
}
