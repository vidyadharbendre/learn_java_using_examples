package com.Modules.M5_MultiThreading.S7_Synchronization;

class PrintNumbers {
    private final Object lock = new Object();

    public void printOdd() {
        synchronized (lock) {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd Number: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void printEven() {
        synchronized (lock) {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even Number: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class OddNumbersT extends Thread {
    private PrintNumbers printNumbers;

    public OddNumbersT(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        printNumbers.printOdd();
    }
}

class EvenNumbersT extends Thread {
    private PrintNumbers printNumbers;

    public EvenNumbersT(PrintNumbers printNumbers) {
        this.printNumbers = printNumbers;
    }

    @Override
    public void run() {
        printNumbers.printEven();
    }
}

public class SyncDemo2 {
    public static void main(String[] args) {
        PrintNumbers printNumbers;
        printNumbers = new PrintNumbers();

        OddNumbersT oddNumbersTRefObj;
        oddNumbersTRefObj = new OddNumbersT(printNumbers);

        EvenNumbersT evenNumbersTRefObj;
        evenNumbersTRefObj = new EvenNumbersT(printNumbers);

        oddNumbersTRefObj.start();
        evenNumbersTRefObj.start();
    }
}
