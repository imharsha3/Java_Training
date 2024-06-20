package com.java.pratice.collection_examples.map_examples;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Students{
    private String name;
    private double grade;

    public Students(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

class GradeComparator implements Comparator<Students>{

    @Override
    public int compare(Students s1, Students s2) {
        if(s1.getGrade() > s2.getGrade()){
            return -1;
        }else if(s1.getGrade() < s2.getGrade()){
            return 1;
        }else {
            return s1.getName().compareTo(s2.getName());
        }
    }
}

public class StudentGradeProgram {
    public static void main(String[] args) {
        TreeMap<Students, String> studentsTreeMap = new TreeMap<>(new GradeComparator());

        studentsTreeMap.put(new Students("Java", 90.1), "Computers");
        studentsTreeMap.put(new Students("C++", 70.6), "English");
        studentsTreeMap.put(new Students("Maths", 97.9), "Mathematics");
        studentsTreeMap.put(new Students("History", 60.2), "History");
        studentsTreeMap.put(new Students("Abc", 97.9), "Mathematics");

        for(Map.Entry<Students, String> entry : studentsTreeMap.entrySet()){
            System.out.println(entry.getKey() + "-Subject:" + entry.getValue());
        }
    }
}
