# Java Thread Model

## What is the Java Thread Model?

The Java Thread Model is a mechanism that allows concurrent execution of multiple tasks within a Java program. A thread, in the context of Java, is the smallest unit of execution that runs independently, and threads share the same resources but execute independently.

## Why use Threads in Java?

Threads are used to achieve parallelism and concurrency in Java programs, allowing tasks to execute simultaneously. This is crucial for improving the performance of applications, especially in scenarios where multiple operations need to be performed concurrently.

## When to use Threads?

Threads are beneficial when dealing with tasks that can be executed independently and concurrently, such as background processing, handling multiple requests in web applications, or parallelizing computations.

## Where are Threads used in Java?

Threads can be employed in various applications, including desktop applications, server applications, web applications, and mobile applications. Any scenario where parallel execution is beneficial can leverage Java threads.

## Who benefits from the Java Thread Model?

Developers and applications benefit from the Java Thread Model. Developers can write concurrent programs to enhance performance, responsiveness, and scalability. Applications, in turn, can efficiently handle multiple tasks simultaneously.

## How does the Java Thread Model work?

### Example:

```java
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1RefObj;
        t1RefObj = new MyThread();
        MyThread t2RefObj;
        t2RefObj = new MyThread();
        t1RefObj.start();
        t2RefObj.start();
    }
}
```
In this example, MyThread extends the Thread class. The run method defines the task to be executed concurrently. In the main method, two threads (t1 and t2) are created and started using the start() method. The threads run concurrently, printing values.
