# Use of `protected` Access Modifier in Java

## What is `protected` in Java?
`protected` is an access modifier in Java that provides visibility to the class itself, its package, and its subclasses. It allows access to the member variables or methods within the same package and from subclasses outside the package.

## Why Use `protected`?
- **Subclass Access:** `protected` allows subclasses to access the members (fields or methods) of the superclass, even if they are in different packages.
- **Encapsulation:** It maintains encapsulation by restricting access to only subclasses, providing a level of data protection while allowing inheritance.

## When to Use `protected`?
- Use `protected` when you want the member variables or methods to be accessible within the same package and from subclasses, but not to the outside world.

## Where is `protected` Used?
`protected` is commonly used in scenarios where class inheritance is prevalent and certain class members need to be accessed by subclasses while maintaining a level of encapsulation.

## How Does `protected` Work in Java?
- `protected` members are accessible within the same package and by subclasses, whether or not they're in the same package as the superclass.
- `protected` members are not accessible by other classes outside the package that are not subclasses.

## Example of Using `protected` in Java:
```java
public class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public void displayShapeInfo() {
        System.out.println("Shape: " + shapeName);
    }
}
```
