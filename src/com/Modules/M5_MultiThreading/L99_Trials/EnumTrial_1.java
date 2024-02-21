package com.Modules.M5_MultiThreading.L99_Trials;

enum Shape{
    square(100),
    cube(1000),
    circle;

    float area;



    Shape() {
        this.area = 10;
        System.out.println("Initilization of Constructor");
    }
    Shape(int area) {
        this.area = area;
    }

    public float getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}



//class Shape{
//    static final Shape square = new Shape();
//    static final Shape rectangle = new Shape();
//    static final Shape circle = new Shape();
//
//}
public class EnumTrial_1 {
    public static void main(String[] args) {
        System.out.println(Shape.circle.getArea());
        Shape.cube.setArea(1000);
        System.out.println("circle : "+Shape.circle.getArea());
        System.out.println("square : "+Shape.square.getArea());
    }
}
