package com.java.pratice.string_examples;

public class Teststringcomparison4 {

    public static void main(String args[]){
        String s1="Java";
        String s2="Java";
        String s3="PHP";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
    }
}
