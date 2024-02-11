package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set1.Eight;

public class UnCaughtException_Handled {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            // Handle the exception
            System.err.println("Divide by zero: " + e.getMessage());
        }
    }
}

// The output of the above program is shown as below
/*
Divide by zero: / by zero
 */
/*
In this example, the ArithmeticException is caught using a try and catch block. The program continues its execution, and the exception is handled gracefully.

Consequences of Uncaught Exceptions:
Program Termination: If an uncaught exception occurs, the program will
terminate abruptly, and the stack trace will be printed.

Resource Leak: Uncaught exceptions may leave resources
(like file handles, network connections) unclosed, leading to resource
leaks.

Data Inconsistency: If an exception occurs during a critical
operation (e.g., updating a database), it might lead to data
inconsistency.

Exception handling with try and catch blocks is crucial for maintaining
program stability and providing a mechanism to gracefully handle
unexpected situations.
 */