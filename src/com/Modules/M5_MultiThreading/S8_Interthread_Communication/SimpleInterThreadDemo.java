package com.Modules.M5_MultiThreading.S8_Interthread_Communication;

class Q {
    private int num;
    private boolean valueSet = false;
    // Flag to indicate whether a value has been set

    public synchronized void getNum() {
        // Wait until the value is set by the producer
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer got num value : " + num);
        valueSet = false;
        // Reset the flag after consuming the value
        notify();
        // Notify the producer that the consumer has consumed the value
    }

    public synchronized void setNum(int num) {
        // Wait until the value is consumed by the consumer
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Producer set num value : " + num);
        this.num = num;
        valueSet = true; // Set the flag to indicate that a value has been set
        notify();
        // Notify the consumer that a new value is available
    }
}

class Producer implements Runnable {
    private Q qRefObj;
    private int count;

    public Producer(Q qRefObj, int count) {
        this.qRefObj = qRefObj;
        this.count = count;

        Thread t1_RefObj;
        t1_RefObj = new Thread(this, "Producer");
        t1_RefObj.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            qRefObj.setNum(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    private Q qRefObj;
    private int count;

    public Consumer(Q qRefObj, int count) {
        this.qRefObj = qRefObj;
        this.count = count;

        Thread t2_RefObj;
        t2_RefObj = new Thread(this, "Consumer");
        t2_RefObj.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            qRefObj.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SimpleInterThreadDemo {
    public static void main(String[] args) {
        Q q = new Q();
        int numIterations = 10; // Number of iterations

        new Producer(q, numIterations);
        new Consumer(q, numIterations);
    }
}
// The output of the above program is shown as below
/*
Producer set num value : 0
Consumer got num value : 0
Producer set num value : 1
Consumer got num value : 1
Producer set num value : 2
Consumer got num value : 2
Producer set num value : 3
Consumer got num value : 3
Producer set num value : 4
Consumer got num value : 4
Producer set num value : 5
Consumer got num value : 5
Producer set num value : 6
Consumer got num value : 6
Producer set num value : 7
Consumer got num value : 7
Producer set num value : 8
Consumer got num value : 8
Producer set num value : 9
Consumer got num value : 9
 */