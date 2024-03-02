package com.java.pratice.collection_examples.map_examples;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String args[]){
        SortedMap<Integer,String> map=new TreeMap<Integer,String>();
        map.put(100,"Java");
        map.put(102,"Phyton");
        map.put(101,"AWS");
        map.put(103,"C++");
        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+map.headMap(102));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(102));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(100, 102));
    }
}
