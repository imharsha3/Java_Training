package com.java.pratice.polymorphism_examples;

public class InstanceOf_Example3 {
}

class InstanceOf_Example4 extends InstanceOf_Example3{

}

class InstanceOf_Test{
    public static void main(String[] args) {
        InstanceOf_Example4 ie = new InstanceOf_Example4();
        if(ie instanceof InstanceOf_Example3){
            System.out.println("IE is instance of InstanceOf_Example4");
        }
        else
            System.out.println("IE is not instance of InstanceOf_Example4");
    }
}
