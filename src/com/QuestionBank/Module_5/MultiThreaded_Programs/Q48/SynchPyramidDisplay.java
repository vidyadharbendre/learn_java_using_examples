package com.QuestionBank.Module_5.MultiThreaded_Programs.Q48;

/* 10 Marks Question
* Write a Java program that includes multithreading,
* thread synchronization, interthread communication, and
* demonstrates thread states.

 * This program demonstrates multithreading,
 * thread synchronization, interthread communication, and
 * demonstrates thread states in Java.
 */

class Pyramid {
    private int n;

    public Pyramid() {
        this.n = 5;
    }

    // Synchronized method to draw the pyramid
    synchronized void drawPyramid(char ch) {
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

class A extends Thread {
    Pyramid p;

    A(Pyramid p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.drawPyramid('*');
    }
}

class B extends Thread {
    Pyramid p;

    B(Pyramid p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.drawPyramid('#');
    }
}

public class SynchPyramidDisplay {
    public static void main(String[] args) {
        Pyramid pyramidRefObj = new Pyramid();

        A threadA;
        threadA = new A(pyramidRefObj);

        B threadB;
        threadB = new B(pyramidRefObj);

        threadA.start();
        threadB.start();

        // Sleep for some time to observe thread states
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output thread states
        System.out.println("Thread A State: " + threadA.getState());
        System.out.println("Thread B State: " + threadB.getState());
    }
}
