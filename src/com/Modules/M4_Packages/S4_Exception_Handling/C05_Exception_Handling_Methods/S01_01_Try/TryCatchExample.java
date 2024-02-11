package com.Modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S01_01_Try;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divideNumbers(10, 0); // This may cause an ArithmeticException
            System.out.println("Result: " + result); // This won't be executed if an exception occurs
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Rest of the program continues after the try-catch block
        System.out.println("Program continues...");
    }

    // A method that may throw an ArithmeticException
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}

// The output of the above program is shown as below
/*
Exception caught: / by zero
Program continues...
 */