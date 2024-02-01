package com.java.pratice.patterns;

public class DiamondStarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows as needed

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            // Spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

