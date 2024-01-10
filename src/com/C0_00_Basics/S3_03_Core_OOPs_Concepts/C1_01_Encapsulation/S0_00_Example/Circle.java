package com.C0_00_Basics.S3_03_Core_OOPs_Concepts.C1_01_Encapsulation.S0_00_Example;

// Circle.java - Class demonstrating encapsulation for a Circle
public class Circle {
    private double radius; // Private field
    public double getRadius() { // Getter method
        return radius;
    }
    public void setRadius(double radius) { // Setter method
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius!");
        }
    }
}
