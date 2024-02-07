# Java Thread Class: Common Methods

## Overview

The `Thread` class in Java provides various methods to manage and control the execution of threads. Understanding these methods is crucial for effective multithreaded programming.

## Thread Methods

### 1. `start()`

#### Description:

The `start()` method is used to begin the execution of a thread. It invokes the `run()` method, and the thread begins its lifecycle.

#### Example:

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadStartExample {
    public static void main(String[] args) {
        MyThread myThread;
        myThread = new MyThread();
        myThread.start(); // Start the thread
    }
}
```
### 2. `run()`

#### Description:
   The `run()` method contains the code that constitutes the new thread. It is invoked when start() is called and should be overridden to define the thread's behavior.

### 3. `sleep(long millis)`

#### Description:
The sleep() method pauses the execution of the current thread for the specified number of milliseconds, allowing other threads to run during this time.

#### Example
```java
class SleepExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

```

### 4. `join()`

#### Description:
The join() method allows one thread to wait for the completion of another thread. It is often used to ensure that a thread completes its execution before proceeding.
#### Example:
```java
class JoinExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        JoinExample joinExample;
        joinExample = new JoinExample();
        joinExample.start();

        try {
            joinExample.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues...");
    }
}

```

### 5. `isAlive()`

#### Description:
The isAlive() method checks whether a thread is still alive. It returns true if the thread is active, otherwise false.

#### Example
```java
class IsAliveExample extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        IsAliveExample isAliveExample;
        isAliveExample = new IsAliveExample();
        isAliveExample.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is thread alive? " + isAliveExample.isAlive());
    }
}

```

### 6. `getId()`

#### Description:
The getId() method returns the identifier of a thread, which is a unique long value assigned to each thread.
#### Example

```java
class IdExample extends Thread {
    public void run() {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        IdExample idExample;
        idExample = new IdExample();
        idExample.start();
    }
}

```