package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set1.Five;

public class Interface_static_method {
    public static void main(String[] args) {
        int result;

        Calculator calculatorRefObj;
        calculatorRefObj = new Calculator();
        result = calculatorRefObj.calculateSum(5, 3);
        System.out.println("Sum: " + result);
    }
}

// Example interface with a static method
interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

// Class using the static methods from the interface
class Calculator {
    public int calculateSum(int x, int y) {
        return MathOperations.add(x, y);
    }
}

/*
Sum: 8
*/