package com.modules.M5_MultiThreading.C2_Thread;
/*
In this version, the MyThread class extends Thread, and the run()
method is overridden to define the specific task.

In the ThreadExampleByThreadExtension class, two instances of
MyThread are created, and the start() method is called on each
thread to initiate concurrent execution.

This modification demonstrates creating threads by extending the
Thread class in Java.
 */
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ThreadExampleByThreadInheritance {
    public static void main(String[] args) {
        MyThread t1_RefObj;
        t1_RefObj = new MyThread();
        MyThread t2_RefObj;
        t2_RefObj = new MyThread();
        t1_RefObj.start();
        t2_RefObj.start();
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