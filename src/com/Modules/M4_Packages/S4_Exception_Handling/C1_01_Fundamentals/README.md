# Java Exception Handling Guide

## What are Exceptions?

An exception is an event that disrupts the normal flow of a program during its execution. It represents an abnormal condition or error.

### Why do exceptions occur?

Exceptions occur when unexpected situations or errors arise during program execution, such as dividing by zero, accessing a null object, or attempting to read from a file that doesn't exist.

## Types of Exceptions

### What are the different types of exceptions in Java?

There are two main types of exceptions: checked exceptions and unchecked exceptions.

### What are Checked Exceptions?

Checked exceptions are exceptions that are checked at compile-time. They include exceptions derived from `Exception` (except `RuntimeException` and its subclasses).

### What are Unchecked Exceptions?

Unchecked exceptions, also known as runtime exceptions, are exceptions that are not checked at compile-time. They include exceptions derived from `RuntimeException` and its subclasses.

### Give examples of Checked Exceptions.

Examples include `IOException`, `ClassNotFoundException`, and `SQLException`.

### Give examples of Unchecked Exceptions.

Examples include `NullPointerException`, `ArrayIndexOutOfBoundsException`, and `ArithmeticException`.

## Exception Handling

### Why is exception handling important?

Exception handling is crucial for gracefully handling errors and preventing abrupt program termination. It allows the program to recover from unexpected situations.

### How do you handle exceptions in Java?

Exceptions are handled using try-catch blocks. The try block contains the code that might throw an exception, and the catch block handles the exception if it occurs.

### When should you use a finally block?

The finally block is used to specify code that must be executed, regardless of whether an exception is thrown or not. It is commonly used for cleanup operations.

## Exception Propagation

### How are exceptions propagated in Java?

Exceptions can be propagated through the call stack. When a method encounters an exception and doesn't handle it, the exception is propagated to the calling method.

### What is the role of the throws keyword?

The `throws` keyword is used in a method signature to declare that the method might throw certain exceptions. It informs the calling code about the possible exceptions that need to be handled.

## Best Practices

### When should you catch specific exceptions instead of a general Exception?

It's generally recommended to catch specific exceptions rather than a general Exception to handle different types of errors appropriately.

### Why is it important to log exceptions?

Logging exceptions helps in debugging and monitoring the application. It provides valuable information about the cause of errors.

## Examples and Demonstrations

### Can you demonstrate a simple example of exception handling in Java?

Show a code snippet where an exception is handled using a try-catch block.

### How can you create custom exceptions?

Explain how to create user-defined exceptions by extending the `Exception` class or its subclasses.
