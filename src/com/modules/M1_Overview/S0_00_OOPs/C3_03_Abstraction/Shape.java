package com.modules.M1_Overview.S0_00_OOPs.C3_03_Abstraction;

// Abstract class defining a shape
abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Abstract method to calculate perimeter (to be implemented by subclasses)
    public abstract double calculatePerimeter();

    // Concrete method in the abstract class
    public void display() {
        System.out.println("This is a shape.");
    }
}

