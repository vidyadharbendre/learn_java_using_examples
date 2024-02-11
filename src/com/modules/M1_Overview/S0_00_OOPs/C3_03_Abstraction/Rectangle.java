package com.modules.M1_Overview.S0_00_OOPs.C3_03_Abstraction;

// Rectangle class implementing Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementing abstract method to calculate perimeter for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
