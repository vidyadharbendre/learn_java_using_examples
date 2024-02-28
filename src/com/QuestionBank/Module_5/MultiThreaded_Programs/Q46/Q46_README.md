# 4 Marks Question

# Explain the concept of thread priorities in Java. Provide examples demonstrating thread priority settings.
# Understanding Thread Priorities in Java

In Java, thread priorities are used to indicate the importance or urgency of a thread's execution relative to other threads in the system. Thread priorities are represented by integer values ranging from 1 to 10, where 1 is the lowest priority and 10 is the highest priority. The default priority of a thread is inherited from its parent thread.

Java provides constants to represent thread priorities:

- `Thread.MIN_PRIORITY` (1): Minimum priority.
- `Thread.NORM_PRIORITY` (5): Normal priority (default).
- `Thread.MAX_PRIORITY` (10): Maximum priority.

Thread scheduling is ultimately controlled by the underlying operating system, and higher-priority threads are typically given preference over lower-priority threads for execution. However, it's important to note that thread priorities are only hints to the scheduler and may not be strictly honored, especially in heavily loaded systems.

## Example: Thread Priority Settings

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName() +
                           ", Priority: " + Thread.currentThread().getPriority());
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Set custom priorities
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.MAX_PRIORITY); // Highest priority

        thread1.start();
        thread2.start();
    }
}
```
In this example, we define a class MyThread that extends Thread. Inside the run() method, the thread prints its name and priority. In the Main class, we create two instances of MyThread and set their priorities using the setPriority() method. thread1 is set to the minimum priority (Thread.MIN_PRIORITY), while thread2 is set to the maximum priority (Thread.MAX_PRIORITY). We then start both threads.

### Output:

Thread running: Thread-0, Priority: 1
Thread running: Thread-1, Priority: 10

In the output, you'll notice that thread1 (with the lowest priority) runs first, followed by thread2 (with the highest priority). This demonstrates how thread priorities influence the scheduling of threads by the JVM. However, the actual behavior may vary depending on the underlying operating system and the workload of the system.