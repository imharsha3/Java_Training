package com.java.pratice.string_examples;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);

        sb.insert(6, "World");
        // Now original string is changed
        System.out.println(sb);

        sb.replace(1, 3, "Java");
        System.out.println(sb);

        sb.delete(1, 3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
