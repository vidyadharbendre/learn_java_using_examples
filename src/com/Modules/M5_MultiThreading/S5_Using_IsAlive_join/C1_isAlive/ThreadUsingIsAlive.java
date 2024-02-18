package com.Modules.M5_MultiThreading.S5_Using_IsAlive_join.C1_isAlive;

/*
 * This program demonstrates the usage of the isAlive() method in Java multithreading.
 *
 * The MyThread class extends Thread and overrides the run() method to print the ID of the current thread and a count from 1 to 5.
 *
 * The ThreadUsingIsAlive class contains the main method where instances of MyThread threads are created and started.
 *
 * After starting the threads, the main thread checks if each thread is alive by calling the isAlive() method on each thread object.
 *
 * Since the threads are still executing, the isAlive() method returns true for both threads initially.
 *
 * After waiting for both threads to complete using the join() method, the main thread checks again if each thread is alive.
 *
 * Since both threads have completed their execution, the isAlive() method returns false for both threads.
 *
 * The output of the program shows interleaved prints from thread1 and thread2 as they execute concurrently.
 *
 * After both threads complete, the main thread prints whether each thread is alive or not.
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadUsingIsAlive {
    public static void main(String[] args) {
        MyThread thread1RefObj;
        thread1RefObj = new MyThread();

        MyThread thread2RefObj;
        thread2RefObj = new MyThread();

        thread1RefObj.start();
        thread2RefObj.start();

        // Check if threads are alive
        System.out.println("Thread 1 is alive: " + thread1RefObj.isAlive());
        System.out.println("Thread 2 is alive: " + thread2RefObj.isAlive());

        // Wait for threads to complete
        try {
            thread1RefObj.join();
            thread2RefObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check again after threads have completed
        System.out.println("Thread 1 is alive: " + thread1RefObj.isAlive());
        System.out.println("Thread 2 is alive: " + thread2RefObj.isAlive());
    }
}

// The output of the above program is shown as below
/*
Thread 1 is alive: true
Thread 2 is alive: true
22 - Count: 1
21 - Count: 1
22 - Count: 2
21 - Count: 2
22 - Count: 3
21 - Count: 3
22 - Count: 4
21 - Count: 4
22 - Count: 5
21 - Count: 5
Thread 1 is alive: false
Thread 2 is alive: false

 */