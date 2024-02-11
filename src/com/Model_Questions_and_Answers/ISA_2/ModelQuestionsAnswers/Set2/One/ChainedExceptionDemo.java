package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.One;

/*
13.	Explain the process of creating custom exception subclasses in Java.
Discuss the concept of chained exceptions and how they can be used to link
multiple exceptions.
Provide examples demonstrating the creation and use of custom exception
subclasses and chained exceptions
 */

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        int result;
        try {
            // Simulate an exception
            result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            // Create a custom exception and chain it with the ArithmeticException
            MyChainedException chainedExceptionRefObj;
            chainedExceptionRefObj = new MyChainedException("Error in calculation", e);

            // Throw the chained exception
            throw chainedExceptionRefObj;
        }
    }
}

// Custom chained exception subclass
class MyChainedException extends RuntimeException {
    MyChainedException(String message, Throwable cause) {
        super(message, cause);
    }
}

