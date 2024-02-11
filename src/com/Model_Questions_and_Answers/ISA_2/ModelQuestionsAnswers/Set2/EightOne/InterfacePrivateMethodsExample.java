package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.EightOne;

/*
Private Interface Methods:
Starting from Java 9, interfaces can have private methods.
These private methods are not part of the interface's public API and are meant
to be used only within the interface itself.
They allow for code organization and re-usability within the interface without
exposing implementation details.
 */

interface Calculator {
    int add(int a, int b);

    default int subtract(int a, int b) {
        return add(a, -b); // Using the private method add
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    default int multiplyAndAdd(int a, int b, int c) {
        return multiply(a, b) + c; // Using the private method multiply
    }
}

class BasicCalculator implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class InterfacePrivateMethodsExample {
    public static void main(String[] args) {
        BasicCalculator basicCalcRefObj;
        basicCalcRefObj = new BasicCalculator();
        System.out.println("Addition: " + basicCalcRefObj.add(5, 3));
        System.out.println("Subtraction: " + basicCalcRefObj.subtract(8, 4));
        System.out.println("Multiply and Add: " + basicCalcRefObj.multiplyAndAdd(2, 3, 4));
    }
}