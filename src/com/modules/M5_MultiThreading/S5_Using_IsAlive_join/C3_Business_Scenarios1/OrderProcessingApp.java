package com.modules.M5_MultiThreading.S5_Using_IsAlive_join.C3_Business_Scenarios1;

class EmailNotificationThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " - Sending order confirmation emails...");
        // Simulate email sending process
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " - Emails sent successfully.");
    }
}

class InventoryUpdateThread extends Thread {
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " - Updating inventory...");
        // Simulate inventory update process
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " - Inventory updated successfully.");
    }
}

public class OrderProcessingApp {
    public static void main(String[] args) {
        EmailNotificationThread emailThreadRefObj;
        emailThreadRefObj = new EmailNotificationThread();
        InventoryUpdateThread inventoryThreadRefObj;
        inventoryThreadRefObj = new InventoryUpdateThread();

        // Start the email thread first
        emailThreadRefObj.start();

        // Wait for the email thread to complete before starting the inventory thread
        try {
            emailThreadRefObj.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the inventory thread after the email thread completes
        inventoryThreadRefObj.start();

        System.out.println("Order processing completed.");
    }
}

// The output of the above program is shown as below
/*
Thread 21 - Sending order confirmation emails...
Thread 21 - Emails sent successfully.
Order processing completed.
Thread 22 - Updating inventory...
Thread 22 - Inventory updated successfully.
 */