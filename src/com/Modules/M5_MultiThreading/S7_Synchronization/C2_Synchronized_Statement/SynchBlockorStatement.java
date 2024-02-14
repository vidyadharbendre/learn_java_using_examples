package com.Modules.M5_MultiThreading.S7_Synchronization.C2_Synchronized_Statement;


class Callme{
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }

}


class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(String msg, Callme target) {
        this.msg = msg;
        this.target = target;
        this.t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) { //synchronized block
            target.call(msg);
        }
    }
}

public class SynchBlockorStatement {
    public static void main(String[] args) {
        Callme targetRefObj;
        targetRefObj = new Callme();

        Caller callerRefObj1;
        callerRefObj1 = new Caller("Hello", targetRefObj);

        Caller callerRefObj2;
        callerRefObj2 = new Caller("Synchronized", targetRefObj);

        Caller callerRefObj3;
        callerRefObj3 = new Caller("World", targetRefObj);

        callerRefObj1.t.start();
        callerRefObj2.t.start();
        callerRefObj3.t.start();

        callerRefObj1.t.setPriority(10);
        callerRefObj2.t.setPriority(9);
        callerRefObj3.t.setPriority(1);
        try{
            callerRefObj1.t.join();
            callerRefObj2.t.join();
            callerRefObj3.t.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }


    }
}
/*
[Hello]
[Synchronized]
[World]
 */