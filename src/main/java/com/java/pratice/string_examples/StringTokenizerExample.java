package com.java.pratice.string_examples;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String str ="Hello";

        StringTokenizer stringTokenizer = new StringTokenizer("Hello Java World");
        System.out.println(stringTokenizer.countTokens());

        while(stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.countTokens());

        }
    }
}
