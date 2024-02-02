# Java Thread Messaging

## What is Thread Messaging in Java?

Thread Messaging in Java involves communication between threads using shared objects or messages to coordinate their activities. It allows threads to exchange information, synchronize their execution, and collaborate in a multithreaded environment.

## Why use Thread Messaging?

Thread Messaging is crucial for scenarios where coordination and communication between threads are necessary. It facilitates the sharing of information, synchronization of activities, and enables threads to work together towards a common goal.

## When to use Thread Messaging?

Thread Messaging is used when threads need to pass information, signals, or data between each other. It's beneficial in scenarios where collaboration and coordination are required to accomplish tasks in a multithreaded application.

## Where is Thread Messaging used in Java?

Thread Messaging is employed in Java applications wherever multiple threads need to communicate and share information. This includes scenarios such as producer-consumer problems, parallel processing, or any situation where threads collaborate to achieve a specific outcome.

## Who benefits from Thread Messaging?

Developers and applications benefit from Thread Messaging. It allows developers to design efficient communication mechanisms between threads, ensuring proper coordination and data sharing. Applications can achieve better performance and reliability through effective messaging.

## How to achieve Thread Messaging?

### Example:

```java
class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
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
        Message sharedMessage = new Message("");

        ProducerThread producerThread = new ProducerThread(sharedMessage);
        ConsumerThread consumerThread = new ConsumerThread(sharedMessage);

        producerThread.start();
        consumerThread.start();
    }
}
```
