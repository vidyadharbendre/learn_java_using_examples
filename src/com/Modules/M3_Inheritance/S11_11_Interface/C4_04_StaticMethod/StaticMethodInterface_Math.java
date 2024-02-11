package com.Modules.M3_Inheritance.S11_11_Interface.C4_04_StaticMethod;

// Interface with a static method
interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

// Class implementing the interface and using the static methods
class Calculator implements MathOperations {
    public int calculateSum(int x, int y) {
        // Using static method from the interface
        return MathOperations.add(x, y);
    }

    public int calculateProduct(int x, int y) {
        // Using another static method from the interface
        return MathOperations.multiply(x, y);
    }
}

public class StaticMethodInterface_Math {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using methods from the Calculator class
        int sumResult = calculator.calculateSum(5, 3);
        int productResult = calculator.calculateProduct(4, 6);

        // Displaying results
        System.out.println("Sum Result: " + sumResult);
        System.out.println("Product Result: " + productResult);
    }
}
// The output of the above program is shown as below:
/*
Sum Result: 8
Product Result: 24
 */