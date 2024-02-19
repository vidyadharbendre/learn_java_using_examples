package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set1.Two;

/*Question
Explain the concept of multithreading in Java and discuss
how it can lead to improved program performance.
Provide an example illustrating the creation and execution
of multiple threads.
 */
/*Answer
Multithreading in Java refers to the concurrent execution of multiple threads within the same process. A thread is the smallest unit of processing within a program, and multithreading allows a program to perform multiple tasks concurrently, potentially improving performance by utilizing the available CPU resources more effectively.
In Java, multithreading is achieved by creating instances of the Thread class or implementing the Runnable interface. There are two main ways to create and execute multiple threads:
Extending the Thread class: You can create a new class that extends the Thread class and override its run() method to define the code that will be executed by the thread.
Implementing the Runnable interface: You can create a class that implements the Runnable interface and defines its run() method. Then, you can pass an instance of this class to a Thread object for execution.
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
