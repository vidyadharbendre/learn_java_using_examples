package com.modules.M1_Overview.S0_00_OOPs.C2_02_Inheritance.S0_00_Example;

// Shape.java - Base class with basic functionality
public class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    public void displayShapeInfo() {
        System.out.println("Shape: " + shapeName);
    }
}
