package com.java.pratice.collection_examples.linkedList_examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayListToLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("India");
        arrayList.add("UK");
        arrayList.add("US");
        System.out.println("Original List:" + arrayList);

        LinkedList<String> list = new LinkedList<>(arrayList);
        System.out.println("Linked list:"+list);
    }
}
