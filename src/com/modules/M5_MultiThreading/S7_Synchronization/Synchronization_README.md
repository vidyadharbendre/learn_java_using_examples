# Java Thread Synchronization

## What is Thread Synchronization in Java?

Thread Synchronization in Java is a technique used to control the access of multiple threads to shared resources to prevent data inconsistencies. It ensures that only one thread can access the shared resource at a time, avoiding conflicts and maintaining data integrity.

## Why use Thread Synchronization?

Thread Synchronization is essential when multiple threads access shared resources concurrently. Without synchronization, data corruption or unexpected behavior may occur due to interleaved execution. Synchronization helps in achieving consistency and correctness in multithreaded applications.

## When to use Thread Synchronization?

Thread Synchronization is required whenever multiple threads operate on shared data, databases, or critical sections. It becomes crucial when avoiding race conditions, deadlock situations, or maintaining the consistency of shared resources is necessary.

## Where is Thread Synchronization used in Java?

Thread Synchronization is used in Java applications wherever multithreading is employed and shared resources are accessed. This includes scenarios such as updating shared data structures, handling critical sections, or managing access to databases.

## Who benefits from Thread Synchronization?

Developers and applications benefit from Thread Synchronization. It allows developers to control access to shared resources, ensuring that only one thread modifies the resource at a time. This prevents conflicts and enhances the reliability of multithreaded applications.

## How to achieve Thread Synchronization?

### Example:

```java
class SharedResource {
    synchronized void printMessage(String message) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " " + message);
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SynchronizedThread extends Thread {
    private SharedResource sharedResource;
    private String message;

    SynchronizedThread(SharedResource sharedResource, String message) {
        this.sharedResource = sharedResource;
        this.message = message;
    }

    public void run() {
        sharedResource.printMessage(message);
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        SharedResource sharedResourceRefObj;
        sharedResourceRefObj = new SharedResource();

        SynchronizedThread thread1RefObj;
        thread1RefObj = new SynchronizedThread(sharedResourceRefObj, "Hello");
        
        SynchronizedThread thread2RefObj;
        thread2RefObj = new SynchronizedThread(sharedResourceRefObj, "World");

        thread1RefObj.start();
        thread2RefObj.start();
    }
}
```
n this example, a SharedResource class has a synchronized method printMessage that ensures only one thread can execute it at a time. Two threads (thread1 and thread2) access this shared resource concurrently, preventing conflicts.