package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.One;

/*
Explain the process of creating custom exception subclasses in Java.
Discuss the concept of chained exceptions and how they can be used to
link multiple exceptions.
Provide examples demonstrating the creation and use of custom exception
subclasses and chained exceptions.
 */
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // Throw custom exception
            throw new MyCustomException("This is a custom exception");
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}


// Custom exception subclass
class MyCustomException extends Exception {
    MyCustomException(String message) {
        super(message);
    }
}

// The output of the above program is shown as below
/*
Caught custom exception: This is a custom exception
 */
