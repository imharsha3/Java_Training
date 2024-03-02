package com.java.pratice.collection_examples.map_examples;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String args[]){
        NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
      map.put(100,"Java");
      map.put(102,"AWS");
      map.put(101,"Phyton");
      map.put(103,"C++");
    //Maintains descending order
      System.out.println("descendingMap: "+map.descendingMap());
    //Returns key-value pairs whose keys are less than or equal to the specified key.
      System.out.println("headMap: "+map.headMap(102,true));
    //Returns key-value pairs whose keys are greater than or equal to the specified key.
      System.out.println("tailMap: "+map.tailMap(102,true));
    //Returns key-value pairs exists in between the specified key.
      System.out.println("subMap: "+map.subMap(100, false, 102, true));
}
}
