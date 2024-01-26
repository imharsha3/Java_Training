package com.java.pratice.inheritance_examples;

class Vehicle {
    public Vehicle(){
        System.out.println("Class Vehicle");
    }
    public void type() {
        System.out.println("Type: Vehicle");
    }
}
class Car extends Vehicle {
    public Car() {
        System.out.println("Class Car");
    }
    public void category() {
        System.out.println("Category - Car");
    }
}
class SUV extends Car {
    public SUV() {
        System.out.println("Class SUV");
    }
    public void car_model() {
        System.out.println("Car Model- SUV");
    }
}
public class MultiLevel_Inheritance {
    public static void main(String[] arguments) {
        SUV suv= new SUV();
        suv.type();;
        suv.category();
        suv.car_model();
    }
}
