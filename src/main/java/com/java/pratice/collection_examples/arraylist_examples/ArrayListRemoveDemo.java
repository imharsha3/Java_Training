package com.java.pratice.collection_examples.arraylist_examples;

import java.util.ArrayList;

public class ArrayListRemoveDemo {
    public static void main(String[] args) {

        // create an empty array list
        ArrayList<Integer> arrayList = new ArrayList<>();

        // use add() method to add elements in the arrayList
        arrayList.add(20);
        arrayList.add(15);
        arrayList.add(30);
        arrayList.add(45);

        System.out.println("Size of list: " + arrayList.size());
        // let us print all the elements available in list again
        System.out.println("ArrayList = " + arrayList);

        // Removes element at 3rd position
        arrayList.remove(2);
        System.out.println("Now, Size of list: " + arrayList.size());

        // let us print all the elements available in list again
        System.out.println("ArrayList = " + arrayList);


        ArrayList<String> arrayList1 = new ArrayList<>();

        // use add() method to add elements in the arrayList
        arrayList1.add("A");
        arrayList1.add("B");
        arrayList1.add("C");
        arrayList1.add("D");

        System.out.println("Size of list: " + arrayList1.size());
        // let us print all the elements available in list again
        System.out.println("ArrayList1 = " + arrayList1);

        // Removes element B
        arrayList1.remove("B");

        System.out.println("Now, Size of list: " + arrayList1.size());

        // let us print all the elements available in list again
        System.out.println("ArrayList1 = " + arrayList1);

    }
}
