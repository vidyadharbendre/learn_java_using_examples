package com.Modules.M5_MultiThreading.S11_Thread_State;
/*
 * This program demonstrates the different states of threads in Java.
 *
 * Thread States:
 * - New State: Thread is in the new state if it has been created but has not yet started.
 * - Runnable State: Thread is in the runnable state if it is ready to run but may or may not be currently executing.
 * - Blocked State: Thread is in the blocked state if it is waiting for a monitor lock to enter a synchronized block or method.
 * - Waiting State: Thread is in the waiting state if it is waiting indefinitely for another thread to perform a particular action.
 * - Timed Waiting State: Thread is in the timed waiting state if it is waiting for another thread to perform a particular action, but with a specified maximum time limit.
 * - Running State: Thread is in the running state if it is currently executing instructions.
 * - Dead State: Thread is in the dead (or terminated) state if it has finished executing.
 */

public class ThreadStateDemo {
    public static void main(String[] args) {
        // New State
        Thread threadNew = new Thread(() -> {
            System.out.println("Thread in the New state.");
        });

        // Runnable State
        Thread threadRunnable = new Thread(() -> {
            System.out.println("Thread in the Runnable state.");
        });

        // Blocked State
        Object lock = new Object();
        Thread threadBlocked = new Thread(() -> {
            synchronized (lock) {
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Waiting State
        Thread threadWaiting = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(); // Wait indefinitely
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Timed Waiting State
        Thread threadTimedWaiting = new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait(3000); // Wait for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Running State
        Thread threadRunning = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread in the Running state - iteration " + (i + 1));
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Dead State
        Thread threadDead = new Thread(() -> {
            System.out.println("Thread in the Dead state.");
        });

        // Start threads to transition them to their respective states
        threadNew.start();
        threadRunnable.start();
        threadBlocked.start();
        threadWaiting.start();
        threadTimedWaiting.start();
        threadRunning.start();

        // Check the state of each thread
        System.out.println("State of threadNew: " + threadNew.getState());
        System.out.println("State of threadRunnable: " + threadRunnable.getState());
        System.out.println("State of threadBlocked: " + threadBlocked.getState());
        System.out.println("State of threadWaiting: " + threadWaiting.getState());
        System.out.println("State of threadTimedWaiting: " + threadTimedWaiting.getState());
        System.out.println("State of threadRunning: " + threadRunning.getState());
        System.out.println("State of threadDead: " + threadDead.getState());

        // Wait for the threadRunning to finish
        try {
            threadRunning.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check the state of the dead thread
        System.out.println("State of threadDead after finishing: " + threadDead.getState());
    }
}

// The output of the above program is shown as below
/*
Thread in the New state.
Thread in the Runnable state.
State of threadNew: TERMINATED
State of threadRunnable: TERMINATED
State of threadBlocked: TIMED_WAITING
State of threadWaiting: BLOCKED
State of threadTimedWaiting: BLOCKED
State of threadRunning: RUNNABLE
State of threadDead: NEW
Thread in the Running state - iteration 1
Thread in the Running state - iteration 2
Thread in the Running state - iteration 3
Thread in the Running state - iteration 4
Thread in the Running state - iteration 5
State of threadDead after finishing: NEW

 */