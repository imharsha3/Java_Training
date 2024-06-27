package com.java.pratice.multithread_examples;

class NumberThread extends Thread{
    @Override
    public void run() {
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
    }
}
