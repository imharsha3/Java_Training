package com.java.pratice.patterns;

import java.util.Scanner;

public class RightTriangleNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= numRows; i++) {
            // Inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }
}
