package com.Trials.LearnBasics;

public class Demo_10 {
    public static void main(String[] args) {
        int n = 5;         // The number to calculate the factorial for
        int result = 1;    // Variable to store the factorial result

        for (int i = 1; i <= n; i++) {
            result *= i;   // Multiply result by i for each iteration
        }

        System.out.println("The factorial of " + n + " is: " + result);  // Print the result
    }
}


