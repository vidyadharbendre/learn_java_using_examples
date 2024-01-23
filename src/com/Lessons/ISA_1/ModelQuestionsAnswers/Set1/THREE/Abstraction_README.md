# Model Question Paper 1:

3. **Q3:Develop a Java program that illustrates the application of Object-Oriented Programming (OOP) principle ‘Abstraction’ with an example.**

## Introduction to Abstraction:
Abstraction is an essential principle in Object-Oriented Programming (OOP) that focuses on hiding complex implementation details and exposing only the necessary functionalities or behaviors of an object. It allows developers to work with high-level interfaces without worrying about the intricate internal workings.

### Example: Shape Abstraction

Consider an example that demonstrates abstraction using shapes like Square and Circle. The following Java code showcases how abstraction can be implemented to calculate the area of different shapes without exposing their specific calculations.

### Java Code Example:

```java
// Abstract class representing a Shape
abstract class Shape {
    // Abstract method for calculating area (to be implemented by subclasses)
    public abstract double calculateArea();
}

// Concrete subclass Square inheriting from Shape
class Square extends Shape {
    private double side;

    // Constructor for Square
    public Square(double side) {
        this.side = side;
    }

    // Implementing abstract method to calculate area for Square
    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Concrete subclass Circle inheriting from Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        // Creating objects of Square and Circle
        Square squareObj = new Square(5);
        Circle circleObj = new Circle(3);

        // Calculating and displaying areas without knowing implementation details
        System.out.println("Area of Square: " + squareObj.calculateArea());
        System.out.println("Area of Circle: " + circleObj.calculateArea());
    }
}
```
### Explanation:
The code showcases abstraction by utilizing an abstract class Shape and concrete subclasses Square and Circle.
Shape defines an abstract method calculateArea(), which is implemented differently in its subclasses.

The AbstractExample class demonstrates the use of these shapes without understanding their internal calculations, emphasizing abstraction.