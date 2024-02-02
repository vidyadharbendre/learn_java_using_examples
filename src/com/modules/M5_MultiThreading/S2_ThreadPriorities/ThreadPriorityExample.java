package com.modules.M5_MultiThreading.S2_ThreadPriorities;

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