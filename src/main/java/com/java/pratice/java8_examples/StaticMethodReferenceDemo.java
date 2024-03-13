package com.java.pratice.java8_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {

    private String name;
    private Integer age;

    // Constructor
    public Person(String name, int age)
    {
        // This keyword refers to current instance itself
        this.name = name;
        this.age = age;
    }

    // Getter-setters
    public Integer getAge() { return age; }
    public String getName() { return name; }
}

public class StaticMethodReferenceDemo {

    // Static method to compare with name
    public static int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    // Method 2
    // Static method to compare with age
    public static int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }

    // Method 3
    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of user-defined type
        // List of person
        List<Person> personList = new ArrayList<>();

        // Adding elements to above List
        // using add() method
        personList.add(new Person("java", 18));
        personList.add(new Person("phyton", 25));
        personList.add(new Person("aws", 20));

        // Using static method reference to
        // sort array by name
        Collections.sort(personList, StaticMethodReferenceDemo::compareByName);

        // Display message only
        System.out.println("Sort by name :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);

        // Now using static method reference
        // to sort array by age
        Collections.sort(personList, StaticMethodReferenceDemo::compareByAge);

        // Display message only
        System.out.println("Sort by age :");

        // Using streams over above object of Person type
        personList.stream()
                .map(x -> x.getName())
                .forEach(System.out::println);
    }
}
