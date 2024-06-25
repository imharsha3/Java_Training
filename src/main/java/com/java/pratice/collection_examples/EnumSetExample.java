package com.java.pratice.collection_examples;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample {
    public static void main(String[] args) {
        Set<Days> set = EnumSet.of(Days.TUESDAY, Days.WEDNESDAY);

        // Creating EnumSet using allOf()
        EnumSet<Days> day = EnumSet.allOf(Days.class);

        // Using remove()
        boolean value1 = day.remove(Days.MONDAY);
        // Printing elements to the console
        System.out.println("Is CRICKET removed? " + value1);

        // Traversing elements
        Iterator<Days> iter = day.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
