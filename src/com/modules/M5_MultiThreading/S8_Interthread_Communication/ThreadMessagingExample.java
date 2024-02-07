package com.modules.M5_MultiThreading.S8_Interthread_Communication;

class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class ProducerThread extends Thread {
    private Message message;

    public ProducerThread(Message message) {
        this.message = message;
    }

    public void run() {
        synchronized (message) {
            message.setContent("Hello from Producer");
            message.notify(); // Notify waiting thread
        }
    }
}

class ConsumerThread extends Thread {
    private Message message;

    public ConsumerThread(Message message) {
        this.message = message;
    }

    public void run() {
        synchronized (message) {
            try {
                message.wait(); // Wait for notification from producer
                System.out.println("Consumer received: " + message.getContent());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadMessagingExample {
    public static void main(String[] args) {
        Message sharedMessageRefObj;
        sharedMessageRefObj = new Message("");

        ProducerThread producerThreadRefObj;
        producerThreadRefObj = new ProducerThread(sharedMessageRefObj);
        ConsumerThread consumerThreadRefObj;
        consumerThreadRefObj = new ConsumerThread(sharedMessageRefObj);

        producerThreadRefObj.start();
        consumerThreadRefObj.start();
    }
}
