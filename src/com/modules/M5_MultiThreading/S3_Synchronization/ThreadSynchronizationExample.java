package com.modules.M5_MultiThreading.S3_Synchronization;

class SharedResource {
    synchronized void printMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " " + message);
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SynchronizedThread extends Thread {
    private SharedResource sharedResource;
    private String message;

    SynchronizedThread(SharedResource sharedResource, String message) {
        this.sharedResource = sharedResource;
        this.message = message;
    }

    public void run() {
        sharedResource.printMessage(message);
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResourceRefObj;
        sharedResourceRefObj = new SharedResource();

        SynchronizedThread thread1RefObj;
        thread1RefObj = new SynchronizedThread(sharedResourceRefObj, "Hello");
        SynchronizedThread thread2RefObj;
        thread2RefObj = new SynchronizedThread(sharedResourceRefObj, "World");

        thread1RefObj.start();
        thread2RefObj.start();
    }
}

// The output of the above program  is shown as below/
/*
21 Hello
21 Hello
21 Hello
21 Hello
21 Hello
22 World
22 World
22 World
22 World
22 World
 */