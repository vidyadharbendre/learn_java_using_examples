package com.Lessons.ISA_3.ModelQuestionsAnswers.Set1.Three;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) {
        // Step 1: Create an instance of the MyRunnable class
        MyRunnable myRunnableRefObj;
        myRunnableRefObj = new MyRunnable();

        // Step 2: Create a new Thread instance, passing the MyRunnable instance to its constructor
        Thread threadRefObj;
        threadRefObj = new Thread(myRunnableRefObj);

        // Remaining code remains unchanged
        System.out.println("Thread state after creation: " + threadRefObj.getState());

        threadRefObj.start();
        System.out.println("Thread state after start: " + threadRefObj.getState());

        try {
            Thread.sleep(500); // Wait for some time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after sleep: " + threadRefObj.getState());

        try {
            threadRefObj.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after join: " + threadRefObj.getState());
    }
}

// The output of the above program is shown as below
/*
Thread state after creation: NEW
Thread state after start: RUNNABLE
Thread state after sleep: TIMED_WAITING
Thread state after join: TERMINATED
 */