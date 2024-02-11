package com.Modules.M5_MultiThreading.C2_Thread;
/*
In this version, a new class MyRunnable implements the
Runnable interface, and the run() method is overridden to
define the specific task.

In the ThreadExampleByRunnable class, two instances of Thread
are created, each initialized with a MyRunnable object.

The start() method is called on each thread to initiate
concurrent execution.

This program demonstrates the use of the Runnable interface for
creating threads in Java.
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ThreadDemoByRunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnableRefObj;
        myRunnableRefObj = new MyRunnable();


        Thread t1RefObj;
        t1RefObj = new Thread(myRunnableRefObj);

        Thread t2RefObj;
        t2RefObj = new Thread(myRunnableRefObj);

        t1RefObj.start();
        t2RefObj.start();

    }
}

//The output of the above program is shown as below
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
