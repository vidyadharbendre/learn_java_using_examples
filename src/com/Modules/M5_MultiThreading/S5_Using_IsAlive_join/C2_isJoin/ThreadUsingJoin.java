package com.Modules.M5_MultiThreading.S5_Using_IsAlive_join.C2_isJoin;

/*
 * This program demonstrates the usage of the join() method in Java multithreading.
 *
 * The MyThread class extends Thread and overrides the run() method to print the ID of the current thread and a count from 1 to 5.
 *
 * The ThreadUsingJoin class contains the main method where instances of MyThread threads are created and started.
 *
 * After starting the threads, the main thread calls the join() method on each thread, which causes the main thread to wait until the specified thread completes its execution.
 *
 * As a result, the main thread waits for both thread1 and thread2 to finish execution before proceeding.
 *
 * The output of the program shows interleaved prints from thread1 and thread2, as they execute concurrently. However, due to the join() method, the main thread ensures that it waits for both threads to complete before printing "End of Main".
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

public class ThreadUsingJoin {
    public static void main(String[] args) {
        MyThread thread1RefObj;
        thread1RefObj = new MyThread();
        MyThread thread2RefObj;
        thread2RefObj = new MyThread();

        thread1RefObj.start();
        thread2RefObj.start();

        // Wait for threads to complete
        try {
            thread1RefObj.join();
            thread2RefObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//The output of the above program is shown as below
/*
21 - Count: 1
22 - Count: 1
22 - Count: 2
21 - Count: 2
21 - Count: 3
22 - Count: 3
22 - Count: 4
21 - Count: 4
22 - Count: 5
21 - Count: 5
 */