package com.modules.M5_MultiThreading.L99_Trials;

class Class2A extends Thread{
    int i=0, n=10;
    @Override
    public void run(){
        super.run();
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

class Class2B extends Thread{
    int j=0, m=10;
    @Override
    public void run(){
        super.run();
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

public class Trial2 {
    public static void main(String[] args) {
        Class2A class2ARefObj;
        class2ARefObj = new Class2A();

        Class2B class2BRefObj;
        class2BRefObj = new Class2B();

        System.out.println("Display Default Priority of the Thread - 1: "+class2ARefObj.getPriority());
        System.out.println("Setting Maximum Priority for Thread 1");
        class2ARefObj.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Display Priority Of the Thread - 1 : "+class2ARefObj.getPriority());

        System.out.println("Display Default Priority of the Thread - 2: "+class2BRefObj.getPriority());
        System.out.println("Setting Minimum Priority for Thread 2");
        class2ARefObj.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Display Priority Of the Thread - 2 : "+class2ARefObj.getPriority());

        class2ARefObj.start();
        class2BRefObj.start();

    }
}
