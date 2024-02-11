package com.modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S0_00_Example;

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
