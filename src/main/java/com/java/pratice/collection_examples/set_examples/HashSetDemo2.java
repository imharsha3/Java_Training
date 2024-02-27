package com.java.pratice.collection_examples.set_examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo2 {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Java");
        list.add("Phyton");
        list.add("AWS");

        HashSet<String> set=new HashSet(list);
        set.add("C++");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
