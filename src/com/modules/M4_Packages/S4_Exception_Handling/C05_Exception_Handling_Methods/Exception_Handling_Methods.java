package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods;

public class Exception_Handling_Methods {
    public static void main(String[] args) {
        try {
            // Code that may cause an exception
            int result = divideNumbers(10, 0);
            String str = null;
            int length = str.length(); // This will cause a NullPointerException
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for handling any other exceptions
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Cleanup code or other operations that must be executed
            System.out.println("Finally block: This code will be executed whether an exception occurs or not.");
        }
    }

    // A method that may throw an ArithmeticException
    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }
}

// The output of the above program is shown as below
/*
ArithmeticException: / by zero
Finally block: This code will be executed whether an exception occurs or not.
 */