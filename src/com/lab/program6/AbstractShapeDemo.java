package com.lab.program6;

/*
Develop a JAVA program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and
perimeter of each shape.
 */

// Abstract class Shape
abstract class Shape {
    // Abstract methods for calculating area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea() for Circle (π * r^2)
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing calculatePerimeter() for Circle (2 * π * r)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor for Triangle
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Implementing calculateArea() for Triangle (using Heron's formula)
    @Override
    public double calculateArea() {
        // Heron's formula to calculate area of triangle
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Implementing calculatePerimeter() for Triangle (sum of all sides)
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {
        // Creating Circle and Triangle objects
        Circle circleRefObj;
        circleRefObj = new Circle(5);
        Triangle triangleRefObj;
        triangleRefObj = new Triangle(3, 4, 5);

        // Calculating and displaying area and perimeter of Circle
        System.out.println("Circle - Area: " + circleRefObj.calculateArea());
        System.out.println("Circle - Perimeter: " + circleRefObj.calculatePerimeter());

        // Calculating and displaying area and perimeter of Triangle
        System.out.println("Triangle - Area: " + triangleRefObj.calculateArea());
        System.out.println("Triangle - Perimeter: " + triangleRefObj.calculatePerimeter());
    }
}

/*
Circle - Area: 78.53981633974483
Circle - Perimeter: 31.41592653589793
Triangle - Area: 6.0
Triangle - Perimeter: 12.0
 */