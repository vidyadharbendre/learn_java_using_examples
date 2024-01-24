package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Four;

/*
Examine the process of creating custom exception subclasses and demonstrate
their use in handling exceptional situations in Java programs
 */

// Custom exception subclass
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Class that uses the custom exception
class ExceptionDemo {
    // Method that may throw the custom exception
    public void performOperation(int value) throws CustomException {
        if (value < 0) {
            // Throw the custom exception if the condition is met
            throw new CustomException("Negative value not allowed");
        } else {
            // Perform some operation
            System.out.println("Operation performed with value: " + value);
        }
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        // Create an instance of the class
        ExceptionDemo exceptionDemo = new ExceptionDemo();

        try {
            // Call the method that may throw the custom exception
            exceptionDemo.performOperation(5);
            exceptionDemo.performOperation(-3); // This will throw CustomException
        } catch (CustomException e) {
            // Catch and handle the custom exception
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}

// The output of the above program is shown as below
/*
Operation performed with value: 5
Custom Exception Caught: Negative value not allowed
 */