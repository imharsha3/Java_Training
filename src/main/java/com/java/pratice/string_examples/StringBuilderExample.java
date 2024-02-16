package com.java.pratice.string_examples;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb.toString()); // Output: "Hello world!"

        sb.insert(6, "java ");
        System.out.println(sb.toString()); // Output: "Hello java world!"

        sb.reverse();
        System.out.println(sb.toString());
    }
}
