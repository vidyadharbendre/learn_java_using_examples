package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set1.Ten;

/*
 * This program demonstrates a scenario of deadlock in Java using synchronized blocks.
 *
 * We define two classes, Thread3 and Thread4, each extending the Thread class.
 * Each class overrides the run() method with the appropriate logic for acquiring locks on resources using synchronized blocks.
 *
 * In the DeadlockExample_Block class, we declare resource1 and resource2 objects as static final variables.
 * We initialize these objects in a static block.
 *
 * In the main method, we create instances of Thread3 and Thread4 classes and start both threads.
 *
 * The output of the program demonstrates the deadlock situation where Thread3 holds a lock on resource1
 * and waits for resource2, while Thread4 holds a lock on resource2 and waits for resource1.
 */

// Define Thread3 class by extending Thread
class Thread3 extends Thread {
    @Override
    public void run() {
        synchronized (DeadlockExample_Block.resource1) {
            System.out.println("Thread 3: Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 3: Waiting for lock 2...");
            synchronized (DeadlockExample_Block.resource2) {
                System.out.println("Thread 3: Holding lock 1 and 2...");
            }
        }
    }
}

// Define Thread4 class by extending Thread
class Thread4 extends Thread {
    @Override
    public void run() {
        synchronized (DeadlockExample_Block.resource2) {
            System.out.println("Thread 4: Holding lock 2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 4: Waiting for lock 1...");
            synchronized (DeadlockExample_Block.resource1) {
                System.out.println("Thread 2: Holding lock 1 and 2...");
            }
        }
    }
}

public class DeadlockExample_Block {

    // Static final objects used as locks for synchronization
    static final Object resource1; // Declaration
    static final Object resource2; // Declaration

    // Initialization of resources in a static block
    static {
        resource1 = new Object();
        resource2 = new Object();
    }

    public static void main(String[] args) {
        // Create instances of Thread3 and Thread4
        Thread3 thread3RefObj;
        thread3RefObj = new Thread3();
        Thread4 thread4RefObj;
        thread4RefObj = new Thread4();

        // Start both threads
        thread3RefObj.start();
        thread4RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Thread 3: Holding lock 1...
Thread 4: Holding lock 2...
Thread 4: Waiting for lock 1...
Thread 3: Waiting for lock 2...
 */