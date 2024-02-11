package com.Modules.M5_MultiThreading.S5_Thread_Runnable_Interface;

class OddNumbersInt implements Runnable{
    int i=1, n=10;

    public void run(){
        for (i = 1; i < n; i++) {
            if (i%2 != 0){
                System.out.println("Odd Number - : "+i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

//                try {
//                    Thread.sleep(1000);
//                }catch (InterruptedException e1) {
//                    throw new RuntimeException(e1);
//                }
            }
        }
    }
}

class EvenNumbersInt implements Runnable{
    int i=1, n=10;
    @Override
    public void run(){
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


public class SyncDemo2Int {
    public static void main(String[] args) {
        OddNumbersInt oddNumbersIntRefObj;
        oddNumbersIntRefObj = new OddNumbersInt();
        EvenNumbersInt evenNumbersIntRefObj;
        evenNumbersIntRefObj = new EvenNumbersInt();

        // Creating threads for OddNumbersInt and EvenNumbersInt objects
        Thread oddThread;
        oddThread = new Thread(oddNumbersIntRefObj);
        Thread evenThread;
        evenThread = new Thread(evenNumbersIntRefObj);

        // Start the threads
        oddThread.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        evenThread.start();
    }
}

// The output of the above program is shown as below
/*
Odd Number - : 1
Even Number - : 2
Odd Number - : 3
Even Number - : 4
Odd Number - : 5
Even Number - : 6
Odd Number - : 7
Even Number - : 8
Odd Number - : 9
 */