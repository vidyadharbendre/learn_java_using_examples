package com.modules.M5_MultiThreading.C4_Concurrency;

/*
In this program, the Task class implements the Runnable interface, and the run()
method is overridden to define the specific task.

In the ConcurrencyExample class, two instances of Thread are created,
each initialized with a Task object.

The start() method is called on each thread to initiate concurrent execution.
This example demonstrates concurrency using the Runnable interface, and the output
may vary due to the non-deterministic nature of thread execution.
 */
class Task implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ConcurrencyExampleByRunnableInterface {
    public static void main(String[] args) {
        Thread thread1RefObj;
        thread1RefObj = new Thread(new Task());

        Thread thread2RefObj;
        thread2RefObj = new Thread(new Task());

        thread1RefObj.start();
        thread2RefObj.start();
    }
}
