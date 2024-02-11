# Java Interthread Communication

## What is Interthread Communication in Java?

Interthread communication in Java involves coordination and exchange of data between threads. It enables threads to work together, synchronize their execution, and share information in a multithreaded environment.

## Why use Interthread Communication?

Interthread communication is crucial for scenarios where coordination and communication between threads are necessary. It facilitates the sharing of information, synchronization of activities, and enables threads to work together towards a common goal.

## When to use Interthread Communication?

Interthread communication is used when threads need to pass information, signals, or data between each other. It's beneficial in scenarios where collaboration and coordination are required to accomplish tasks in a multithreaded application.

## Where is Interthread Communication used in Java?

Interthread communication is employed in Java applications wherever multiple threads need to communicate and share information. This includes scenarios such as producer-consumer problems, parallel processing, or any situation where threads collaborate to achieve a specific outcome.

## Who benefits from Interthread Communication?

Developers and applications benefit from interthread communication. It allows developers to design efficient communication mechanisms between threads, ensuring proper coordination and data sharing. Applications can achieve better performance and reliability through effective interthread communication.

## How to achieve Interthread Communication?

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

public class InterthreadCommunicationExample {
    public static void main(String[] args) {
        Message sharedMessage = new Message("");

        ProducerThread producerThread = new ProducerThread(sharedMessage);
        ConsumerThread consumerThread = new ConsumerThread(sharedMessage);

        producerThread.start();
        consumerThread.start();
    }
}
```
