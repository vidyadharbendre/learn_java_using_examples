package com.Modules.M5_MultiThreading.S4_CreateMultipleThreads;

public class MultiThreadingDemo1 {
    public static void main(String[] args) {
        MyThread mythreadRefObj1;
        mythreadRefObj1 = new MyThread("thread 1");

        MyThread mythreadRefObj2;
        mythreadRefObj2 = new MyThread("thread 2");

        mythreadRefObj1.start();
        mythreadRefObj2.start();

    }
}


class MyThread extends Thread{
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        int i;
        for(i=0; i<=5; i++){
            System.out.println(threadName + ": "+i);
        }


    }
}

// The output of the above program is shown as below
/*
thread 1: 0
thread 1: 1
thread 1: 2
thread 1: 3
thread 1: 4
thread 1: 5
thread 2: 0
thread 2: 1
thread 2: 2
thread 2: 3
thread 2: 4
thread 2: 5
 */