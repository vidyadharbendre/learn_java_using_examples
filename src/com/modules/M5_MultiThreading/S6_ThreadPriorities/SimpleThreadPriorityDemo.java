package com.modules.M5_MultiThreading.S6_ThreadPriorities;


class MessageHi extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MessageHello extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class SimpleThreadPriorityDemo {
    public static void main(String[] args) {
        MessageHi messageHiRefObj;
        messageHiRefObj = new MessageHi();



        messageHiRefObj.start();

        //print the current priority
//        System.out.println("Priority of the Hi Thread : "+messageHiRefObj.getPriority());

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        MessageHello messageHelloRefObj;
        messageHelloRefObj = new MessageHello();
        messageHelloRefObj.start();

//        messageHelloRefObj.setPriority(10);
//        System.out.println("Priority of the Hello Thread : "+messageHelloRefObj.getPriority());

//        messageHiRefObj.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of the Hi Thread : "+messageHiRefObj.getPriority());



    }
}
