package com.java.pratice.multithread_examples;

public class LetterRunnable implements Runnable{
    @Override
    public void run() {
        try{
            for(char ch='A'; ch <= 'E'; ch++){
                System.out.println(ch);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
