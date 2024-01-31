package com.modules.M5_MultiThreading.C3_MultiTasking;
/*
In this program, two classes (Task1 and Task2) extend the Thread class, and
each overrides the run() method to define specific tasks.

In the MultitaskingExample class, two instances of these tasks are created
(task1 and task2), and their start() methods are called to initiate the
concurrent execution of the tasks.

The output may vary due to the non-deterministic nature of thread execution.
 */
class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 1 is running");
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task 2 is running");
    }
}

public class MultiTaskingExample {
    public static void main(String[] args) {
        Task1 task1RefObj;
        task1RefObj = new Task1();

        Task2 task2RefObj;
        task2RefObj = new Task2();

        task1RefObj.start();
        task2RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Task 2 is running
Task 1 is running
 */
