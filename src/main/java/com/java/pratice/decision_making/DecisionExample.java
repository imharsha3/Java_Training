package com.java.pratice.decision_making;

public class DecisionExample {

    public static void main(String[] args) {
       exampleOfIF("CAT");
       exampleOfSwitch("TIGER");
    }


    public static void exampleOfIF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            System.out.println("domestic animal");
        } else if (animal.equals("TIGER")) {
            System.out.println("wild animal");
        } else {
            System.out.println("unknown animal");
        }
    }

    public static void exampleOfSwitch(String animal) {
        switch (animal) {
            case "DOG":
                System.out.println("domestic animal");
                break;
            case "CAT":
                System.out.println("domestic animal");
            case "TIGER":
                System.out.println("wild animal");
                break;
            default:
                System.out.println("unknown animal");
                break;
        }
    }
}
