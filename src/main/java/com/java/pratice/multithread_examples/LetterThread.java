package com.java.pratice.multithread_examples;

public class LetterThread extends Thread{
    @Override
    public void run() {

        try{
            for(char ch='A'; ch <= 'E'; ch++){
                System.out.println(ch);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}
