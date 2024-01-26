package com.java.pratice;

public class Student {
    private int id;
    private String name;
    private String department;

    public int getId()    //getter method
    {
        return id;
    }
    public void setId(int id) //setter method
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void display()
    {
        System.out.println("Roll no.: "+id);
        System.out.println("Student name: "+name);
        System.out.println("Department Name:"+department);
    }

}
