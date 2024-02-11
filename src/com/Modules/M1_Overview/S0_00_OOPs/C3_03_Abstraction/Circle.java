package com.Modules.M1_Overview.S0_00_OOPs.C3_03_Abstraction;

// Circle.java

// Circle class implementing Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing abstract method to calculate perimeter for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
