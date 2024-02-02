package com.modules.M5_MultiThreading.S1_ThreadModel;

class DefaultThread extends Thread {
    public DefaultThread() {
        super();
    }
}

class DefaultRunnable implements Runnable {
    public DefaultRunnable() {
        super();
    }

    @Override
    public void run() {
        System.out.println("Overriding run to display");
    }
}

public class DefaultIdentityThread {
    public static void main(String[] args) {
        DefaultThread defaultThreadRefObj;
        defaultThreadRefObj = new DefaultThread();
        System.out.println("Default Name of the Thread : " + defaultThreadRefObj.getName());

        DefaultRunnable defaultRunnableRefObj;
        defaultRunnableRefObj = new DefaultRunnable();

        // Set the default name explicitly for the thread created with DefaultRunnable
        Thread threadRefObj;
        threadRefObj = new Thread(defaultRunnableRefObj);
        threadRefObj.start();
        System.out.println("Default Name of the Thread created with DefaultRunnable : " + threadRefObj.getName());
    }
}
