package com.Trials.LearnBasics;

public class Demo_11 {
    public static void main(String[] args) {
        int n=5;
        int result=1;
        for (int i = 1; i <= n; i++) {
            System.out.print(result + "  ");  // Print the result// Multiply result by i for each iteration
            result = result*2;
        }
    }
}
