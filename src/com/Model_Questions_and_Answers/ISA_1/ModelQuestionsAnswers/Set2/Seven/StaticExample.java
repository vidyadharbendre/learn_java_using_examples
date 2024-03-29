package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set2.Seven;

public class StaticExample {

    public static void main(String[] args) {
        int number = 5;
        int squareResult = StaticExample.square(number);
        System.out.println("Square of " + number + " is: " + squareResult);
    }

    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }
}
// The output of the above program is shown below:
/*
Square of 5 is: 25
 */
