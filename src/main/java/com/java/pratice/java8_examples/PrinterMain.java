package com.java.pratice.java8_examples;

import java.util.Arrays;
import java.util.List;

public class PrinterMain{
    public static void main(String[] args) {
        Printer printer = new Printer();
        List<String> messages = Arrays.asList("Hi", "Hello", "How are you?");

        messages.replaceAll(message -> message.toUpperCase());
        //Using Lambda
        messages.forEach(message -> printer.printMessage(message));

        messages.replaceAll(String::toUpperCase);
        //Using a method reference
        messages.forEach(printer::printMessage);
    }
}
