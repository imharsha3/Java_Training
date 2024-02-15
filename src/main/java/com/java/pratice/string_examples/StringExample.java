package com.java.pratice.string_examples;

public class StringExample{
    public static void main(String args[]){
        String s1="java";//creating string by Java string literal
        char ch[]={'j','a','v','a'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
