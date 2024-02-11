package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.Nine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Exception Handling in Java:
Exception handling is a mechanism in Java that deals with runtime errors, enabling a program to respond to unexpected situations gracefully. It involves the use of try, catch, throw, and finally blocks.

Try Block: Contains the code where an exception might occur.

Catch Block: Catches and handles exceptions thrown in the try block.

Throw Statement: Explicitly throws an exception.

Finally Block: Contains code that is always executed, regardless of whether an exception occurred.

Types of Exceptions:
1. Checked Exceptions (Compile-Time Exceptions):
Checked exceptions are checked by the compiler during compile-time.
The programmer is required to handle or declare checked exceptions using the throws clause.

2. Unchecked Exceptions (Runtime Exceptions):
Unchecked exceptions are not checked at compile-time; they occur at runtime.
The programmer is not forced to handle or declare unchecked exceptions.

Distinguishing Checked vs. Unchecked Exceptions:
Checked Exceptions:

Extend Exception class (directly or indirectly).
Examples: IOException, SQLException, etc.
Require mandatory handling or declaration in the code.
Unchecked Exceptions:

Extend RuntimeException class (directly or indirectly).
Examples: NullPointerException, ArrayIndexOutOfBoundsException, etc.
Handling is optional; can be handled if desired.
Best Practices for Exception Handling:
Handle Specific Exceptions: Handle exceptions based on specific error conditions rather than catching a generic Exception.

Use Multiple Catch Blocks: Use separate catch blocks for different types of exceptions.

Avoid Catching Throwable: Avoid catching Throwable unless absolutely necessary.

Use Finally Sparingly: Use finally block cautiously and avoid using it for cleanup tasks that can be handled with try-with-resources or other mechanisms.

Logging: Log exceptions to aid debugging and troubleshooting.
 */


public class CheckedExample {
    public static void main(String[] args) {
        try {
            BufferedReader brRefObj;
            brRefObj = new BufferedReader(new FileReader("example.txt"));
            String line = brRefObj.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

