package com.java.pratice.inheritance_examples;

//Aggregation Example
class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
public class Employee1 {
    int id;
    String name;
    Address address;

    public Employee1(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1=new Address("Hyd","TS","India");
        Address address2=new Address("VJA","AP","India");
        Address address3=new Address("Mumbai","MH","India");

        Employee1 e=new Employee1(111,"Java",address1);
        Employee1 e2=new Employee1(112,"Phyton",address2);
        Employee1 e3 = new Employee1(113,"C++",address2);
        Employee1 e4 = new Employee1(114,"AWS",address3);

        e.display();
        e2.display();
        e3.display();
        e4.display();

    }
}
