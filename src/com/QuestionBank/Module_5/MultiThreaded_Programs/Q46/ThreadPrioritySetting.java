package com.QuestionBank.Module_5.MultiThreaded_Programs.Q46;
/*
# 4 Marks Question
# Explain the concept of thread priorities in Java. Provide examples demonstrating thread priority settings.
*/

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName() +
                ", Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPrioritySetting {
    public static void main(String[] args) {
        MyThread thread1;
        thread1 = new MyThread();
        MyThread thread2;
        thread2 = new MyThread();

        // Set custom priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Highest priority

        thread1.start();
        thread2.start();
    }
}
// The output of the above program is shown as below

/*
Thread running: Thread-1, Priority: 10
Thread running: Thread-0, Priority: 1
 */

