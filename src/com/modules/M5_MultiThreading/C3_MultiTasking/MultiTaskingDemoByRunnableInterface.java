package com.modules.M5_MultiThreading.C3_MultiTasking;

/*
In this program, two classes (Task1 and Task2) implement the Runnable interface,
and each overrides the run() method to define specific tasks.

In the MultiTaskingExample class, two instances of Thread are created,
each initialized with a Task object.

The start() method is called on each thread to initiate concurrent execution.
This example demonstrates multitasking using the Runnable interface,
and the output may vary due to the non-deterministic nature of thread execution.
 */
class Task1Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 1 is running");
    }
}

class Task2Runnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Task 2 is running");
    }
}

public class MultiTaskingDemoByRunnableInterface {
    public static void main(String[] args) {
        Task1Runnable task1RefObj;
        task1RefObj = new Task1Runnable();

        Task2Runnable task2RefObj;
        task2RefObj = new Task2Runnable();

        Thread thread1RefObj;
        thread1RefObj = new Thread(task1RefObj);

        Thread thread2RefObj;
        thread2RefObj = new Thread(task2RefObj);

        thread1RefObj.start();
        thread2RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Task 1 is running
Task 2 is running
 */