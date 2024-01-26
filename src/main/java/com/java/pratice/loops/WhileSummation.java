package com.java.pratice.loops;

public class WhileSummation {
    public static void main(String args[])
    {
        int i = 1, sum = 0;

        // Exit when x becomes greater than 4
        while (i <= 15) {
            // summing up x
            sum = sum + i;

            // Increment the value of x for
            // next iteration
            i++;
        }
        System.out.println("Summation: " + sum);
    }
}
