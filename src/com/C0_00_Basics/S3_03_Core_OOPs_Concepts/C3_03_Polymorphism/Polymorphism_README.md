# Polymorphism in Java

## What is Polymorphism?
Polymorphism is a core concept in Object-Oriented Programming (OOP) that allows objects of different classes to be treated as instances of a common superclass or interface. It enables a single interface to be used for entities of different types.

## Why Use Polymorphism?
- **Flexibility:** Polymorphism provides flexibility by allowing different objects to be treated uniformly through a common interface.
- **Code Reusability:** Enables the reuse of code, facilitating the use of one method for different objects.
- **Enhanced Extensibility:** Facilitates the addition of new classes without modifying existing code.

## When to Use Polymorphism?
- Use polymorphism when you have multiple classes sharing a common behavior or interface.
- When you need to implement different functionalities based on the same method signature in various classes.

## Where is Polymorphism Used?
Polymorphism is extensively used in Java applications to create flexible and extensible code, particularly in scenarios where multiple classes share a common interface or superclass.

## How Does Polymorphism Work in Java?
- **Method Overriding:** Subclasses can provide their own implementation of a method inherited from a superclass.
- **Dynamic Binding:** The determination of which method to invoke at runtime, based on the object being referred to.

## Example of Polymorphism in Java:
```java
// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Subclasses
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Polymorphic Usage
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Bark
        myCat.makeSound(); // Outputs: Meow
    }
}
```
