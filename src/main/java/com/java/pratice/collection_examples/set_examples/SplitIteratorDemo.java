package com.java.pratice.collection_examples.set_examples;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;

public class SplitIteratorDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Apple");
        hashSet.add("Cat");

        Spliterator<String> split = hashSet.spliterator();
        System.out.println("Split Iterator:");
        split.tryAdvance(System.out::println);

        System.out.println("Split Iterator2:");
        split.forEachRemaining(System.out::println);

    }

}
