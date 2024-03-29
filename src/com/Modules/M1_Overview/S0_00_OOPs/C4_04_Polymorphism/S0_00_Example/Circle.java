package com.Modules.M1_Overview.S0_00_OOPs.C4_04_Polymorphism.S0_00_Example;

// Circle.java - Derived class extending Shape for Circle
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() { // Implementation for area calculation specific to Circle
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() { // Implementation for perimeter calculation specific to Circle
        return 2 * Math.PI * radius;
    }
}
