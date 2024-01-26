package com.java.pratice;

public class Employee {
    String name;
    int id;

    // Parameterized Constructor
    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    Employee(String name)
    {
        this.name = name;
    }

    // Copy Constructor
    Employee(Employee obj2)
    {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
