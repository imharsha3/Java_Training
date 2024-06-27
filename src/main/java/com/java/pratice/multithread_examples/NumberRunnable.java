package com.java.pratice.multithread_examples;

public class NumberRunnable implements Runnable{
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}
