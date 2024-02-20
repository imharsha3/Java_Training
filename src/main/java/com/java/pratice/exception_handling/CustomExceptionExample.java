package com.java.pratice.exception_handling;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}

public class CustomExceptionExample {

    static void validateAge(int age) throws InvalidAgeException {
        if(age < 18)
        throw new InvalidAgeException(" Age is not valid for vote");
        else
            System.out.println("You can Vote");
    }

    public static void main(String[] args) {
        try {
            validateAge(12);
        }
        catch (InvalidAgeException invalidAgeException){
            System.out.println("Exception caught "+invalidAgeException);
        }
    }
}
