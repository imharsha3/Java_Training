package com.java.pratice.string_examples;

public class Teststringcomparison3 {

    public static void main(String args[]){
        String s1="Java";
        String s2="Java";
        String s3=new String("Java");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
    }
}
