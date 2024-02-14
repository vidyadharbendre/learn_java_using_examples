package com.Modules.M5_MultiThreading.S7_Synchronization.C99_Learn;
class Pyramid {
    private int n;

    public Pyramid() {
        this.n = 5;
    }

    synchronized void draw_pyramid(char ch) {
        for (int i = 0; i < n; i++) {
            // Print spaces before each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print characters for each row
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(ch);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

public class PyramidDisplay_1 {
    public static void main(String[] args) {
        Pyramid pyramid;
        pyramid = new Pyramid();

        pyramid.draw_pyramid('$');


    }
}