package com.java.pratice.patterns;

public class RightTrianglePattern {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

