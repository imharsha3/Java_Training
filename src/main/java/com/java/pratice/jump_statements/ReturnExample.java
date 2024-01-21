package com.java.pratice.jump_statements;

public class ReturnExample {
    public static int calculateSum(int num1, int num2)
    {
        // Print a message indicating the method has started
        System.out.println("Calculating the sum of " + num1
                + " and " + num2);
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        // Return the calculated sum
        return sum;

    }
    public static void main(String[] args)
    {
        // Call the calculateSum method
        int result = calculateSum(15, 10);

        // Print the result
        System.out.println("Result: " + result);
    }
}
