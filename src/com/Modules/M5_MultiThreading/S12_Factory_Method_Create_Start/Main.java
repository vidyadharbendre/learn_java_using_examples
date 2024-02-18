package com.Modules.M5_MultiThreading.S12_Factory_Method_Create_Start;

/*
 * This program demonstrates the usage of a static factory method to create and start a thread in Java.
 *
 * Static Factory Method:
 * - A static factory method is a method that creates and returns instances of a class.
 * - It's a common design pattern used to encapsulate object creation logic, provide more descriptive method names, and control access to constructors.
 *
 * In this program, we define a MyThread class that extends Thread and provides a static factory method createAndStart().
 * This method creates an instance of MyThread and starts it, encapsulating the logic of thread creation and starting.
 * We also demonstrate how to use this static factory method in the Main class to create and start a thread.
 */

class MyThread extends Thread {
    // Static factory method to create and start a thread
    public static MyThread createAndStart() {
        MyThread threadRefObj;
        threadRefObj = new MyThread();

        threadRefObj.start();
        return threadRefObj;
    }

    @Override
    public void run() {
        System.out.println("Thread running!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create and start a thread using the static factory method
        MyThread myThreadRefObj;
        myThreadRefObj = MyThread.createAndStart();
    }
}

