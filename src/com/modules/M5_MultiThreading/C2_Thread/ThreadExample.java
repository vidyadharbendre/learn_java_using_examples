package com.modules.M5_MultiThreading.C2_Thread;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1_RefObj;
        t1_RefObj = new MyThread();
        MyThread t2_RefObj;
        t2_RefObj = new MyThread();
        t1_RefObj.start();
        t2_RefObj.start();
    }
}
