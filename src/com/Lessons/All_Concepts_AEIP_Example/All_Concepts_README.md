# Shape Calculation Example - OOP Concepts Explained

## Understanding Object-Oriented Programming (OOP) Concepts with Java

### 1. What is the program about?

This Java program showcases the fundamental principles of Object-Oriented Programming (OOP) concepts such as Inheritance, Encapsulation, Abstraction, and Polymorphism.

### 2. Why this program?

This program utilizes geometric shapes (Triangle, Square, and Rectangle) to illustrate the following OOP concepts:

### 3. Concepts Explained:

#### Inheritance:

The classes `Triangle`, `Square`, and `Rectangle` extend the base class `Shape`, inheriting its `side` attribute. Through inheritance, the derived classes inherit attributes and behaviors from the base class, promoting code reuse.

#### Encapsulation:

The member variable `side` in the base class `Shape` is declared as `protected`, encapsulating it within the class hierarchy. It ensures that the `side` attribute is accessible to derived classes but not directly from outside the hierarchy, preserving data integrity.

#### Abstraction:

The base class `Shape` declares an abstract method `calculateArea()`. Being an abstract class, it cannot be instantiated, but it defines the contract that its subclasses must follow by implementing the `calculateArea()` method. This allows for a common interface while hiding the implementation details.

#### Polymorphism:

The array `shapes` contains references to different types of shapes (Triangle, Square, Rectangle) stored in `Shape` references. Despite the references being of the base class type, the `calculateArea()` method is called for each shape. This demonstrates polymorphism, where the correct method is invoked at runtime based on the object's actual type.

### 4. The Java Program

```java
// [Java code as provided]

// The output of the above program is shown below
/*
Area of shape 1: 8.0
Area of shape 2: 25.0
Area of shape 3: 18.0
 */
```