package com.Trials.LearnPolymorphism.Example_4;

public class RuntimePolymorphismWithParamConstructor {
    public static void main(String[] args) {
        Shape shapeRefObj1;
        shapeRefObj1 = new Shape("Shape");
        shapeRefObj1.display();

        Shape shapeRefObj2;
        shapeRefObj2 = new Rectangle("Rectangle");
        shapeRefObj2.display();

        Shape shapeRefObj3;
        shapeRefObj3 = new Triangle("Triangle");
        shapeRefObj3.display();
    }
}

class Shape {
    private String shapeType;

    Shape(String type) {
        this.shapeType = type;
        System.out.println("Inside " + this.shapeType + " constructor");
    }

    public void display() {
        System.out.println("Display method of " + getShapeType());
    }

    public String getShapeType() {
        return shapeType;
    }

}


class Rectangle extends Shape{

    public Rectangle(String type) {
        super(type);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Display method of Rectangle");
    }
}

class Triangle extends Shape {
    Triangle(String type) {
        super(type);
    }

    @Override
    public void display() {
        System.out.println("Display method of Triangle");
    }
}

