package com.Modules.M1_Overview.S5_05_Operators;

// Example demonstrating operators in Java

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Relational Operators
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);

        // Boolean Logical Operators
        boolean andResult = (true && false);
        boolean orResult = (true || false);

        // Assignment Operator
        int x = 10;
        x += 5; // Equivalent to x = x + 5;

        // ? Operator
        int y = (a > b) ? a : b;
    }
}

