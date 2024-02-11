# Abstract Classes in Java

Abstract classes in Java provide a way to declare common characteristics and behaviors for a group of related classes. They can contain abstract methods, which are declared without implementation and must be implemented by concrete subclasses.

## Table of Contents

- [Abstract Class with Abstract Method](#abstract-class-with-abstract-method)
- [Abstract Class with Concrete Method](#abstract-class-with-concrete-method)
- [Abstract Class with Constructor](#abstract-class-with-constructor)
- [Abstract Class Extending Another Abstract Class](#abstract-class-extending-another-abstract-class)
- [Concrete Class Extending Abstract Class](#concrete-class-extending-abstract-class)

## Abstract Class with Abstract Method

```java
abstract class Shape {
    abstract void draw();
}
```
An abstract class Animal with a concrete method sleep and an abstract method makeSound. Subclasses need to implement makeSound.

## Abstract Class with Constructor
```java

abstract class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    abstract void start();
}

```
An abstract class Vehicle with a constructor and an abstract method start. Subclasses must implement the start method.

## Abstract Class Extending Another Abstract Class
```java
abstract class Bird {
    abstract void fly();
}

abstract class Sparrow extends Bird {
    void chirp() {
        System.out.println("Chirp Chirp");
    }
}

```
An abstract class Sparrow extending another abstract class Bird. It inherits the abstract method fly from Bird and provides its method chirp.

## Concrete Clas Extending Abstract Class

```java
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

```
A concrete class Circle extending the abstract class Shape. It provides an implementation for the abstract method draw.