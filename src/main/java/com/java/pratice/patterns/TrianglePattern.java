package com.java.pratice.patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int numberOfRows = scanner.nextInt();

        // Print triangle pattern
        for (int i = 1; i <= numberOfRows; i++) {
            // Print spaces
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}

