package com.Modules.M5_MultiThreading.S6_ThreadPriorities;

/*
 * This program demonstrates the use of thread priorities in Java multithreading.
 *
 * The PriorityThread class extends Thread and overrides the run() method to print the ID and priority of the current thread.
 *
 * The ThreadPriorityExample class contains the main method where instances of PriorityThread threads are created and started.
 *
 * The thread priorities are set using the setPriority(int priority) method. The priorities are set to MIN_PRIORITY (1) and MAX_PRIORITY (10) for the two threads, respectively.
 *
 * When the threads are started, they execute concurrently, and the output shows that the thread with higher priority (MAX_PRIORITY) executes before the thread with lower priority (MIN_PRIORITY).
 *
 * The output of the program displays the ID and priority of each thread as it runs.
 */

class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread with ID " + Thread.currentThread().getId() +
                " and Priority " + Thread.currentThread().getPriority() + " is running");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread thread1RefObj;
        thread1RefObj = new PriorityThread();
        PriorityThread thread2RefObj;
        thread2RefObj = new PriorityThread();

        // Set thread priorities
        thread1RefObj.setPriority(Thread.MIN_PRIORITY);
        thread2RefObj.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        thread1RefObj.start();
        thread2RefObj.start();
    }
}

// The output of the above program is shown as below

/*
Thread with ID 22 and Priority 10 is running
Thread with ID 21 and Priority 1 is running
 */