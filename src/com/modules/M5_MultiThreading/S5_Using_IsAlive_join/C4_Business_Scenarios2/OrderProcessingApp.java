package com.modules.M5_MultiThreading.S5_Using_IsAlive_join.C4_Business_Scenarios2;

class PaymentProcessingThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " - Processing payment...");
        // Simulate payment processing
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " - Payment processed successfully.");
    }
}

class ShippingThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " - Shipping the order...");
        // Simulate shipping process
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " - Order shipped successfully.");
    }
}

public class OrderProcessingApp {
    public static void main(String[] args) {
        PaymentProcessingThread paymentThreadRefObj;
        paymentThreadRefObj = new PaymentProcessingThread();
        ShippingThread shippingThreadRefObj;
        shippingThreadRefObj = new ShippingThread();

        // Start the payment thread
        paymentThreadRefObj.start();

        // Wait for the payment thread to complete before starting the shipping thread
        try {
            paymentThreadRefObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the shipping thread after the payment thread completes
        shippingThreadRefObj.start();

        // Wait for both payment and shipping threads to complete before printing
        try {
            paymentThreadRefObj.join();
            shippingThreadRefObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order processing completed.");
    }
}

// The output of the above program is shown as below
/*

Thread 21 - Processing payment...
Thread 21 - Payment processed successfully.
Thread 22 - Shipping the order...
Thread 22 - Order shipped successfully.
Order processing completed.

 */