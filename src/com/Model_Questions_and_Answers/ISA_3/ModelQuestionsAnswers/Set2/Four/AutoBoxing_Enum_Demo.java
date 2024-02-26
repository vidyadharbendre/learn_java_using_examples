package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set2.Four;

/*
Describe the concept of autoboxing in Java.
How does it simplify code, and what are the scenarios where
autoboxing is particularly beneficial?
Provide examples to illustrate.
 */

/*
- Autoboxing allows developers to work with primitive types and wrapper
classes interchangeably, making code more readable and reducing the
chance of errors caused by manual conversions.
- It handles conversions implicitly, improving code clarity and
reducing boilerplate code.

How Autoboxing Simplifies Code?
Implicit Conversion: Autoboxing converts primitive types to their
corresponding wrapper classes automatically, eliminating the need for
manual conversion.

Code Readability: By handling conversions implicitly, autoboxing improves
code readability and reduces clutter caused by explicit conversions.

Reduced Errors: Manual conversions can introduce errors if not done
correctly.
Autoboxing reduces the chance of such errors by handling conversions
internally.

Scenarios Where Autoboxing is Beneficial:
Working with Enum Constants: Autoboxing simplifies passing enum constants to methods that expect wrapper class parameters, enhancing code readability.
Method Invocation: Autoboxing allows methods to be invoked with primitive values directly, without explicitly converting them to wrapper classes.
Collections: Autoboxing simplifies adding primitive values to collections like ArrayList, HashMap, etc., which require objects.
 */

public class AutoBoxing_Enum_Demo {
    // Define an enum for the example
    enum Numbers {
        ONE, TWO, THREE, FOUR, FIVE
    }

    public static void main(String[] args) {
        // Autoboxing example with enum constants
        for (Numbers number : Numbers.values()) {
            printOrdinalValue(number); // Autoboxing: enum constants are automatically boxed into Numbers objects
        }
    }

    // Method that expects Numbers parameter
    public static void printOrdinalValue(Numbers number) {
        System.out.println("Ordinal value of " + number + ": " + number.ordinal());
    }
}

// The output of the above program is shown as below
/*
Ordinal value of ONE: 0
Ordinal value of TWO: 1
Ordinal value of THREE: 2
Ordinal value of FOUR: 3
Ordinal value of FIVE: 4
 */