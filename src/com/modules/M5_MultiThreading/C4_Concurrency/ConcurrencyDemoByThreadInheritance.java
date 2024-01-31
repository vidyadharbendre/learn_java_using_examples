package com.modules.M5_MultiThreading.C4_Concurrency;

/*
In this program, the Task class extends the Thread class, and the run()
method is overridden to define the specific task.

In the ConcurrencyExample class, two instances of Task are created by extending
Thread class directly.

The start() method is called on each thread to initiate concurrent execution.
This example demonstrates concurrency by directly extending the Thread class,
and the output may vary due to the non-deterministic nature of thread execution.
 */
class TaskThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ConcurrencyDemoByThreadInheritance {
    public static void main(String[] args) {
        TaskThread thread1RefObj;
        thread1RefObj = new TaskThread();
        TaskThread thread2RefObj;
        thread2RefObj = new TaskThread();

        thread1RefObj.start();
        thread2RefObj.start();
    }
}

// The output of the above program is shown as below
/*
22 Value 0
22 Value 1
22 Value 2
22 Value 3
22 Value 4
21 Value 0
21 Value 1
21 Value 2
21 Value 3
21 Value 4
 */