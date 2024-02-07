package com.modules.M5_MultiThreading.S7_Synchronization;

class IncrementCounterClass{
    int counter;

    public synchronized void incrementMethod(){
        counter++;
    }
}

public class SimpleSyncDemo1 {
    public static void main(String[] args) {
        IncrementCounterClass incCntRefObj;
        incCntRefObj = new IncrementCounterClass();

        Thread threadRefObj1;
        threadRefObj1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    incCntRefObj.incrementMethod();
                }
            }
        });

        Thread threadRefObj2;
        threadRefObj2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    incCntRefObj.incrementMethod();
                }
            }
        });

        threadRefObj1.start();
        threadRefObj2.start();
        try {
            threadRefObj1.join();
        } catch (InterruptedException e1) {
            throw new RuntimeException(e1);
        }
        try {
            threadRefObj2.join();
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }


        System.out.println("Counter : "+incCntRefObj.counter);

    }
}
