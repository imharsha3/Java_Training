package com.java.pratice.patterns;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        // Outer loop for the number of rows
        for (int i = rows; i >= 1; i--) {
            // Inner loop for printing spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for printing stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

