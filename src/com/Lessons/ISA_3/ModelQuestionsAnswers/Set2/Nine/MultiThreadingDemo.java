package com.Lessons.ISA_3.ModelQuestionsAnswers.Set2.Nine;

/*
Explain the concept of multithreading in Java and discuss how it can
lead to improved program performance.
Provide an example illustrating the creation and execution of multiple
threads.
 */

class MyThread extends Thread {
    private int threadNumber;

    public MyThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    public void run() {
        System.out.println("Thread " + threadNumber + " is executing.");
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        final int NUM_THREADS = 5;

        // Create and start multiple threads
        for (int i = 1; i <= NUM_THREADS; i++) {
            MyThread thread = new MyThread(i);
            thread.start();
        }
    }
}
