package com.Trials.LearnBasics;

public class Test {
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            j--;
        } while (++i < 5);
        System.out.println("i = " + i + " and j = " + j);
    }
}
