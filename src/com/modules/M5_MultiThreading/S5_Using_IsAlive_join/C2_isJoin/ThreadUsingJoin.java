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
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        // Wait for threads to complete
        try {
            thread1.join();
            thread2.join();
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