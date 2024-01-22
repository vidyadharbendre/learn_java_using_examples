package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S03_03_Finally;

public class FinallyExample3 {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divideNumbers(10, 2);
            System.out.println("Result: " + result);
        } finally {
            // Code in the finally block will always be executed
            System.out.println("Finally block: This code will be executed whether an exception occurs or not.");
        }

        // Rest of the program continues after the try-finally block
        System.out.println("Program continues...");
    }

    // A method that may throw an ArithmeticException
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}

// The output of the above program is shown as below:
/*
Result: 5
Finally block: This code will be executed whether an exception occurs or not.
Program continues...
 */