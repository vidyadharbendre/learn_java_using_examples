package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set2.Three;

/*
Discuss the role of numeric type wrappers
(e.g., Integer, Double) in Java.
How do they bridge the gap between primitive types and objects?
Provide examples to showcase their usage
 */

/*
Numeric type wrappers, such as Integer, Double, etc., play a crucial role in Java by bridging the gap between primitive types and objects. They provide a means to represent primitive data types (like int, double) as objects, enabling developers to use them in contexts where objects are required.

How They Bridge the Gap:
Object Representation:
Numeric type wrappers encapsulate primitive data types within objects.
For example, Integer wraps the int primitive type, and
Double wraps the double primitive type.

Methods and Functionality:
Wrappers provide utility methods to work with primitive data types more
effectively.
For instance, Integer class provides methods for conversion, comparison,
parsing, and arithmetic operations on integers.

Compatibility with Object-Oriented Features:
Wrappers allow primitive types to be treated as objects, enabling them to participate in object-oriented programming constructs like inheritance, method overloading, and polymorphism
 */

public class TypeWrapperDemo {
    // Example 1: Using Integer wrapper for method parameters
    public static void printSquare(Integer num) {
        System.out.println("Square of " + num + ": " + (num * num));
    }

    // Define an enum for the example
    enum DoubleValue {
        PI(3.14),
        HALF(0.5),
        EXPONENT(2.718);

        private final double value;

        DoubleValue(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
    // Example 2: Parsing string into Integer object
    public static void main(String[] args) {
        // Example 1: Passing primitive int value to method expecting Integer object (autoboxing)
        int number1 = 5;
        printSquare(number1);

        // Example 2: Parsing a string into an Integer object
        String numberStr = "10";
        Integer number2 = Integer.parseInt(numberStr);
        System.out.println("Parsed Integer value: " + number2);

        // Example 3: Using enum constants in a simple array
        // Using enum constants in a simple array
        DoubleValue[] values = {DoubleValue.PI, DoubleValue.HALF, DoubleValue.EXPONENT};

        // Iterating through the array
        for (DoubleValue value : DoubleValue.values()) {
            System.out.println("Value: " + value.getValue());
        }
    }
}

// The ouput of the above program is shown as below
/*
Square of 5: 25
Parsed Integer value: 10
Value: 3.14
Value: 0.5
Value: 2.718
 */



