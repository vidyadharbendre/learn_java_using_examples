package com.learn;

public class Second {
    public static void main(String[] args) {

        float java = 68.5f;
        float dataStr = 70.5f;

        double sum, average, minus, mul;

        sum = java + dataStr;
        average = sum/2;
        minus = java - dataStr;
        mul = java * dataStr;

        System.out.println("Sum of these two numbers : "+sum);
        System.out.println("Average of these two numbers : "+average);
        System.out.println("Subtraction of these two : "+minus);
        System.out.println("Multiplication of these two: "+mul);

    }
}
