# Exception Handling in Java with JVM

Exception handling in Java is a crucial aspect of writing robust and error-tolerant programs. This README.md file provides an overview of the steps involved in how the Java Virtual Machine (JVM) handles exceptions.

## Steps in JVM Exception Handling

1. **Exception Occurs:**
    - An exceptional situation occurs during the execution of a Java program.

2. **Create Exception Object:**
    - An exception object is created with information about the type of exception, error message, and stack trace.

3. **Throw Exception:**
    - The program throws the exception using the `throw` keyword.

4. **Unwinding Stack:**
    - If a matching `catch` block is not found in the current method, the JVM unwinds the call stack, looking for an enclosing `try-catch` block.

5. **Find Matching Catch Block:**
    - The JVM continues to unwind the call stack until it finds the nearest matching `catch` block for the thrown exception.

6. **Execute Catch Block:**
    - The code inside the matching `catch` block is executed to handle the exception, typically containing logic to recover from the situation.

7. **Resumption or Termination:**
    - Depending on the nature of the exception and the handling strategy, the program may resume normal execution or terminate.

## Flowchart Representation

```plaintext
+-----------------+      +-------------------------+      +-------------------------+      +------------------+
| Exception Occurs| ---> | Create Exception Object | ---> |     Throw Exception     | ---> |    Catch Block   |
+-----------------+      +-------------------------+      +-------------------------+      +------------------+
                                        |
                                  +-----|-----+
                                  | Unwinding |
                                  |   Stack   |
                                  +-----------+
                                        |
                                        v
                          +--------------------------+
                          | Find Matching Catch Block |
                          +--------------------------+
                                        |
                                        v
                          +--------------------------+
                          |   Execute Catch Block    |
                          |(Handle Exception Logic)  |
                          +--------------------------+
                                        |
                           +------------|------------+
                           | Resumption or Termination |
                           +---------------------------+
```
