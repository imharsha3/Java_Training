package com.java.pratice.collection_examples;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class EnumSetExample {
    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);

        // Creating EnumSet using allOf()
        EnumSet<days> day = EnumSet.allOf(days.class);

        // Using remove()
        boolean value1 = day.remove(days.MONDAY);
        // Printing elements to the console
        System.out.println("Is CRICKET removed? " + value1);

        // Traversing elements
        Iterator<days> iter = set.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
