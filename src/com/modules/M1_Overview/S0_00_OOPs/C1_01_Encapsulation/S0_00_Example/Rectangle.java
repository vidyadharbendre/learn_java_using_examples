package com.modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S0_00_Example;
// Rectangle.java - Class demonstrating encapsulation for a Rectangle
public class Rectangle {
    private double length; // Private fields
    private double width;

    public double getLength() { // Getter method
        return length;
    }
    public void setLength(double length) { // Setter method
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length!");
        }
    }
    public double getWidth() { // Getter method
        return width;
    }
    public void setWidth(double width) { // Setter method
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width!");
        }
    }
}
