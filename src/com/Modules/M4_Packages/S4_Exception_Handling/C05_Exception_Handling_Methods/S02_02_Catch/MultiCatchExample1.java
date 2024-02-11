package com.Modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S02_02_Catch;

public class MultiCatchExample1 {
    public static void main(String[] args) {
        try {
            // Code that may cause exceptions
            String str = null;
            int result = 10 / 0; // This may cause ArithmeticException

            // Attempting to perform an operation on a null reference
            System.out.println("Length of str: " + str.length()); // This may cause NullPointerException
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            // Catch-all block for any other exception types
            System.out.println("Exception caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        // Rest of the program continues after the try-catch block
        System.out.println("Program continues...");
    }
}

// The output of the above program is shown as below
/*
ArithmeticException caught: / by zero
Program continues...
 */