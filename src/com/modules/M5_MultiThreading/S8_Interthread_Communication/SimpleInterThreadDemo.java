package com.modules.M5_MultiThreading.S8_Interthread_Communication;


class Q{
    private int num;

    public Q(int num) {
        this.num = num;
    }

    public void getNum() {
        System.out.println("Get num value : "+num);
    }

    public void setNum(int num) {
        System.out.println("Set num value : "+num);
        this.num = num;
    }
}

class Producer implements Runnable{
    Q qRefObj;

    public Producer(Q qRefObj) {
        this.qRefObj = qRefObj;

        Thread t1_RefObj;
        t1_RefObj = new Thread(this, "Producer");
        t1_RefObj.start();

    }

    @Override
    public void run() {
        int i=0;
        while(true){
            qRefObj.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                throw new RuntimeException(e1);
            }
        }
    }
}

class Consumer implements Runnable{
    Q qRefObj;

    public Consumer(Q qRefObj) {
        this.qRefObj = qRefObj;

        Thread t2_RefObj;
        t2_RefObj = new Thread(this, "Consumer");
        t2_RefObj.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            qRefObj.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                throw new RuntimeException(e1);
            }
        }
    }
}




public class SimpleInterThreadDemo {
    public static void main(String[] args) {

    }
}
