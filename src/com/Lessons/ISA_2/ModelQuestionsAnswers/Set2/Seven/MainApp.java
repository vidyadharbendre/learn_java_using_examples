package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Seven;



import com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Seven.CalculatorPackageDemo;
public class MainApp {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = CalculatorPackageDemo.add(num1, num2);
        int difference = CalculatorPackageDemo.subtract(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

