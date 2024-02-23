package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set1.THREE;

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
        Square squareObj;
        squareObj = new Square(5);
        Circle circleObj;
        circleObj = new Circle(3);

        // Calculating and displaying areas without knowing implementation details
        System.out.println("Area of Square: " + squareObj.calculateArea());
        System.out.println("Area of Circle: " + circleObj.calculateArea());
    }
}

// The output of the above program is shown as below:
/*
Area of Square: 25.0
Area of Circle: 28.274333882308138
 */
