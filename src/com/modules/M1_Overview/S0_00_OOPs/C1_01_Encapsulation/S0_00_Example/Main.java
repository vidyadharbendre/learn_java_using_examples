package com.modules.M1_Overview.S0_00_OOPs.C1_01_Encapsulation.S0_00_Example;

// Main.java - Demonstrating encapsulation using Circle and Rectangle
public class Main {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circleObj;
        circleObj = new Circle();
        Rectangle rectangleObj;
        rectangleObj = new Rectangle();

        // Setting and getting values using methods
        circleObj.setRadius(5);
        System.out.println("Circle Radius: " + circleObj.getRadius());
        rectangleObj.setLength(4);
        rectangleObj.setWidth(6);
        System.out.println("Rectangle Length: " + rectangleObj.getLength());
        System.out.println("Rectangle Width: " + rectangleObj.getWidth());
    }
}

// The output of the above program is shown as below
/*
Circle Radius: 5.0
Rectangle Length: 4.0
Rectangle Width: 6.0
 */