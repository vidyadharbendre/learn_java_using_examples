package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Nine;

public class UncheckedExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            // Accessing an element beyond the array size
            int value = numbers[5];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

