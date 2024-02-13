package com.Concepts.Keywords.Lambda;

class CounterHolder {
    private int sharedCounter;

    public void incrementCounter() {
        for (int i = 0; i < 10000; i++) {
            sharedCounter++;
        }
    }

    public int getSharedCounter() {
        return sharedCounter;
    }
}

public class MainWithLambda {
    public static void main(String[] args) {
        CounterHolder counterHolder = new CounterHolder();

        // With Lambda
        new Thread(() -> counterHolder.incrementCounter()).start();

        // Display the final value of the shared counter
        System.out.println("Final Shared Counter Value: " + counterHolder.getSharedCounter());
    }
}

