package com.QuestionBank.Module_5.MultiThreaded_Programs.Q45;



// Define a class that extends Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Creating and starting threads
public class ThreadDemo {
    public static void main(String[] args) {
        // Creating thread objects
        MyThread thread1;
        thread1 = new MyThread();
        MyThread thread2;
        thread2 = new MyThread();

        // Starting threads
        thread1.start();
        thread2.start();
    }
}

// The output of the above program is shown as below
/*
Thread running: Thread-0
Thread running: Thread-1
 */