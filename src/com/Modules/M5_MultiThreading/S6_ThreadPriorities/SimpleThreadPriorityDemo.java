package com.Modules.M5_MultiThreading.S6_ThreadPriorities;

class MessageHi extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MessageHello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SimpleThreadPriorityDemo {
    public static void main(String[] args) {
        MessageHi messageHiRefObj = new MessageHi();
        MessageHello messageHelloRefObj = new MessageHello();

        // Set priority of Hi thread to a higher value
        messageHiRefObj.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        messageHiRefObj.start();
        messageHelloRefObj.start();
    }
}
