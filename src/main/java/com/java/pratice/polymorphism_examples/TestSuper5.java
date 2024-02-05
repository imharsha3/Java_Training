package com.java.pratice.polymorphism_examples;

class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
}

class Employees extends Employee{
    float salary;
    Employees(int id,String name,float salary){
        super(id,name);
        this.salary=salary;
    }
    void display(){
        System.out.println(id+","+name+","+","+salary);
    }
}

public class TestSuper5 {
    public static void main(String[] args) {
        Employees emp = new Employees(100,"Java",10000f);
        Employees emp2 = new Employees(101,"Phyton",12000f);
        emp.display();
        emp2.display();
    }
}
