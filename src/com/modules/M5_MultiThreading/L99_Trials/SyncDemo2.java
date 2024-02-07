package com.modules.M5_MultiThreading.L99_Trials;

class OddNumbersT extends Thread{
    int i=1, n=10;
    @Override
    public void run(){
        super.run();
        for (i = 1; i < n; i++) {
            if (i%2 != 0){
                System.out.println("Odd Number - : "+i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e1) {
                    throw new RuntimeException(e1);
                }
            }
        }
    }
}

class EvenNumbersT extends Thread{
    int i=1, n=10;
    @Override
    public void run(){
        super.run();
        for (i = 1; i < n; i++) {
            if (i%2 == 0){
                System.out.println("Even Number - : "+i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e1) {
                    throw new RuntimeException(e1);
                }
            }
        }
    }
}


public class SyncDemo2 {
    public static void main(String[] args) {
        OddNumbersT oddNumbersTRefObj;
        oddNumbersTRefObj = new OddNumbersT();


//        oddNumbersTRefObj.setPriority(Thread.MAX_PRIORITY);
        oddNumbersTRefObj.start();
    //    System.out.println("Priority of the Odd Thread : "+oddNumbersTRefObj.getPriority());
        EvenNumbersT evenNumbersTRefObj;
        evenNumbersTRefObj = new EvenNumbersT();
//        evenNumbersTRefObj.setPriority(Thread.MAX_PRIORITY);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenNumbersTRefObj.start();
    }
}
