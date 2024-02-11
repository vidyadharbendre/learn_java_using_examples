package com.LabPrograms.program12;

/*
12. Develop a program to create a class MyThread in this class a constructor, call the base class constructor,
using super and start the thread. The run method of the class starts after this. It can be observed that
both main thread and created child thread are executed concurrently.
 */
class MyThread extends Thread {
    // Constructor of MyThread class
    public MyThread() {
        // Call the base class (Thread) constructor using super
        super("MyThread"); // Set the name of the thread to "MyThread"
        // Start the thread immediately upon creation
        start();
    }

    // Override the run method to define the behavior of the thread
    @Override
    public void run() {
        // Display a message indicating that the thread is running
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                // Sleep for a short time to simulate some work in the thread
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle InterruptedException if needed
                e.printStackTrace();
            }
        }
    }
}

public class ConcurrentExecutionExample {
    public static void main(String[] args) {
        // Create an instance of MyThread, which will start the thread immediately
        MyThread myThread = new MyThread();

        // Display a message indicating that the main thread is running
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running - Count: " + i);
            try {
                // Sleep for a short time to simulate some work in the main thread
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Handle InterruptedException if needed
                e.printStackTrace();
            }
        }
    }
}

// The output of the above program is shown as below
/*
main is running - Count: 0
MyThread is running - Count: 0
MyThread is running - Count: 1
main is running - Count: 1
MyThread is running - Count: 2
main is running - Count: 2
MyThread is running - Count: 3
main is running - Count: 3
main is running - Count: 4
MyThread is running - Count: 4
 */