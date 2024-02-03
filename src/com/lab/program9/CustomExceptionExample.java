package com.lab.program9;

/*
9. Develop a JAVA program to raise a custom exception
(user defined exception) for DivisionByZero using
try, catch, throw and finally.
 */

// Step 1: Define the custom exception
class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Step 2: Create a method that may throw the custom exception
    public static double divide(int numerator, int denominator) throws DivisionByZeroException {
        // Step 3: Check for division by zero
        if (denominator == 0) {
            // Step 4: Throw the custom exception if division by zero is attempted
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        // Step 5: Return the result of the division
        return (double) numerator / denominator;
    }
    public static void main(String[] args) {
        try {
            // Step 6: Demonstrate using the method that may throw the custom exception
            double result = divide(10, 2);
            System.out.println("Result: " + result);

            // Uncomment the line below to test the custom exception
            // double invalidResult = divide(5, 0);
        } catch (DivisionByZeroException e) {
            // Step 7: Catch the custom exception in the main method
            System.err.println("Main method caught an exception: " + e.getMessage());
        } finally {
            // Step 8: Code inside the finally block will always execute
            System.out.println("Finally block executed");
        }
    }
}
// The output of the above program is shown as below:
/*
Result: 5.0
Finally block executed
 */