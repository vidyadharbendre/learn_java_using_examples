# Synchronized Statements vs Synchronized Methods in Java

## What are Synchronized Statements and Synchronized Methods?

### Synchronized Statements:
Synchronized statements in Java are used to synchronize specific blocks of code within methods or code sections. With synchronized statements, you can explicitly specify the object on which to acquire a lock using the `synchronized` keyword followed by the object reference in parentheses.

### Synchronized Methods:
Synchronized methods in Java are used to automatically synchronize the entire method body. By declaring a method as synchronized, the Java Virtual Machine automatically acquires a lock on the current object (`this`) when the method is invoked, ensuring that only one thread can execute the method at a time.

## Why Use Synchronized Statements and Synchronized Methods?

### Synchronized Statements:
- Provides finer control over synchronization by allowing synchronization of specific code blocks within methods.
- Useful when different parts of a method require different synchronization locks.

### Synchronized Methods:
- Simplifies synchronization by automatically synchronizing the entire method body.
- Convenient for methods where all code inside needs to be executed atomically.

## When to Use Synchronized Statements and Synchronized Methods?

### Synchronized Statements:
- When different parts of a method need to be synchronized separately.
- When synchronization needs vary within the same method.

### Synchronized Methods:
- When the entire method body needs to be executed atomically.
- When simplicity and ease of use are preferred over fine-grained control.

## Where to Use Synchronized Statements and Synchronized Methods?

### Synchronized Statements:
- In methods with complex synchronization requirements.
- In scenarios where specific sections of code need to be synchronized.

### Synchronized Methods:
- In simple scenarios where the entire method body needs synchronization.
- In classes where atomicity of entire methods is critical.

## Who Uses Synchronized Statements and Synchronized Methods?

- Java developers and software engineers working on multithreaded applications.
- Developers building concurrent systems where data consistency is crucial.

## How to Use Synchronized Statements and Synchronized Methods?

### Synchronized Statements:
```java
public class Counter {
    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronize on the current object
            count++;
        }
    }

    // Other methods...
}
```
## Real-time Business Case: Banking Application
In a banking application, consider a scenario where multiple threads are accessing and modifying a shared bank account balance concurrently. In this case:

- Synchronized methods can be used to ensure that deposit and withdrawal operations are atomic and mutually exclusive.
- Synchronized statements can be used within the transfer method to synchronize specific blocks of code, such as deducting the amount from one account and adding it to another, ensuring consistency in the transfer process.

### Example: Synchronized Method

```java
public class BankAccount {
    private double balance;

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }

    // Other methods...
}

```