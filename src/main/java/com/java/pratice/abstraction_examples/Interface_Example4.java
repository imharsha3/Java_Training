package com.java.pratice.abstraction_examples;

interface Printable{

}

interface Printable2{
    void print();
}

public class Interface_Example4 implements Printable,Printable2{
    public static void main(String[] args) {
        Interface_Example4 interface_example4 = new Interface_Example4();
        interface_example4.print();
    }

    @Override
    public void print() {
        System.out.println("Multiple Inheritance Example");
    }
}
