# 3 Marks Question:
# Discuss the Java Thread Model and Thread Creation in Java

## Java Thread Model:

The Java thread model allows concurrent execution of multiple tasks within a single program. Threads in Java are lightweight processes that share the same memory space, allowing for efficient multitasking. Java provides built-in support for creating and managing threads through the `Thread` class or the `Runnable` interface.

### Extending Thread Class:

You can create a new thread by extending the Thread class and overriding its run() method. This method contains the code that will be executed by the thread.

### Implementing Runnable Interface:

Alternatively, you can implement the Runnable interface and provide the thread's code in the run() method. Then, pass an instance of the class implementing Runnable to a Thread object.

## Example: Creating Threads in Java:

### 1. Extending Thread Class:

```java
// Define a class that extends Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// Creating and starting threads
public class Main {
    public static void main(String[] args) {
        // Creating thread objects
        MyThread thread1;
        thread1 = new MyThread();
        MyThread thread2;
        thread2 = new MyThread();

        // Starting threads
        thread1.start();
        thread2.start();
    }
}
```
## Explanation:
In the first example, we define a class MyThread that extends the Thread class. We override the run() method to define the task to be executed by the thread. We then create two instances of MyThread and start them using the start() method.

In the second example, we define a class MyRunnable that implements the Runnable interface. We implement the run() method with the thread's task. We then create instances of MyRunnable and pass them to Thread objects. The threads are started using the start() method.

## Conclusion:
The Java thread model provides a powerful mechanism for concurrent programming. By creating and managing threads, Java allows developers to execute multiple tasks simultaneously, improving program efficiency and responsiveness. Whether by extending the Thread class or implementing the Runnable interface, Java provides flexibility in creating and managing threads to suit different programming needs.