package com.java.pratice.abstraction_examples;

interface printable{
    void print();
}
class Interface_Example implements printable{
    @Override
    public void print() {
        System.out.println("Interface Example");
    }

    public static void main(String[] args) {
        Interface_Example interface_example = new Interface_Example();
        interface_example.print();
    }
}
