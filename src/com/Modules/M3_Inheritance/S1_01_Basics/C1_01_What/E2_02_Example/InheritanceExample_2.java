package com.Modules.M3_Inheritance.S1_01_Basics.C1_01_What.E2_02_Example;

// Superclass: Shape
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Subclass: Circle
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

// Subclass: Square
class Square extends Shape {

    void draw() {
        System.out.println("Drawing a square...");
    }
}

public class InheritanceExample_2 {
    public static void main(String[] args) {
        Shape shapeObj;
        shapeObj = new Shape();
        shapeObj.draw(); // Output: Drawing a shape...

        Circle circleObj;
        circleObj = new Circle();
        circleObj.draw(); // Output: Drawing a circle...

        Square squareObj;
        squareObj = new Square();
        squareObj.draw(); // Output: Drawing a square...
    }
}
// The output of the above program is shown below:
/*
Drawing a shape...
Drawing a circle...
Drawing a square...
 */