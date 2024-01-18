package com.modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Shape interface
interface Shape {
    double calculateArea();
}

// Concrete classes implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Usage
public class E1_ShapeDemo {
    public static void main(String[] args) {
        Shape circleRefObj;
        circleRefObj = new Circle(1.0);
        Shape rectangleRefObj;
        rectangleRefObj = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + circleRefObj.calculateArea());
        System.out.println("Area of Rectangle: " + rectangleRefObj.calculateArea());
    }
}

// The output of the above program is shown as below:
/*
Area of Circle: 3.141592653589793
Area of Rectangle: 24.0
 */
