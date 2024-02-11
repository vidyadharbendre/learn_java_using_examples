package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set2.Ten;

/*
Describe the significance of thread priorities in Java.
How does the priority mechanism work, and under what circumstances might
you adjust thread priorities in a multithreaded application? Demonstrate with an example!
 */
class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadPriority_Demo {
    public static void main(String[] args) {
        MyThread thread1RefObj;
        thread1RefObj = new MyThread("Thread 1");
        MyThread thread2RefObj;
        thread2RefObj = new MyThread("Thread 2");
        MyThread thread3RefObj;
        thread3RefObj = new MyThread("Thread 3");

        thread1RefObj.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2RefObj.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3RefObj.setPriority(Thread.MAX_PRIORITY); // Priority 10

        thread1RefObj.start();
        thread2RefObj.start();
        thread3RefObj.start();
    }
}

/*
In this example:

We define a MyThread class that extends Thread. Each thread will print numbers from 1 to 5.
In the run() method of MyThread, we simulate some work by sleeping for a short duration between each iteration.
In the ThreadPriorityExample class:
We create three MyThread instances: thread1, thread2, and thread3.
We set different priorities for each thread using the setPriority() method.
We start all three threads.
Thread priorities are set as follows:

Thread 1 has the minimum priority (MIN_PRIORITY, which is 1).
Thread 2 has the default priority (NORM_PRIORITY, which is 5).
Thread 3 has the maximum priority (MAX_PRIORITY, which is 10).
When you run this program, you'll notice that Thread 3 will likely execute more frequently and complete its iterations faster compared to the other threads because it has the highest priority. Thread 1 may execute less frequently due to its lower priority, and Thread 2 will have intermediate behavior.
 */

// The output of the above program is shown as below
/*
Thread 2: 1
Thread 3: 1
Thread 1: 1
Thread 3: 2
Thread 2: 2
Thread 1: 2
Thread 3: 3
Thread 1: 3
Thread 2: 3
Thread 3: 4
Thread 1: 4
Thread 2: 4
Thread 3: 5
Thread 1: 5
Thread 2: 5
 */