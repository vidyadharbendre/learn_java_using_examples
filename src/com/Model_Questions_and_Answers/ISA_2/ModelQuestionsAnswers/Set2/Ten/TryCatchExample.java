package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.Ten;

/*

Consequences of Uncaught Exceptions:
When an exception occurs in a Java program and is not caught and handled properly, several consequences can arise:

Program Termination: If an uncaught exception occurs, the program will terminate abruptly, and the remaining code in the call stack may not get executed.

Resource Leaks: Uncaught exceptions may lead to resource leaks, as cleanup code (e.g., closing files, releasing resources) in finally blocks or other cleanup mechanisms may not be executed.

Incomplete Operations: If an exception interrupts an operation that modifies data, it may leave the data in an inconsistent or incomplete state.

Poor User Experience: In applications with a user interface, an uncaught exception might result in an error message or crash, providing a poor user experience.

Role of Try and Catch Blocks:
The try and catch blocks play a crucial role in exception handling in Java:

Try Block:

The try block encloses the code where an exception might occur.
It is followed by one or more catch blocks.
Catch Block:

A catch block catches and handles exceptions thrown in the associated try block.
Each catch block is associated with a specific type of exception.
Multiple catch blocks can be used to handle different types of exceptions.

 */
public class TryCatchExample {
    public static void main(String[] args) {
        int result;
        try {
            // Code that might throw an exception
            result = divide(10, 0);
            System.out.println("Result: " + result); // This line won't be executed if an exception occurs
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code in the finally block is always executed, regardless of whether an exception occurred
            System.out.println("Finally block executed");
        }

        // The program continues to execute after the try-catch-finally block
        System.out.println("Program continues...");
    }

    // A method that might throw an exception
    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

// The output of the above program is shown as below
/*
Exception caught: / by zero
Finally block executed
Program continues...
 */