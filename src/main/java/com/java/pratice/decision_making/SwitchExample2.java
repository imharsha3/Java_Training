package com.java.pratice.decision_making;

public class SwitchExample2 {
    public static void main(String[] args)
    {
        // Custom input string
        String Branch = "ECE";
        int year = 2;

        // Switch case
        switch (year) {

            // Case
            case 1:
                System.out.println(
                        "elective courses : Advance english, Algebra");

                // Break statement to hault execution here
                // itself if case is matched
                break;

            // Case
            case 2:

                // Switch inside a switch
                // Nested Switch
                switch (Branch) {

                    // Nested case
                    case "CSE":
                    case "CCE":
                        System.out.println(
                                "elective courses : Machine Learning, Big Data");
                        break;

                    // Case
                    case "ECE":
                        System.out.println(
                                "elective courses : Antenna Engineering");
                        break;

                    // default case
                    // It will execute if above cases does not
                    // execute
                    default:

                        // Print statement
                        System.out.println(
                                "Elective courses : Optimization");
                }
        }
    }
}
