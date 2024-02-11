package com.Modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S04_04_Throw;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            validateAge(25);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Custom exception class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // Method that throws a custom exception using 'throw'
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}

// The output of the above program is shown as below
/*
Exception caught: Age must be 18 or older.
 */

/*
Valid age: 25
 */