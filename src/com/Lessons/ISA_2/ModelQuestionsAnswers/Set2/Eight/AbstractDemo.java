package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Eight;

/*
Develop a Java program that uses abstract classes and methods, highlighting
their importance in code design and providing examples.
 */


// Abstract class representing a shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete class representing a circle
class Circle extends Shape {
    private double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete class representing a rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Creating objects
        Circle circleRefObj;
        circleRefObj = new Circle(5);
        Rectangle rectangleRefObj;
        rectangleRefObj = new Rectangle(4, 6);

        // Calling abstract method
        System.out.println("Area of Circle: " + circleRefObj.calculateArea());
        System.out.println("Area of Rectangle: " + rectangleRefObj.calculateArea());

        // Calling concrete method
        circleRefObj.display();
        rectangleRefObj.display();
    }
}

//The output of the above program is shown as below
/*
Area of Circle: 78.53981633974483
Area of Rectangle: 24.0
This is a shape.
This is a shape.
 */

/*
Explanation:

Shape is an abstract class with an abstract method calculateArea() and a
concrete method display().

Circle and Rectangle are concrete classes that extend the Shape abstract class.
Each concrete class provides its implementation for the calculateArea() method.
In the main method, we create objects of Circle and Rectangle and demonstrate
polymorphism by calling the calculateArea() method.
 */