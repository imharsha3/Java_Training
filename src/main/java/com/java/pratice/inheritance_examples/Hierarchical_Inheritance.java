package com.java.pratice.inheritance_examples;

class Cars{
    void type(){System.out.println("car...");}
}
class BMW extends Cars{
    void model(){System.out.println("BMW X1...");}
}
class Audi extends Cars{
    void make(){System.out.println("Audi Q6...");}
}
class Hierarchical_Inheritance {
    public static void main(String args[]) {
        Audi audi = new Audi();
        audi.make();
        audi.type();

    }
}
