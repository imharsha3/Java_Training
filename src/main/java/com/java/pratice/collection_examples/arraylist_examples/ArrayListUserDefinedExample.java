package com.java.pratice.collection_examples.arraylist_examples;


import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollNumber;
    String studentName;
    int age;
    Student(int rollNumber,String studentName,int age){
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.age=age;
    }
}
public class ArrayListUserDefinedExample {
    public static void main(String args[]){
        //Creating user-defined class objects
        Student s1=new Student(101,"Java",24);
        Student s2=new Student(102,"Phyton",21);
        Student s3=new Student(103,"AWS",25);
        //creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);

        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollNumber +" "+st.studentName +" "+st.age);
        }
    }
}
