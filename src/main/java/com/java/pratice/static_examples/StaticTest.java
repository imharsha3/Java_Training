package com.java.pratice.static_examples;

public class StaticTest {
    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class
        StudentStatic.setCollegeName("XYZ");

        StudentStatic s1 = new StudentStatic("Java");
        StudentStatic s2 = new StudentStatic("Phyton");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}
