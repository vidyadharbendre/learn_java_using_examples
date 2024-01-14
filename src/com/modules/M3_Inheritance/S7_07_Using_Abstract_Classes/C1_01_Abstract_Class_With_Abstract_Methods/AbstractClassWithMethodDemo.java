package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C1_01_Abstract_Class_With_Abstract_Methods;

public class AbstractClassWithMethodDemo {
    public static void main(String[] args) {

        Circle circleRefObj;
        circleRefObj = new Circle();

        circleRefObj.draw();

    }
}


abstract class Shape{
    abstract void draw();
}


class Circle extends Shape{

    void draw(){
        System.out.println("Drawing a Circle");
    }

}

// The output of the above program is shown as below
/*

Drawing a Circle

 */