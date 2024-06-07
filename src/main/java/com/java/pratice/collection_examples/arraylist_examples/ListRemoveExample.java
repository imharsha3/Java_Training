package com.java.pratice.collection_examples.arraylist_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListRemoveExample {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("India");
        arrayList.add("UK");
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("US");

        System.out.println("Original List:" + arrayList);

        Iterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == null) {
                iterator.remove();
            }
        }
        System.out.println("List after removal:" + arrayList);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ant");
        arrayList2.add(null);
        arrayList2.add("Dog");
        arrayList2.add(null);
        arrayList2.add("Cat");
        System.out.println("Original List2:" + arrayList2);

        arrayList2.removeAll(Collections.singleton(null));
        System.out.println("List2 after removal:" + arrayList2);

    }
}
