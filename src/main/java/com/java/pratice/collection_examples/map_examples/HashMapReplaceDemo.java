package com.java.pratice.collection_examples.map_examples;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplaceDemo {
    public static void main(String args[]){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"C");
        hm.put(101,"CSS");
        hm.put(102,"AWS");
        System.out.println("Initial list of elements:");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(100, "C++");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(101, "CSS", "Phyton");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k,v) -> "Java");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
