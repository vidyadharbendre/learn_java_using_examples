package com.Modules.M5_MultiThreading.C3_MultiTasking;
/*
In this program, two classes (Task1 and Task2) extend the Thread class, and
each overrides the run() method to define specific tasks.

In the MultitaskingExample class, two instances of these tasks are created
(task1 and task2), and their start() methods are called to initiate the
concurrent execution of the tasks.

The output may vary due to the non-deterministic nature of thread execution.
 */
class Task1Thread extends Thread {
    @Override
    public void run() {
        System.out.println("Task 1 is running");

    }
}

class Task2Thread extends Thread {
    @Override
    public void run() {
        System.out.println("Task 2 is running");
    }
}

public class MultiTaskingExampleByThreadInheritance {
    public static void main(String[] args) {
        Task1Thread task1RefObj;
        task1RefObj = new Task1Thread();

        Task2Thread task2RefObj;
        task2RefObj = new Task2Thread();

        task1RefObj.start();
        System.out.println("Name of the Thread or Default Identity: "+task1RefObj.getName());
        task2RefObj.start();
        System.out.println("Name of the Thread or Default Identity: "+task2RefObj.getName());

    }
}

// The output of the above program is shown as below
/*
Task 2 is running
Task 1 is running
 */
