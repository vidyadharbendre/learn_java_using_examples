package com.modules.M5_MultiThreading.S5_Using_IsAlive_join.C2_isJoin;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadUsingJoin {
    public static void main(String[] args) {
        MyThread thread1RefObj;
        thread1RefObj = new MyThread();
        MyThread thread2RefObj;
        thread2RefObj = new MyThread();

        thread1RefObj.start();
        thread2RefObj.start();

        // Wait for threads to complete
        try {
            thread1RefObj.join();
            thread2RefObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

//The output of the above program is shown as below
/*
21 - Count: 1
22 - Count: 1
22 - Count: 2
21 - Count: 2
21 - Count: 3
22 - Count: 3
22 - Count: 4
21 - Count: 4
22 - Count: 5
21 - Count: 5
 */