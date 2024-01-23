package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.One;

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

