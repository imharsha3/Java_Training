package com.java.pratice.patterns;

import java.util.Scanner;

public class ZeroOneTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the zero-one triangle pattern:");
        int rows = scanner.nextInt();

        System.out.println("Zero-One Triangle Pattern:");

        // Outer loop for the number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing 0s and 1s
            for (int j = 1; j <= i; j++) {
                // Alternate between 0 and 1
                System.out.print(j % 2 + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}

