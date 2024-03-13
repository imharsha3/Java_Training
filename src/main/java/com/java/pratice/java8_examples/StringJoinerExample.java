package com.java.pratice.java8_examples;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner joinNames = new StringJoiner(",");// passing comma(,) as delimiter

        // Adding values to StringJoiner
        joinNames.add("Java");
        joinNames.add("AWS");
        joinNames.add("Phyton");
        joinNames.add("Azure");

        System.out.println(joinNames);
    }
}

