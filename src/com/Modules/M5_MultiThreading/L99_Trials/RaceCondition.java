package com.Modules.M5_MultiThreading.L99_Trials;


class Counter{
    private int count;

    public Counter() {
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount(){
        count++;
    }

    public void displayCount(){
        System.out.println("Current value of the count : "+getCount());
    }
}


class TH1 implements Runnable{

    @Override
    public void run() {

    }
}




public class RaceCondition {
    public static void main(String[] args) {
        Counter cnt;
        cnt = new Counter();

        for (int i = 0; i < 3; i++) {
            cnt.incrementCount();
        }

        cnt.displayCount();


    }
}
