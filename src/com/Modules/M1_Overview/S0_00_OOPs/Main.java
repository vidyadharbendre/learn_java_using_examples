package com.Modules.M1_Overview.S0_00_OOPs;

// Example demonstrating Object-Oriented Programming principles in Java

// Abstraction: Hide implementation details from the user
abstract class Shape {
    abstract void draw();
}

// The Three OOP Principles: Encapsulation, Inheritance, Polymorphism
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Polymorphism
        Shape shapeRefObj;
        shapeRefObj = new Circle();
        shapeRefObj.draw();
    }
}
// The output of the above program is shown as below
/*
Drawing a circle
 */
