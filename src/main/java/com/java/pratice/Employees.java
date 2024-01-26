package com.java.pratice;

public class Employees {
    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Employee employee1 = new Employee("Java", 100);
        System.out.println("Employee Name :" + employee1.name
                + " and  Employee Id :" + employee1.id);

        Employee employee2 = new Employee("Phyton", 101);
        System.out.println("Employee Name :" + employee2.name
                + " and Employee Id :" + employee2.id);

        // This would invoke the copy constructor.
        Employee employee3 = new Employee(employee1);
        System.out.println("Employee Name :" + employee3.name
                + " and Employee Id :" + employee3.id);

        Employee emp4 = new Employee("C++");
        System.out.println(emp4.name);
    }
}
