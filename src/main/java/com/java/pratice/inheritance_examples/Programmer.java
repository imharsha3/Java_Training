package com.java.pratice.inheritance_examples;

class Employee {
    float salary=45000;
}

public class Programmer extends Employee {
    int bonus=10000;
    public static void main(String args[]){
        Programmer programmer =new Programmer();
        System.out.println("Programmer salary is:"+ programmer.salary);
        System.out.println("Bonus of Programmer is:"+ programmer.bonus);
    }
}
