package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Nine;

/*
Describe the purpose of multiple catch clauses in Java exception handling.
Explain the concept of nested try statements and how they contribute to
handling complex scenarios.
Provide examples illustrating the use of multiple catch clauses and
nested try statements.
 */

/*
Purpose of Multiple Catch Clauses:

In Java, multiple catch clauses are used in exception handling to
provide different responses based on the type of exception thrown during
the execution of a try block.
Each catch block is responsible for handling a specific type of
exception, allowing you to tailor your exception-handling logic
accordingly.

Example of Multiple Catch Clauses:
 */
public class MultipleCatchDemo {
    public static void main(String[] args) {
        int result;
        try {
            // Code that may throw exceptions
            result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }

    // A method that may throw exceptions
    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

// The output of the above program is shown below
/*
Arithmetic Exception: / by zero
 */

/*
In this example, the divide method may throw an ArithmeticException.
By having multiple catch clauses, you can handle different exception
types separately.
If an ArithmeticException occurs, the first catch block will be executed.
If a NullPointerException occurs, the second catch block will be executed.
The last catch block, catching the generic Exception, acts as a fallback
for any other unexpected exceptions.


 */