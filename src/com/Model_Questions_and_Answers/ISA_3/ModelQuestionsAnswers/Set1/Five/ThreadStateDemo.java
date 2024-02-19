package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set1.Five;
/*
Investigate the various states a thread can have in Java.
Describe each state and discuss the transitions that occur between
these states during the lifecycle of a thread with example.
 */

/*
 * In Java, a thread can exist in several states throughout its lifecycle.
 * The various states a thread can have are:
 *
 * New: The thread is in this state when it has been instantiated but not yet
 * started using the start() method.
 * In this state, the thread has been created but has not yet begun execution.
 *
 * Runnable: Once the start() method is called on the thread object, it enters
 * the Runnable state.
 * It means the thread is ready to run and is waiting for the scheduler to
 * allocate processor time.
 * However, it doesn't mean the thread is currently executing;
 * it just means it's eligible to be executed.
 *
 * Blocked/Waiting: A thread enters this state when it's temporarily inactive,
 * typically waiting for a resource or for a condition to be fulfilled.
 * This could happen when a thread is waiting for I/O operations to complete,
 * waiting to acquire a lock, or waiting for a notification from another thread.
 *
 * Timed Waiting: Similar to the Blocked/Waiting state, a thread enters this
 * state when it's temporarily inactive, but for a specified period of time.
 * Threads can enter this state when they call methods such as sleep(), wait()
 * with a timeout, or join() with a timeout.
 *
 * Terminated: A thread enters the Terminated state when it has completed
 * execution either by returning from its run() method or by throwing an
 * uncaught exception.
 * Once a thread is terminated, it cannot be restarted.
 *
 * The transitions between these states occur as follows:
 * A new thread transitions to the Runnable state when start() method is called,
 * making it eligible to be scheduled for execution.
 * When the scheduler assigns processor time to the thread, it moves from
 * Runnable to Running state, where its run() method is executed.
 * While in Running state, the thread can transition to Blocked/Waiting or
 * Timed Waiting states if it encounters conditions that cause it to wait, such
 * as waiting for I/O or waiting for a lock.
 * Once the waiting condition is fulfilled or the specified time elapses in
 * Timed Waiting state, the thread returns to the Runnable state.
 * When the run() method completes execution, the thread transitions to the
 * Terminated state, marking the end of its lifecycle.
 * It's important to note that transitions between these states are managed by
 * the Java Virtual Machine (JVM) and the underlying operating system's thread
 * scheduler, and they can be influenced by factors such as thread priorities,
 * synchronization, and resource availability.
 */

public class ThreadStateDemo {
    public static void main(String[] args) {
        // New State
        MyRunnableNew myrunnablenew;
        myrunnablenew = new MyRunnableNew();

        Thread threadNew;
        threadNew = new Thread(myrunnablenew);
        threadNew.start();

        MyRunnableRunnable myrunnablerunnable;
        myrunnablerunnable = new MyRunnableRunnable();
        // Runnable State
        Thread threadRunnable;
        threadRunnable = new Thread(myrunnablerunnable);
        threadRunnable.start();


        // Waiting State
        MyRunnableWaiting myrunnablewaiting;
        myrunnablewaiting = new MyRunnableWaiting();

        Thread threadWaiting = new Thread(myrunnablewaiting);
        threadWaiting.start();

        // Running State
        MyRunnableRunning myrunnablerunning;
        myrunnablerunning = new MyRunnableRunning();
        Thread threadRunning = new Thread(myrunnablerunning);
        threadRunning.start();

        // Dead State
        MyRunnableDead myrunnabledead;
        myrunnabledead = new MyRunnableDead();
        Thread threadDead = new Thread(myrunnabledead);
        threadDead.start();
    }
}

class MyRunnableNew implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in the New state.");
    }
}

class MyRunnableRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in the Runnable state.");
    }
}

class MyRunnableWaiting implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in the Waiting state.");
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnableRunning implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in the Running state.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + (i + 1));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnableDead implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in the Dead state.");
    }
}

// The output of the above program is shown as below
/*
Thread in the New state.
Thread in the Runnable state.
Thread in the Waiting state.
Thread in the Running state.
Thread in the Dead state.
Iteration 1
Iteration 2
Iteration 3
Iteration 4
Iteration 5

 */