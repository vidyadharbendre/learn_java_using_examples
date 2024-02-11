package com.Modules.M1_Overview.S0_00_OOPs.C2_02_Inheritance.S0_00_Example;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeName, double radius) {
        super(shapeName); // Call to superclass constructor using super keyword
        this.radius = radius;
    }
    public void displayCircleInfo() {
        System.out.println("Circle Radius: " + radius);
    }
    // Overriding displayShapeInfo() method from superclass
    @Override
    public void displayShapeInfo() {
        super.displayShapeInfo(); // Call to superclass method using super keyword
        System.out.println("Circle Specific Info:");
        displayCircleInfo(); // Invoking its own method
    }
}
