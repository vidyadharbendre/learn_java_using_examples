package com.Trials.LearnBasics;

public class Demo_6 {
    public static void main(String[] args) {
        int counter = 0;
        while (counter <= 7) {
            if (counter % 2 == 0) {
                counter += 1;
                continue;
            } else {
                counter += 1;
            }
            System.out.println(counter);
        }
    }
}
