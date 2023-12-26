# The `extends` Keyword in Java

## What is the `extends` keyword in Java?

The `extends` keyword in Java is used to create a subclass that inherits fields and methods from another class, known as the superclass.

## Why is the `extends` keyword used?

It's used to establish an inheritance relationship between classes, allowing the subclass to inherit properties and behaviors from the superclass.

## When do you use the `extends` keyword?

You use `extends` when you want to create a new class that retains the characteristics of an existing class (superclass) while adding new features or behaviors.

## How is the `extends` keyword used?

It's used by appending `extends` followed by the name of the superclass to the declaration of the subclass.

## Where is the `extends` keyword used?

It's used in class declarations when defining a new class that derives from an existing class.

## Who uses the `extends` keyword?

Java developers use the `extends` keyword to establish an 'is-a' relationship between classes, allowing code reuse and facilitating polymorphism.

### Example:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```
