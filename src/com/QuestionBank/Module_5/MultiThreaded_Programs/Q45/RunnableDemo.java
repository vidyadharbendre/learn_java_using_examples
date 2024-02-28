package com.QuestionBank.Module_5.MultiThreaded_Programs.Q45;


// Define a class that implements Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Creating and starting threads using Runnable
public class RunnableDemo {
    public static void main(String[] args) {
        // Create instances of Runnable
        Runnable myRunnable1;
        myRunnable1 = new MyRunnable();
        Runnable myRunnable2;
        myRunnable2 = new MyRunnable();

        // Create Thread objects with Runnable instances
        Thread thread1;
        thread1 = new Thread(myRunnable1);
        Thread thread2;
        thread2 = new Thread(myRunnable2);

        // Start threads
        thread1.start();
        thread2.start();
    }
}
// The output of the above program is shown as below
/*
Thread running: Thread-1
Thread running: Thread-0
 */