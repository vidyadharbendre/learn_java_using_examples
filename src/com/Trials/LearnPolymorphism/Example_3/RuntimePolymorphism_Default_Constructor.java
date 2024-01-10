package com.Trials.LearnPolymorphism.Example_3;

public class RuntimePolymorphism_Default_Constructor {

    public static void main(String[] args) {
        Shape shapeRefObj1 = new Shape();
        shapeRefObj1.display();

        Shape shapeRefObj2 = new Rectangle();
        shapeRefObj2.display();

        Shape shapeRefObj3 = new Triangle();
        shapeRefObj3.display();
    }
}

class Shape {
    Shape() {
        System.out.println("Inside Shape constructor");
    }

    public void display() {
        System.out.println("Shape's display method");
    }
}

class Rectangle extends Shape {
    Rectangle() {
        System.out.println("Inside Rectangle constructor");
    }

    public void display() {
        System.out.println("Rectangle's display method");
    }
}

class Triangle extends Shape {
    Triangle() {
        System.out.println("Inside Triangle constructor");
    }

    public void display() {
        System.out.println("Triangle's display method");
    }
}

