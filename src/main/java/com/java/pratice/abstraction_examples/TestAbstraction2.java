package com.java.pratice.abstraction_examples;

abstract class Subject{
    Subject(){
        System.out.println("In Subject Class");
    }
    abstract void syllabus();

    void learn(){
        System.out.println("Learning");
    }
}

class Java extends Subject{

    void syllabus() {
        System.out.println("Learning Java");
    }
}

public class TestAbstraction2 {
    public static void main(String[] args) {
        Subject s = new Java();
        s.syllabus();
        s.learn();
    }
}
