# Inheritance in Java

## What is Inheritance?
Inheritance is a fundamental concept in Object-Oriented Programming (OOP) that allows a new class (subclass or derived class) to inherit properties (fields and methods) from an existing class (superclass or base class). It enables code reuse, establishes relationships between classes, and promotes hierarchical organization.

## Why Use Inheritance?
- **Code Reuse:** Inheritance facilitates the reuse of code by allowing subclasses to inherit attributes and behaviors from superclasses.
- **Modularity:** Enables modular and extensible design, allowing new classes to build upon existing ones.
- **Hierarchy:** Helps create hierarchical classifications of classes based on common characteristics.

## When to Use Inheritance?
- Use inheritance when you want to create new classes that share common attributes and behaviors with existing classes.
- When you need to represent an "is-a" relationship between classes (e.g., a "Car" is-a "Vehicle").

## Where is Inheritance Used?
Inheritance is extensively used in Java and other object-oriented programming languages to create class hierarchies, implement specialization, and promote code reuse.

## How Does Inheritance Work in Java?
- **Syntax:** In Java, inheritance is implemented using the `extends` keyword, where a subclass extends a superclass.
- **Access Modifiers:** Subclasses inherit accessible members (fields and methods) from the superclass.
- **Constructor Chaining:** Superclass constructors are called using the `super()` keyword in subclasses.

## Example of Inheritance in Java:
```java
// Superclass
class Vehicle {
    String brand = "Ford";
    void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Subclass
class Car extends Vehicle {
    int wheels = 4;
    public static void main(String[] args) {
        Car myCar;
        myCar = new Car();
        
        myCar.honk(); // Inherits honk() method from Vehicle class
        System.out.println("Brand: " + myCar.brand); // Inherits brand variable from Vehicle class
        System.out.println("Wheels: " + myCar.wheels);
    }
}
```
