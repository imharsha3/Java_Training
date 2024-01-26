package com.java.pratice.loops;

public class ForSummation {
    public static void main(String args[])
    {
        int sum = 0;

        for (int i = 1; i <= 15; i++) {
            sum = sum + i;
        }
        System.out.println("Summation: " + sum);
    }
}
