package com.java.pratice.java8_examples;

import java.util.Arrays;

public class ParallelSortExample {
    public static void main(String[] args)
    {
        // Creating an array
        int numbers[] = { 9, 8, 7, 6, 3, 1 };

        // Printing unsorted Array
        System.out.print("Unsorted Array: ");
        // Iterating the Elements using stream
        Arrays.stream(numbers)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Using Arrays.parallelSort()
        Arrays.parallelSort(numbers);

        // Printing sorted Array
        System.out.print("Sorted Array: ");
        // Iterating the Elements using stream
        Arrays.stream(numbers)
                .forEach(n -> System.out.print(n + " "));
    }
}
