# Java "Hello World" Program

## Purpose

This simple Java program demonstrates the basic structure of a "Hello World" program. It serves as a starting point for learning Java programming.

## Description

The program consists of a single class named `helloWorld`, which contains the `main` method. The `main` method is the entry point of the program and is executed when the program is run.

Inside the `main` method, a single statement is written to the console using the `System.out.println()` method. This statement prints the message "Hello World - Welcome to Java programming" to the console.

The program does not use any external packages, and it provides a clear and concise example for beginners to understand the basic syntax of a Java program.

## Running the Program

### Compile

To compile the program, use the `javac` command with the `-d` option to specify the destination directory where the compiled class files should be placed.

```bash
javac -d out helloWorld.java

```
### Run
To run the compiled program, use the java command with the -cp option to specify the classpath for the Java Virtual Machine (JVM) at runtime.

```bash
java -cp out helloWorld
```

This will execute the helloWorld class, and you should see the output:

```css
Hello World - Welcome to Java programming
```
These commands provide flexibility and control over where your compiled classes are stored (-d in javac) and where the JVM looks for classes during execution (-cp in java).