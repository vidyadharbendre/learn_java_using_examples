package com.Modules.M5_MultiThreading.S9_Deadlock;

/*
 * This program demonstrates a scenario of deadlock in Java.
 *
 * We define two thread classes, Thread1 and Thread2, by extending the Thread class.
 * Each class overrides the run() method with the appropriate logic for acquiring locks on resources.
 *
 * In the DeadlockDemo_Method class, we define the resource1 and resource2 objects as static final variables.
 * We create instances of Thread1 and Thread2 classes in the main method and start both threads.
 *
 * The output of the program demonstrates the deadlock situation where Thread1 holds a lock on resource1
 * and waits for resource2, while Thread2 holds a lock on resource2 and waits for resource1.
 */

// Define Thread1 class by extending Thread
class Thread1 extends Thread {
    @Override
    public void run() {
        DeadlockDemo_Method.method1();
    }
}

// Define Thread2 class by extending Thread
class Thread2 extends Thread {
    @Override
    public void run() {
        DeadlockDemo_Method.method2();
    }
}

public class DeadlockDemo_Method {
    // Static final objects used as locks for synchronization
    static final Object resource1;
    static final Object resource2;

    static {
        // Initialize resource1 and resource2 in a static block
        resource1 = new Object();
        resource2 = new Object();
    }

    // Synchronized method accessing resource1
    public static synchronized void method1() {
        System.out.println("Thread 1: Holding lock 1...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 1: Waiting for lock 2...");
        synchronized (resource2) {
            System.out.println("Thread 1: Holding lock 1 and 2...");
        }
    }

    // Synchronized method accessing resource2
    public static synchronized void method2() {
        System.out.println("Thread 2: Holding lock 2...");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 2: Waiting for lock 1...");
        synchronized (resource1) {
            System.out.println("Thread 2: Holding lock 1 and 2...");
        }
    }

    public static void main(String[] args) {
        // Create instances of Thread1 and Thread2
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        // Start both threads
        thread1.start();
        thread2.start();
    }
}

// The output of the above program is shown as below
/*
Thread 1: Holding lock 1...
Thread 1: Waiting for lock 2...
Thread 1: Holding lock 1 and 2...
Thread 2: Holding lock 2...
Thread 2: Waiting for lock 1...
Thread 2: Holding lock 1 and 2...
 */
