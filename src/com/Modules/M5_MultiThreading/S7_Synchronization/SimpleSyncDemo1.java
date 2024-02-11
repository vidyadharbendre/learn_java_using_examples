package com.Modules.M5_MultiThreading.S7_Synchronization;

// Separate class to encapsulate counter and its increment method
class IncrementCounterClass {
    private int counter; // Make counter private to encapsulate it

    // Synchronize the method to ensure thread safety
    public synchronized void incrementMethod() {
        counter++;
    }

    // Method to get counter value
    public int getCounter() {
        return counter;
    }
}

// Runnable implementation to perform the increment operation
class IncrementRunnable implements Runnable {
    private final IncrementCounterClass incCntRefObj;

    // Constructor to initialize IncrementCounterClass reference
    public IncrementRunnable(IncrementCounterClass incCntRefObj) {
        this.incCntRefObj = incCntRefObj;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            incCntRefObj.incrementMethod();
        }
    }
}

public class SimpleSyncDemo1 {
    public static void main(String[] args) {
        // Create instance of IncrementCounterClass
        IncrementCounterClass incCntRefObj;
        incCntRefObj = new IncrementCounterClass();

        // Create instances of IncrementRunnable instead of anonymous Runnable
        IncrementRunnable incrementRunnable1;
        incrementRunnable1 = new IncrementRunnable(incCntRefObj);
        IncrementRunnable incrementRunnable2;
        incrementRunnable2 = new IncrementRunnable(incCntRefObj);

        // Create threads using instances of IncrementRunnable
        Thread threadRefObj1;
        threadRefObj1 = new Thread(incrementRunnable1);
        Thread threadRefObj2;
        threadRefObj2 = new Thread(incrementRunnable2);

        // Start threads
        threadRefObj1.start();
        threadRefObj2.start();

        // Join threads
        try {
            threadRefObj1.join();
            threadRefObj2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Display counter value
        System.out.println("Counter : " + incCntRefObj.getCounter());
    }
}
