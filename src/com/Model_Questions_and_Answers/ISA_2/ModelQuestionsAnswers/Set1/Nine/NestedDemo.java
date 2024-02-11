package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set1.Nine;
/*
Concept of Nested Try Statements:

Nested try statements involve placing one or more try-catch blocks inside
another try or catch block.
This is particularly useful when different parts of your code require
specific exception handling.

Example of Nested Try Statements:
 */
public class NestedDemo {
    public static void main(String[] args) {
        int result;
        try {
            // Outer try block
            System.out.println("Outer Try Block");
            try {
                // Nested try block
                System.out.println("Nested Try Block");
                result = divide(10, 0);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception (Nested): " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("General Exception (Outer): " + e.getMessage());
        }
    }

    // A method that may throw exceptions
    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

// The output of the above program is shown as below:
/*
Outer Try Block
Nested Try Block
Arithmetic Exception (Nested): / by zero
 */

/*
In this example, the nested try block handles the ArithmeticException
specifically, providing a more localized approach to exception
handling within the broader context of the outer try-catch block.

The outer catch block acts as a fallback for any unhandled exceptions
in the outer try block or the nested try block.
 */