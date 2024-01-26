package com.java.pratice.loops;

public class SummationUsingDoWhile {
    public static void main(String[] args) {
        // Initialize variables
        int number = 1;
        int sum = 0;

        // Calculate the sum using do-while loop
        do {
            sum = sum+number;
            number++;
        } while (number <= 15);

        // Display the result
        System.out.println("Summation: " + sum);
    }
}
