package com.Concepts.ThreadSafe;

public class ThreadSafety_Static_Example {

    // Shared resource
    private int sharedCounter;

    // Constructor to initialize the shared resource
    public ThreadSafety_Static_Example() {
        this.sharedCounter = 0;
    }

    // Synchronized method to ensure thread safety
    private synchronized void incrementCounter() {
        for (int i = 0; i < 100; i++) {
            sharedCounter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Create an instance of ThreadSafetyExample
        ThreadSafety_Static_Example exampleRefObj;
        exampleRefObj = new ThreadSafety_Static_Example();

        // Create two threads that concurrently increment the shared counter
        Thread thread1RefObj;
        thread1RefObj = new Thread(exampleRefObj::incrementCounter);

        Thread thread2RefObj;
        thread2RefObj = new Thread(exampleRefObj::incrementCounter);

        // Start the threads
        thread1RefObj.start();
        thread2RefObj.start();

        // Wait for both threads to complete
        thread1RefObj.join();
        thread2RefObj.join();

        // Display the final value of the shared counter
        System.out.println("Final Shared Counter Value: " + exampleRefObj.sharedCounter);
    }
}
