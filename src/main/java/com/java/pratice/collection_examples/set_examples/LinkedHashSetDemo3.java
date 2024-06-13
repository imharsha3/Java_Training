package com.java.pratice.collection_examples.set_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo3 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet();

        set.add(4);
        set.add(1);
        set.add(3);
        set.add(10);
        set.add(2);

        System.out.println("Linked Hashset values" +set);

        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list);
        System.out.println("List values after sort"+list);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("Linked Hashset values post sorting" +set2);

    }
}
