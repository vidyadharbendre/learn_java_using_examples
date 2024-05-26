/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    22 November, 2023

    Purpose:
    Demonstrates a basic implementation of a calculator using Java classes and methods.

    Description:
    This program defines a Calculator class that allows performing simple arithmetic operations like addition,
    subtraction, and multiplication. The Calculator class contains methods to perform these operations on
    two integers and display the result directly.

    Explanation:
    - The Calculator class encapsulates the result and provides methods to manipulate it.
    - It has methods add(), sub(), and mul() to perform addition, subtraction, and multiplication
      and display the result directly without needing a separate call to getResult().
    - In the main method, an instance of the Calculator class is created, and arithmetic operations are
      performed to showcase the functionality of the Calculator.

    How to use:
    1. Instantiate the Calculator class.
    2. Use the add(), sub(), or mul() methods with two integer arguments to perform operations and display results.
*/

package com.Modules.M1_Overview.S0_00_OOPs.C0_00_Procedural_Vs_OOPs;

public class Calculator {
    private int result; // Private variable to store the result of calculations

    public Calculator() {
        result = 0; // Constructor method to initialize the result to 0
    }

    // Method to perform addition of two numbers and display the result
    public void add(int a, int b) {
        result = a + b;
        System.out.println("Add Result: " + result);
    }

    // Method to perform subtraction of two numbers and display the result
    public void sub(int a, int b) {
        result = a - b;
        System.out.println("Sub Result: " + result);
    }

    // Method to perform multiplication of two numbers and display the result
    public void mul(int a, int b) {
        result = a * b;
        System.out.println("Mul Result: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Create an instance of the Calculator class

        // Perform addition, subtraction, and multiplication operations and display the results
        calc.add(3, 4); // Output: Add Result: 7
        calc.sub(3, 4); // Output: Sub Result: -1
        calc.mul(3, 4); // Output: Mul Result: 12
    }
}

// The output of the above program is

/*

Add Result: 7
Sub Result: -1
Mul Result: 12

 */