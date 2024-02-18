/**
 * This program demonstrates thread control mechanisms such as suspending, resuming, and stopping a thread.
 * It defines a custom thread class MyThread that extends Thread and provides methods to suspend, resume, and stop the thread.
 * The main method in the ThreadControlExample class creates an instance of MyThread and demonstrates the thread control operations.
 */
package com.Modules.M5_MultiThreading.S10_Suspend_Resume_Stop;

// Define a custom thread class MyThread that extends Thread
class MyThread extends Thread {
    private boolean suspended; // Flag to indicate if the thread is suspended
    private boolean stopped; // Flag to indicate if the thread is stopped

    // Constructor to initialize the thread with a name
    public MyThread(String name) {
        super(name);
        suspended = false;
        stopped = false;
    }

    // Run method of the thread
    @Override
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            // Loop to perform some task
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if (i % 10 == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                // Check if the thread is suspended
                synchronized (this) {
                    while (suspended) {
                        wait();
                    }
                    // Check if the thread is stopped
                    if (stopped) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " exiting.");
    }

    // Method to suspend the thread
    synchronized void suspendThread() {
        suspended = true;
    }

    // Method to resume the thread
    synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    // Method to stop the thread
    synchronized void stopThread() {
        stopped = true;
        // Resume the thread if it's suspended to allow it to exit
        if (suspended) {
            suspended = false;
            notify();
        }
    }
}

// Class containing the main method to demonstrate thread control operations
public class ThreadControlExample {
    public static void main(String[] args) {
        // Create an instance of MyThread and start it
        MyThread myThread = new MyThread("MyThread");
        myThread.start();

        try {
            // Sleep for 1 second
            Thread.sleep(1000);
            // Suspend the thread
            myThread.suspendThread();
            System.out.println("Thread suspended.");

            // Sleep for 1 second
            Thread.sleep(1000);
            // Resume the thread
            myThread.resumeThread();
            System.out.println("Thread resumed.");

            // Sleep for 1 second
            Thread.sleep(1000);
            // Stop the thread
            myThread.stopThread();
            System.out.println("Thread stopped.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Wait for the thread to finish
        try {
            myThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for MyThread to finish.");
        }

        System.out.println("Main thread exiting.");
    }
}
// The output of the above program is shown as below
/*
MyThread starting.
1 2 3 4 5 6 7 8 9 10
11 12 13 14 15 16 17 18 19 20
21 22 23 24 25 26 27 28 29 30
31 32 33 34 35 36 37 38 39 40
Thread suspended.
41 42 Thread resumed.
43 44 45 46 47 48 49 50
51 52 53 54 55 56 57 58 59 60
61 62 63 64 65 66 67 68 69 70
71 72 73 74 75 76 77 78 79 80
Thread stopped.
MyThread exiting.
Main thread exiting.
 */