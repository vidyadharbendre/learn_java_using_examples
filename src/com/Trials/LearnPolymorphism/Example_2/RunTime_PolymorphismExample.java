package com.Trials.LearnPolymorphism.Example_2;

public class RunTime_PolymorphismExample {
    public static void main(String[] args) {
        Shape shapeRefObj1;
        shapeRefObj1 = new Shape();
        shapeRefObj1.calculateArea();

        Shape shapeRefObj2;
        shapeRefObj2 = new Rectangle();
        shapeRefObj2.calculateArea();

        Shape shapeRefObj3;
        shapeRefObj3 = new Triangle();
        shapeRefObj3.calculateArea();
    }
}

class Shape {
    public void calculateArea() {
        System.out.println("Shape's area");
    }
}

class Rectangle extends Shape {
    public void calculateArea() {
        System.out.println("Area of Rectangle");
    }
}

class Triangle extends Shape {
    public void calculateArea() {
        System.out.println("Area of Triangle");
    }
}
