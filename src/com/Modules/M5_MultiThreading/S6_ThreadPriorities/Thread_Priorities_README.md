# Java Thread Priorities

## What are Thread Priorities in Java?

Thread priorities in Java determine the order in which threads should be scheduled for execution. Threads with higher priority are given preference over threads with lower priority. Priority is represented by an integer value between `Thread.MIN_PRIORITY` (1) and `Thread.MAX_PRIORITY` (10).

## Why use Thread Priorities?

Thread priorities help control the execution order of threads in a multithreaded program. They provide a mechanism to influence the scheduling decisions made by the Java Virtual Machine (JVM), allowing developers to manage the relative importance of different threads.

## When to use Thread Priorities?

Thread priorities are useful when specific threads need to be given precedence or when it's necessary to control the order of execution in a multithreaded application. It's important to use priorities judiciously, considering the overall system performance.

## Where are Thread Priorities used in Java?

Thread priorities can be set and utilized in Java applications wherever multithreading is employed. This includes scenarios such as concurrent processing, background tasks, or any situation where the order of execution is significant.

## Who benefits from Thread Priorities?

Developers and applications benefit from thread priorities in Java. By setting priorities, developers can guide the JVM in making informed decisions about thread scheduling, ensuring that critical tasks or threads with higher importance are executed first.

## How to set Thread Priorities?

### Example:

```java
class PriorityThread extends Thread {
    public void run() {
        System.out.println("Thread with ID " + Thread.currentThread().getId() +
                " and Priority " + Thread.currentThread().getPriority() + " is running");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread thread1RefObj;
        thread1RefObj = new PriorityThread();
        PriorityThread thread2RefObj;
        thread2RefObj = new PriorityThread();

        // Set thread priorities
        thread1RefObj.setPriority(Thread.MIN_PRIORITY);
        thread2RefObj.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        thread1RefObj.start();
        thread2RefObj.start();
    }
}
```
In this example, two threads (thread1 and thread2) are created, and their priorities are set using the setPriority method. The threads are then started, and their execution order may be influenced by their assigned priorities.