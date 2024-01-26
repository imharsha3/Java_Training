package com.java.pratice.static_examples;

public class NonStaticVariableExample {
    int count=0;//will get memory each time when the instance is created

    NonStaticVariableExample(){
        count++;//incrementing value
        System.out.println(count);
    }

    public static void main(String args[]){
//Creating objects
        NonStaticVariableExample ns1=new NonStaticVariableExample();
        NonStaticVariableExample ns2=new NonStaticVariableExample();
        NonStaticVariableExample ns3=new NonStaticVariableExample();
    }
}
