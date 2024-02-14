package com.Modules.M5_MultiThreading.S8_Interthread_Communication;

class Q {
    private int num;
    private boolean valueSet = false;

    public synchronized void getNum() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer got num value : " + num);
        valueSet = false;
        notify();
    }

    public synchronized void setNum(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Producer set num value : " + num);
        this.num = num;
        valueSet = true;
        notify();
    }
}

class Producer implements Runnable {
    private Q qRefObj;
    private int count;

    public Producer(Q qRefObj, int count) {
        this.qRefObj = qRefObj;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (qRefObj) {
                qRefObj.setNum(i);
            }
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
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            synchronized (qRefObj) {
                qRefObj.getNum();
            }
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
        Q q;
        q = new Q();
        int numIterations = 5; // Number of iterations

        Thread producerThread;
        producerThread = new Thread(new Producer(q, numIterations));

        Thread consumerThread;
        consumerThread = new Thread(new Consumer(q, numIterations));

        producerThread.start();
        consumerThread.start();
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
 */