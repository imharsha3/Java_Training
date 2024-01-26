package com.java.pratice.static_examples;

public class StudentStatic {
    String name;
    int rollNo;

    // static variable
    static String collegeName;

    // static counter to set unique roll no
    static int counter = 0;

    public StudentStatic(String name)
    {
        this.name = name;

        this.rollNo = setRollNo();
    }

    // getting unique rollNo
    // through static variable(counter)
    static int setRollNo()
    {
        counter++;
        return counter;
    }

    // static method
    static void setCollegeName(String name) { collegeName = name; }

    // instance method
    void getStudentInfo()
    {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);

        // accessing static variable
        System.out.println("college Name : " + collegeName);
    }
}
