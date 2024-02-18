package com.Modules.M5_MultiThreading.S9_Deadlock;

/*
 * This program demonstrates a scenario of deadlock in Java using Runnable interface.
 *
 * We define two classes, Thread5 and Thread6, each implementing the Runnable interface.
 * Each class overrides the run() method with the appropriate logic for acquiring locks on resources.
 *
 * In the DeadlockDemo_Runnable class, we define the resource1 and resource2 objects as static final variables.
 * We create instances of Thread5 and Thread6 classes in the main method and start both threads.
 *
 * The output of the program demonstrates the deadlock situation where Thread5 holds a lock on resource1
 * and waits for resource2, while Thread6 holds a lock on resource2 and waits for resource1.
 */

// Define Thread5 class implementing Runnable interface
class Thread5 implements Runnable {
    @Override
    public void run() {
        synchronized (DeadlockDemo_Runnable.resource1) {
            System.out.println("Thread 5: Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 5: Waiting for lock 2...");
            synchronized (DeadlockDemo_Runnable.resource2) {
                System.out.println("Thread 5: Holding lock 1 and 2...");
            }
        }
    }
}

// Define Thread6 class implementing Runnable interface
class Thread6 implements Runnable {
    @Override
    public void run() {
        synchronized (DeadlockDemo_Runnable.resource2) {
            System.out.println("Thread 6: Holding lock 2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 6: Waiting for lock 1...");
            synchronized (DeadlockDemo_Runnable.resource1) {
                System.out.println("Thread 6: Holding lock 1 and 2...");
            }
        }
    }
}

public class DeadlockDemo_Runnable {
    // Static final objects used as locks for synchronization
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {
        // Create instances of Thread5 and Thread6
        Thread thread5 = new Thread(new Thread5());
        Thread thread6 = new Thread(new Thread6());

        // Start both threads
        thread5.start();
        thread6.start();
    }
}

// The output of the above program is shown as below
/*
Thread 5: Holding lock 1...
Thread 6: Holding lock 2...
Thread 5: Waiting for lock 2...
Thread 6: Waiting for lock 1...
 */