package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Eight;

/*
Explain the consequences of uncaught exceptions in a Java program.
Discuss the role of try and catch blocks in handling exceptions.
Provide examples demonstrating the use of try and catch blocks.
 */

/*
Handling Uncaught Exceptions in Java:
When an exception occurs in a Java program and it is not caught,
the program's normal flow is disrupted, and the exception is propagated
 up the call stack until it is caught or until the program terminates.
 Uncaught exceptions can lead to program termination, and
 the Java Virtual Machine (JVM) prints information about the exception
 to the console.

Example without Exception Handling:
 */
public class UnCaughtExceptionDemo {
    public static void main(String[] args) {
        // Code that may throw an exception
        int result = 10 / 0;  // ArithmeticException
    }
}
// The output of the above program is shown as below
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Eight.UnCaughtExceptionDemo.main(UnCaughtExceptionDemo.java:23)

Process finished with exit code 1
 */


