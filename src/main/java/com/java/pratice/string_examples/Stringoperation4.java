package com.java.pratice.string_examples;

public class Stringoperation4 {

    public static void main(String ar[])
    {
        String s=new String("Java");
        String s2=s.intern();
        System.out.println(s2);//Java
    }
}
