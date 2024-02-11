# The `super` Keyword in Java

## What is the `super` keyword in Java?

The `super` keyword in Java refers to the immediate parent class object. It's used to access methods and members of the immediate superclass.

## Why is the `super` keyword used?

It's used to differentiate between similar fields or methods in the superclass and the subclass, especially when they have the same name.

## When do you use the `super` keyword?

You use `super` when you want to invoke a method or access a member variable that is overridden or hidden in the subclass.

## How is the `super` keyword used?

You use `super` followed by a dot and the method or variable you want to access from the superclass. For constructors, it's used to call the constructor of the superclass.

## Where is the `super` keyword used?

It's used within a subclass to refer to the superclass methods, constructors, or variables.

## Who uses the `super` keyword?

Java developers utilize the `super` keyword while working with inheritance to access superclass members overridden in the subclass.

### Example:

```java
class Parent {
    int value = 10;
    void display() {
        System.out.println("Parent's display()");
    }
}

class Child extends Parent {
    int value = 20;
    void display() {
        super.display(); // Calls the display() method of the Parent class
        System.out.println("Child's display()");
        System.out.println("Value in Child: " + value); // Accessing value in Child
        System.out.println("Value in Parent using super: " + super.value); // Accessing value in Parent
    }
}
```
