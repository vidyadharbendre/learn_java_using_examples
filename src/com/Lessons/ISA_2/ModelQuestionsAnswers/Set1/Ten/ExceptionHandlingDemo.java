package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Ten;

/*
Discuss the roles of throw, throws, and finally in Java exception
handling.
Explain the concept of Java’s built-in exceptions and their usage.
Provide examples demonstrating the use of throw, throws, finally, and
handling built-in exceptions.

Roles of throw, throws, and finally in Java Exception Handling:

throw: The throw keyword is used to explicitly throw an exception in a
program.
It is often used in situations where an error or exceptional condition
is detected, and the program needs to indicate that something
unexpected has happened.

throws: The throws keyword is used in method signatures to declare that
the method might throw certain types of exceptions.
When a method uses throws, it signals to the calling code that it is the
responsibility of the caller to handle or propagate the declared
exceptions.

finally: The finally block is used to define a block of code that will be
executed, regardless of whether an exception is thrown or not.
It is often used for cleanup operations, ensuring that certain actions
are taken before leaving a method or scope.

Built-in Exceptions in Java:

Java provides a rich set of built-in exceptions, categorized under the
java.lang package.
These exceptions cover various scenarios, from arithmetic errors to
input/output issues.
Some common types of built-in exceptions include:

ArithmeticException: Thrown when an arithmetic operation fails.

NullPointerException: Thrown when an application attempts to access an
object or method on a null reference.

IOException: A generic exception for input/output errors.
ArrayIndexOutOfBoundsException: Thrown when an array is accessed with
an illegal index.

*/




import java.io.IOException;

// Example of throw
class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        try {
            throwExample();
        } catch (CustomException ce) {
            System.out.println("Caught CustomException: " + ce.getMessage());
        }

        try {
            methodWithThrows();
        } catch (IOException ioException) {
            System.out.println("Caught IOException: " + ioException.getMessage());
        }

        finallyExample();
    }

    static void throwExample() throws CustomException {
        throw new CustomException("Custom exception thrown");
    }

    static void methodWithThrows() throws IOException {
        // Code that might throw IOException
        throw new IOException("Simulated IOException");
    }

    static void finallyExample() {
        int result;
        try {
            // Code that may throw exceptions
            System.out.println("Inside try block");
            result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("This won't be reached");
        } catch (ArithmeticException ae) {
            // Exception handling code
            System.out.println("Caught ArithmeticException: " + ae.getMessage());
        } finally {
            // Cleanup code or code that always executes
            System.out.println("Inside finally block");
        }
    }
}

// The output of the above program is shown as below
/*
Caught CustomException: Custom exception thrown
Caught IOException: Simulated IOException
Inside try block
Caught ArithmeticException: / by zero
Inside finally block
 */