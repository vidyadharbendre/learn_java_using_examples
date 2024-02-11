package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.Six;

public class UnCheckedDemo {

    public static void main(String[] args) {
        try {
            performDivision(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    private static void performDivision(int numerator, int denominator) {
        int result = numerator / denominator;
        System.out.println("Result of division: " + result);
    }
}

// The output of the above program is shown as below
/*
ArithmeticException caught: / by zero
 */