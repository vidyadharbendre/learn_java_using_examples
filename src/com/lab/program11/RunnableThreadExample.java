package com.lab.program11;

/*
11. Write a simple program to illustrate the creation of threads using a runnable class. (start method starts each of the
newly created threads. Inside the run method, there is sleep() for suspending the thread for 500
milliseconds).
 */

class MyRunnable implements Runnable {
    // Implement the run method as specified in the Runnable interface
    @Override
    public void run() {
        try {
            // Inside the run method, sleep the thread for 500 milliseconds
            Thread.sleep(500);
            // Print a message indicating the thread has completed sleeping
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        } catch (InterruptedException e) {
            // Handle InterruptedException if needed
            e.printStackTrace();
        }
    }
}

public class RunnableThreadExample {
    public static void main(String[] args) {
        // Create multiple instances of MyRunnable
        MyRunnable myRunnable1RefObj;
        myRunnable1RefObj = new MyRunnable();

        MyRunnable myRunnable2RefObj;
        myRunnable2RefObj = new MyRunnable();

        MyRunnable myRunnable3RefObj;
        myRunnable3RefObj = new MyRunnable();

        // Create threads using the instances of MyRunnable
        Thread thread1RefObj;
        thread1RefObj = new Thread(myRunnable1RefObj);

        Thread thread2RefObj;
        thread2RefObj = new Thread(myRunnable2RefObj);

        Thread thread3RefObj;
        thread3RefObj = new Thread(myRunnable3RefObj);

        // Start each thread using the start() method
        thread1RefObj.start();
        thread2RefObj.start();
        thread3RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Thread 22 is running.
Thread 21 is running.
Thread 23 is running.
 */