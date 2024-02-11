package com.Modules.M5_MultiThreading.S7_Synchronization.C2_Synchronized_Statement;

// Step 1: Define a method to increment the counter in the Counter class:
class Counter {
    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronize on the current object
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

    // New method to increment count for a given number of iterations
    public void incrementForIterations(int iterations) {
        for (int i = 0; i < iterations; i++) {
            increment();
        }
    }
}

// Step 2: Create a separate class implementing the Runnable interface:

class IncrementRunnable implements Runnable {
    private Counter counter;
    private int iterations;

    public IncrementRunnable(Counter counter, int iterations) {
        this.counter = counter;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        counter.incrementForIterations(iterations);
    }
}

// Step 3: Use the IncrementRunnable class when creating Thread instances in the main method:

public class Synchronized_Statement_Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter counterRefObj;
        counterRefObj = new Counter();

        // Create instances of IncrementRunnable for each thread
        IncrementRunnable runnable1RefObj;
        runnable1RefObj = new IncrementRunnable(counterRefObj, 1000);
        IncrementRunnable runnable2RefObj;
        runnable2RefObj = new IncrementRunnable(counterRefObj, 1000);

        // Create threads using instances of IncrementRunnable
        Thread t1_RefObj;
        t1_RefObj = new Thread(runnable1RefObj);
        Thread t2_RefObj;
        t2_RefObj = new Thread(runnable2RefObj);

        // Start threads
        t1_RefObj.start();
        t2_RefObj.start();

        // Join threads
        t1_RefObj.join();
        t2_RefObj.join();

        // Print the final count value
        System.out.println("Count: " + counterRefObj.getCount());
    }
}
// The output of the above program is shown as below
/*
Count: 2000
*/