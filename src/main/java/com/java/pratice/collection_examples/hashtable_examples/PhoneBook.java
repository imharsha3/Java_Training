package com.java.pratice.collection_examples.hashtable_examples;

import java.util.Enumeration;
import java.util.Hashtable;

public class PhoneBook {
    public static void main(String[] args) {
        Hashtable<String, String> phoneBook = new Hashtable<>();

        phoneBook.put("Java", "100");
        phoneBook.put("AWS", "108");
        phoneBook.put("C++","911");
        phoneBook.put("Phyton","123");

        System.out.println("Enumeration keys:");
        Enumeration<String> keys = phoneBook.keys();
        while(keys.hasMoreElements()){
          System.out.println("Name:" +keys.nextElement());
        }

        Enumeration<String> elements = phoneBook.elements();
        while(elements.hasMoreElements()){
            System.out.println("Name:" +elements.nextElement());
        }

        System.out.println("Enumerating key-value pairs:");
        Enumeration<String> enums = phoneBook.keys();
        while(enums.hasMoreElements()){
            String key = enums.nextElement();
            String value = phoneBook.get(key);
            System.out.println("Name:" +key+ ",Phone Number:" +value);
        }
    }
}
