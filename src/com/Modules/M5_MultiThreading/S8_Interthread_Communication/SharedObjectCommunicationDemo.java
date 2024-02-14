package com.Modules.M5_MultiThreading.S8_Interthread_Communication;

class SharedObject_1 {
    private int value = -1; // Initialize value to -1

    public synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int newValue) {
        this.value = newValue;
        notify(); // Notify waiting threads when value is updated
    }
}

class ProducerThread_1 extends Thread {
    private SharedObject_1 sharedObject;
    private int iterations;

    public ProducerThread_1(SharedObject_1 sharedObject, int iterations) {
        this.sharedObject = sharedObject;
        this.iterations = iterations;
    }

    public void run() {
        for (int i = 0; i < iterations; i++) {
            sharedObject.setValue(i);
            System.out.println("Producer produced: " + i);
            try {
                Thread.sleep(1000); // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerThread_1 extends Thread {
    private SharedObject_1 sharedObject;
    private int iterations;

    public ConsumerThread_1(SharedObject_1 sharedObject, int iterations) {
        this.sharedObject = sharedObject;
        this.iterations = iterations;
    }

    public void run() {
        int value;
        for (int i = 0; i < iterations; i++) {
            synchronized (sharedObject) {
                while (sharedObject.getValue() == -1) {
                    try {
                        sharedObject.wait(); // Wait until value is available
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                value = sharedObject.getValue();
                sharedObject.setValue(-1); // Reset value after consuming
            }
            System.out.println("Consumer consumed: " + value);
        }
    }
}

public class SharedObjectCommunicationDemo {
    public static void main(String[] args) {
        SharedObject_1 sharedObject_1RefObj;
        sharedObject_1RefObj = new SharedObject_1();
        int numIterations = 5; // Number of iterations

        ProducerThread_1 producerThread;
        producerThread = new ProducerThread_1(sharedObject_1RefObj, numIterations);

        ConsumerThread_1 consumerThread;
        consumerThread = new ConsumerThread_1(sharedObject_1RefObj, numIterations);

        producerThread.start();
        consumerThread.start();
    }
}
// The output of the above program is shown as below
/*
Consumer consumed: 0
Producer produced: 0
Consumer consumed: 1
Producer produced: 1
Producer produced: 2
Consumer consumed: 2
Producer produced: 3
Consumer consumed: 3
Producer produced: 4
Consumer consumed: 4
 */