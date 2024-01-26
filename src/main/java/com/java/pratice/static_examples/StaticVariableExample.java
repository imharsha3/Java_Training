package com.java.pratice.static_examples;

public class StaticVariableExample {
    static int count=1;//will get memory only once and retain its value

    StaticVariableExample(){
        count++;//incrementing value
        System.out.println(count);
        count =1;
    }

    public static void main(String args[]){
//Creating objects
        StaticVariableExample s1=new StaticVariableExample();
        StaticVariableExample s2=new StaticVariableExample();
        StaticVariableExample s3=new StaticVariableExample();
    }
}
