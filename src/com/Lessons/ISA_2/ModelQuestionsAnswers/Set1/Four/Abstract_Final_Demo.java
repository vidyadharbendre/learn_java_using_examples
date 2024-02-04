package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Four;

public class Abstract_Final_Demo {
    public static void main(String[] args) {
        // Create Circle object
        Circle circleRefObj;
        circleRefObj = new Circle();
        circleRefObj.setRadius(5.0); // Set radius
        circleRefObj.display();      // Display generic shape message
        System.out.println("Area of Circle: " + circleRefObj.calculateArea()); // Calculate and display area

        // Create Rectangle object
        Rectangle rectangleRefObj;
        rectangleRefObj = new Rectangle();
        rectangleRefObj.setDimensions(4.0, 6.0); // Set dimensions
        rectangleRefObj.display();                // Display generic shape message
        System.out.println("Area of Rectangle: " + rectangleRefObj.calculateArea()); // Calculate and display area
    }
}

abstract class Shape {
    // Abstract method
    abstract double calculateArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    // Additional attribute specific to Circle
    private double radius;

    // Implementing the abstract method
    double calculateArea() {
        // Implementation specific to Circle
        return Math.PI * radius * radius;
    }

    // Additional methods specific to Circle
    void setRadius(double radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    // Additional attributes specific to Rectangle
    private double length;
    private double width;

    // Implementing the abstract method
    double calculateArea() {
        // Implementation specific to Rectangle
        return length * width;
    }

    // Additional methods specific to Rectangle
    void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// The putput of the above program is shown as below
/*
This is a shape.
Area of Circle: 78.53981633974483
This is a shape.
Area of Rectangle: 24.0
 */