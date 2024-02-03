package com.modules.M5_MultiThreading.L99_Trials;

class Class3A implements Runnable{
    int i=0, n=5;
    public void run(){
        for (i = 0; i < n; i++) {
            System.out.print("Hi ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Class3B implements Runnable{
    int j=0, m=5;
    public void run(){
        for (int j = 0; j < m; j++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Trial3Runnable {
    public static void main(String[] args) {
        Runnable class3ARefObj;
        class3ARefObj = new Class3A();

        Runnable class3BRefObj;
        class3BRefObj = new Class3B();

        Thread t1RefObj;
        t1RefObj = new Thread(class3ARefObj);

        Thread t2RefObj;
        t2RefObj = new Thread(class3BRefObj);

        t2RefObj.setPriority(10);
        t1RefObj.setPriority(1);

        t1RefObj.start();
        t2RefObj.start();

    }
}
