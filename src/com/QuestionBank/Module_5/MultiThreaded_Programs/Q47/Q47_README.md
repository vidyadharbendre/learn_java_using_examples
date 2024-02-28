# 5 Marks Question
# Describe interthread communication in Java. 
# Provide examples demonstrating the usage of wait(), notify(), and notifyAll() methods.

# Interthread Communication in Java

Interthread communication in Java refers to the mechanism where threads communicate and synchronize their actions to ensure proper execution and coordination of tasks. Java provides three key methods for interthread communication: `wait()`, `notify()`, and `notifyAll()`.

## `wait()`

The `wait()` method is used to make a thread temporarily pause its execution and wait until another thread notifies it to resume. It must be called from within a synchronized block or method. When a thread calls `wait()`, it releases the lock on the object's monitor, allowing other threads to acquire it and perform synchronized operations.

### Example:

```java
class SharedResource {
    public synchronized void doSomething() {
        System.out.println(Thread.currentThread().getName() + " is waiting...");
        try {
            wait(); // Thread waits until notified
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " resumed execution.");
    }
}

class MyRunnable implements Runnable {
    private SharedResource resource;

    public MyRunnable(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.doSomething();
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread thread1 = new Thread(new MyRunnable(resource), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(resource), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
```

### notify()
The notify() method is used to notify a single waiting thread to resume execution. It must be called from within a synchronized block or method on the same object that the waiting thread is synchronized on. It wakes up one of the threads waiting on the object's monitor, allowing it to continue execution.

### notifyAll()
The notifyAll() method is used to notify all waiting threads to resume execution. It must be called from within a synchronized block or method on the same object that the waiting threads are synchronized on. It wakes up all threads waiting on the object's monitor, allowing them to continue execution.

### Conclusion
Interthread communication is essential for coordinating the activities of multiple threads in Java. By using wait(), notify(), and notifyAll() methods, threads can efficiently synchronize their actions and communicate with each other, leading to well-coordinated execution of tasks.
