package com.Trials.LearnBasics;

public class Demo_8 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < 5; i++) {
            if ((++num1 > 2) && (++num2 > 2)) {
                num1++;
            }
        }
        System.out.println(num1 + " and " + num2);
    }
}
