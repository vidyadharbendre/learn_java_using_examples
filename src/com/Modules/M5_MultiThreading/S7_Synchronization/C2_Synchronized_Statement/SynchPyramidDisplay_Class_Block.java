package com.Modules.M5_MultiThreading.S7_Synchronization.C2_Synchronized_Statement;
/*
 * This program demonstrates the synchronized block in Java for multithreading.
 *
 * The A and B classes extend Thread and represent threads that draw a pyramid with '*' and '#' characters, respectively.
 * They both use the same Pyramid object to draw the pyramid.
 *
 * The Pyramid class encapsulates the logic for drawing a pyramid. It has a method draw_pyramid(char ch) to draw the pyramid with the specified character.
 *
 * In the draw_pyramid(char ch) method of the Pyramid class, a synchronized block is used to ensure that only one thread can execute this method at a time.
 * This prevents interference between the threads and ensures that the pyramid is drawn correctly.
 *
 * The SynchPyramidDisplay_Class_Block class contains the main method where instances of A and B threads are created and started.
 *
 * The output of the program is shown with and without synchronization. Without synchronization, the pyramid's rows might be intermixed due to threads' interleaving execution.
 * With synchronization, the pyramid is drawn correctly, ensuring that each row is printed in sequence.
 *
 * The same program can be converted to use synchronized blocks instead of synchronizing the entire method.
 */

class A extends Thread {
    Pyramid p;

    A(Pyramid p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.draw_pyramid('*');
    }
}

class B extends Thread {
    Pyramid p;

    B(Pyramid p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.draw_pyramid('#');
    }
}

class Pyramid {
    private int n;

    public Pyramid() {
        this.n = 5;
    }

    void draw_pyramid(char ch) {
        synchronized (this) { // Synchronize on the same monitor object
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
}

public class SynchPyramidDisplay_Class_Block {
    public static void main(String[] args) {
        Pyramid pyramidRefObj = new Pyramid();
//        pyramidRefObj.draw_pyramid('*');

        A threadA;
        threadA = new A(pyramidRefObj);

        B threadB;
        threadB = new B(pyramidRefObj);

        threadA.start();
        threadB.start();

    }
}

// The output of the above program is shown as below

// Without Synchronized

/*
    *
   ***
      #
   ###
  #####
 #*****
 *****######
########**
*********
#
 */

// With synchronized
/*
    *
   ***
  *****
 *******
*********
    #
   ###
  #####
 #######
#########
 */

// The same above program can be converted into the synchronized block
/*
synchronized (this) { // Synchronize on the same monitor object
 */