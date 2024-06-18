package com.java.pratice.collection_examples.map_examples;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Police", "911");
        phoneBook.put("Fire", "623");
        phoneBook.put("Ambulance", "108");
        phoneBook.put("Abc", "100");

        System.out.println("Police's number is:"+ phoneBook.get("Police"));
        System.out.println("Fire's number is:"+ phoneBook.get("Fire"));

        phoneBook.remove("Abc");
        System.out.println("Abc's entry:"+phoneBook.get("Abc"));
    }
}
