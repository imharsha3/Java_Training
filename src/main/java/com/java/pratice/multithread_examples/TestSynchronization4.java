package com.java.pratice.multithread_examples;

class StaticSync
{
    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}
class My_Thread1 extends Thread{
    public void run(){
        StaticSync.printTable(1);
    }
}
class My_Thread2 extends Thread{
    public void run(){
        StaticSync.printTable(10);
    }
}
class My_Thread3 extends Thread{
    public void run(){
        StaticSync.printTable(100);
    }
}
class My_Thread4 extends Thread{
    public void run(){
        StaticSync.printTable(1000);
    }
}
public class TestSynchronization4{
    public static void main(String t[]){
        My_Thread1 t1=new My_Thread1();
        My_Thread2 t2=new My_Thread2();
        My_Thread3 t3=new My_Thread3();
        My_Thread4 t4=new My_Thread4();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}