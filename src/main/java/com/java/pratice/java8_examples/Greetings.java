package com.java.pratice.java8_examples;

@FunctionalInterface
interface GreetingService{
    void sayMessage(String message);
}

public class Greetings {
    public static void main(String[] args) {
        GreetingService hi = message -> System.out.println("Hi, " +message);
        GreetingService hello = helloM -> System.out.println("Hello, " + helloM);

        hi.sayMessage("How are you?");
        hello.sayMessage("What'up?");
    }



}
