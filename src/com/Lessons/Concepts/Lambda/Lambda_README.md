# Lambda Expressions in Java

## Overview

Lambda expressions, introduced in Java 8, provide a concise way to represent anonymous functions. They are particularly useful for simplifying code when working with functional interfaces (interfaces with a single abstract method).

## Why

Lambda expressions were introduced to Java to enhance code readability and reduce boilerplate code, especially in scenarios involving functional interfaces.

## What

Lambda expressions allow you to write more compact and expressive code by representing anonymous functions. They facilitate a more functional programming style in Java.

## When

Lambda expressions are most beneficial when working with functional interfaces, such as when using the new features introduced in Java 8, like the Streams API.

## Where

Lambda expressions can be used in various places within Java code, especially in scenarios where anonymous functions are required, such as in event listeners or parallel processing.

## How

Here's an example demonstrating the use of lambda expressions:

### Without Lambda

```java
class CounterHolder {
    private int sharedCounter;

    public void incrementCounter() {
        for (int i = 0; i < 10000; i++) {
            sharedCounter++;
        }
    }

    public int getSharedCounter() {
        return sharedCounter;
    }
}

public class Main {
    public static void main(String[] args) {
        CounterHolder counterHolder = new CounterHolder();

        // Without Lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                counterHolder.incrementCounter();
            }
        }).start();

        // Display the final value of the shared counter
        System.out.println("Final Shared Counter Value: " + counterHolder.getSharedCounter());
    }
}
```
# With Lambda
```java
class CounterHolder {
    private int sharedCounter;

    public void incrementCounter() {
        for (int i = 0; i < 10000; i++) {
            sharedCounter++;
        }
    }

    public int getSharedCounter() {
        return sharedCounter;
    }
}

public class Main {
    public static void main(String[] args) {
        CounterHolder counterHolder = new CounterHolder();

        // With Lambda
        new Thread(() -> counterHolder.incrementCounter()).start();

        // Display the final value of the shared counter
        System.out.println("Final Shared Counter Value: " + counterHolder.getSharedCounter());
    }
}

```
## Key Points
Lambda expressions provide a concise syntax for representing anonymous functions.
They are often used in conjunction with functional interfaces.
Lambda expressions can improve code readability and reduce boilerplate code.