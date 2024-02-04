package com.Lessons.Concepts.Concurrency;

// Custom Runnable class for Thread 2
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 2: " + i);
        }
    }
}

public class ConcurrencyExample {
    public static void main(String[] args) {
        // Create and define the Runnable objects for each thread
        Runnable runnable1RefObj;
        runnable1RefObj = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        };

        // Use the custom Runnable class for Thread 2
        Runnable runnable2RefObj;
        runnable2RefObj = new MyRunnable();

        // Create and start the threads
        Thread thread1RefObj;
        thread1RefObj = new Thread(runnable1RefObj);
        Thread thread2RefObj;
        thread2RefObj = new Thread(runnable2RefObj);

        thread1RefObj.start();
        thread2RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Thread 1: 1
Thread 1: 2
Thread 2: 1
Thread 2: 2
Thread 2: 3
Thread 2: 4
Thread 2: 5
Thread 1: 3
Thread 1: 4
Thread 1: 5

 */