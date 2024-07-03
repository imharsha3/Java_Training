package com.java.pratice.java8_examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        sorting_Without_Lambda();
        sorting_with_lambda();
    }

    private static void sorting_with_lambda() {
        List<String> names = Arrays.asList("Java", "AWS", "Phyton");
        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
        System.out.println("Sorted with Lambda: "+names);
    }

    private static void sorting_Without_Lambda() {
        List<String> names = Arrays.asList("Java", "AWS", "Phyton");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        System.out.println("Sorted Names:"+ names);
    }

}
