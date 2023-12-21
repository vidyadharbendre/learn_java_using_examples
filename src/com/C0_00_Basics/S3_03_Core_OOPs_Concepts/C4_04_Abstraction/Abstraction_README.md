# Abstraction in Java

## What is Abstraction?
Abstraction is a fundamental concept in Object-Oriented Programming (OOP) that focuses on hiding complex implementation details and showing only the essential features of an object. It provides a simplified and high-level view of the functionalities.

## Why Use Abstraction?
- **Simplification:** Abstraction simplifies the programming model by hiding unnecessary details and focusing on essential features.
- **Modularity:** Encourages modular design by separating the interface from the implementation, making code more maintainable.
- **Security:** Protects sensitive information by exposing only necessary functionalities.

## When to Use Abstraction?
- Use abstraction when you want to hide complex implementation details and provide a clear and concise view of functionality.
- When you need to define a blueprint for classes and methods without specifying the implementation.

## Where is Abstraction Used?
Abstraction is widely used in Java, particularly in scenarios where classes need to define a contract (interface) without revealing the implementation details.

## How Does Abstraction Work in Java?
- **Abstract Classes and Interfaces:** Abstract classes and interfaces provide a way to achieve abstraction in Java.
- **Abstract Methods:** Abstract classes can contain abstract methods (methods without a body) that must be implemented by their subclasses.

## Example of Abstraction in Java:
```java
// Abstract Class
abstract class Shape {
    abstract void draw(); // Abstract method
}

// Concrete Classes
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Usage of Abstraction
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw(); // Outputs: Drawing Circle
        rectangle.draw(); // Outputs: Drawing Rectangle
    }
}
