package com.modules.M1_Overview.S0_00_OOPs.C3_03_Abstraction;

// Main.java

public class Main {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape rectangleObj;
        rectangleObj = new Rectangle(5, 10);

        Shape circleObj;
        circleObj = new Circle(7);

        System.out.println("Circle Area "+circleObj.calculateArea());
        System.out.println("Circle Perimeter "+circleObj.calculatePerimeter());
        System.out.println("Rectangle Area "+rectangleObj.calculateArea());
        System.out.println("Rectangle Perimeter "+rectangleObj.calculatePerimeter());


    }
}

// The output of the above program is shown as below
/*
Circle Area 153.93804002589985
Circle Perimeter 43.982297150257104
Rectangle Area 50.0
Rectangle Perimeter 30.0
 */