package com.Modules.M5_MultiThreading.S7_Synchronization.C1_Synchronized_Method;

class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the count value
    public synchronized int getCount() {
        return count;
    }
}

public class Synchronized_Method_Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter counterRefObj;
        counterRefObj = new Counter();

        // Runnable implementation to increment the count
        Runnable incrementRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counterRefObj.increment();
                }
            }
        };

        // Create two threads with the same Runnable instance
        Thread t1_RefObj;
        t1_RefObj = new Thread(incrementRunnable);
        Thread t2_RefObj;
        t2_RefObj = new Thread(incrementRunnable);

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
