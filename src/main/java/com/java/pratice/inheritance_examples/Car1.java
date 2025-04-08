package com.java.pratice.inheritance_examples;

public class Car1 {
    public int gear;
    public int speed;

    Car1(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBreak(){
        speed = speed-10;
        gear--;
        System.out.println("Speed is:"+speed + "Gear:"+gear);
    }

    public void applyAcc(){
        speed = speed+10;
        gear++;
        System.out.println("Speed is:"+speed + "Gear:"+gear);

    }
}

class Volvo extends Car1{

    public int year;

    Volvo(int gear, int speed, int year) {
        super(gear, speed);
        this.year= year;
    }

    Volvo volvo1 = new Volvo(5,60,2024);
}
