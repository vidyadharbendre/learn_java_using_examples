package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Five;

/*
Develop a Java program that defines and implements interfaces, illustrating how
to use static methods within an interface and providing examples.
 */

// MathOperations.java
interface MathOperations {
    int add(int a, int b);

    int subtract(int a, int b);

    // Static method in the interface
    static int multiply(int a, int b) {
        return a * b;
    }
}

// AdvancedMathOperations.java
interface AdvancedMathOperations {
    double power(int base, int exponent);

    // Static method in the interface
    static double squareRoot(int number) {
        return Math.sqrt(number);
    }
}


// Calculator.java
public class Calculator implements MathOperations, AdvancedMathOperations {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using methods from MathOperations interface
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(8, 3));
        System.out.println("Multiplication: " + MathOperations.multiply(4, 6));

        // Using methods from AdvancedMathOperations interface
        System.out.println("Power: " + calculator.power(2, 3));
        System.out.println("Square Root: " + AdvancedMathOperations.squareRoot(25));
    }
}

// The output of the above program is shown as below
/*
Addition: 8
Subtraction: 5
Multiplication: 24
Power: 8.0
Square Root: 5.0
 */