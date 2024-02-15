package com.java.pratice.encapsulation_examples;

class Test{
    protected int i =10;
    private void message(){
        System.out.println("Java");
    }
}

public class Private_Example {
    public static void main(String[] args) {
        Test test= new Test();
        System.out.println(test.i);
    }
}
