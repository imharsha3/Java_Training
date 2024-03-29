package com.java.pratice.jump_statements;

public class BreakLoopExample {
    public static void main(String args[])
    {
        BreakWhileExample.test();
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5.
            if (i == 5)
                continue;

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
