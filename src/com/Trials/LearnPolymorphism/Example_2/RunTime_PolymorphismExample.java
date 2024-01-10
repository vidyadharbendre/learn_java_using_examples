package com.Trials.LearnPolymorphism.Example_2;

public class RunTime_PolymorphismExample {
    public static void main(String[] args) {
        Shape shapeRefObj1;
        shapeRefObj1 = new Shape();
        shapeRefObj1.area();

        Shape shapeRefObj2;
        shapeRefObj2 = new Rectangle();
        shapeRefObj2.area();

        Shape shapeRefObj3;
        shapeRefObj3 = new Triangle();
        shapeRefObj3.area();
    }
}

class Shape {
    public void area() {
        System.out.println("Shape's area");
    }
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Area of Rectangle");
    }
}

class Triangle extends Shape {
    public void area() {
        System.out.println("Area of Triangle");
    }
}
