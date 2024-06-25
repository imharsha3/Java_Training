package com.java.pratice.collection_examples;

import java.util.EnumMap;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Day, String> schedule = new EnumMap<>(Day.class);

        // Adding elements to the EnumMap
        schedule.put(Day.MONDAY, "Work");
        schedule.put(Day.TUESDAY, "Work");
        schedule.put(Day.WEDNESDAY, "Study");
        schedule.put(Day.THURSDAY, "Study");
        schedule.put(Day.FRIDAY, "Relax");

        // Getting elements from the EnumMap
        System.out.println(schedule.get(Day.MONDAY)); // Output: Work
        System.out.println(schedule.get(Day.FRIDAY)); // Output: Relax
    }
}

