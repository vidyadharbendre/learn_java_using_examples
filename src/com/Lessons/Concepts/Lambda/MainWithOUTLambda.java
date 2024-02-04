package com.Lessons.Concepts.Lambda;

class T1Runnable implements Runnable {
    private MainWithOUTLambda counterHolderWH;

    public T1Runnable(MainWithOUTLambda counterHolderWH) {
        this.counterHolderWH = counterHolderWH;
    }

    @Override
    public void run() {
        counterHolderWH.incrementCounter();
    }
}

public class MainWithOUTLambda {
    private int sharedCounter;

    // Use synchronized to make the incrementCounter method thread-safe
    public synchronized void incrementCounter() {
        for (int i = 0; i < 10000; i++) {
            sharedCounter++;
        }
    }

    public int getSharedCounter() {
        return sharedCounter;
    }

    public static void main(String[] args) {
        MainWithOUTLambda counterHolderRefObj = new MainWithOUTLambda();

        T1Runnable t1Runnable = new T1Runnable(counterHolderRefObj);
        Thread t1_thread = new Thread(t1Runnable);

        t1_thread.start();

        // Display the final value of the shared counter
        System.out.println("Final Shared Counter Value: " + counterHolderRefObj.getSharedCounter());
    }
}
