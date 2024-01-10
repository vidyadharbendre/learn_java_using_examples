package com.Trials.LearnInheritance.Example_4;

public class InheritanceDemo {
    public static void main(String[] args) {

//    Shape shapeRefObj;
//    shapeRefObj = new Shape();
//    shapeRefObj.displayDetails();

    Circle circleRefObj;
    circleRefObj = new Circle();
    circleRefObj.displayDetails();


    }
}


class Shape{
    private int var1;


    public Shape(){
        this.var1 = -1;
        System.out.println("Parent Class or Base Class = Shape"+"var1: "+getVar1());
    }
    public Shape(int var1) {
        this.var1 = var1;
    }

    public Shape(Shape shapeObj){
        this.var1 = shapeObj.var1;
    }
    public int getVar1() {
        return var1;
    }
    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public double area(){
        return 0.0;
    }
    public void displayDetails(){
        System.out.println("Var1 : "+getVar1());

    }

}

class Circle extends Shape{

    public Circle(){
        super();
        System.out.println("Child class = Derived Class = Circle");
    }
    public Circle(int var1) {
        super(var1);
    }

    public Circle(Shape shapeObj) {
        super(shapeObj);

    }


    @Override
    public double area() {
        return 3.14 * getVar1()*getVar1();

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Area of the Circle : "+area());
    }
}

class Square extends Shape{

    public Square() {
        super();
        System.out.println("Child class = Derived Class = Square");
    }

    public Square(int var1) {
        super(var1);
    }

    @Override
    public double area(){
        return getVar1()*getVar1();
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Area of the Square is : "+area());
    }
}

class Rectangle extends Shape{
    private int var2;

    public Rectangle(Rectangle rectangleObj){
        super(rectangleObj);
        this.var2 = rectangleObj.var2;
    }

    public Rectangle(int var2) {
        this.var2 = var2;
    }

    public Rectangle(int var1, int var2) {
        super(var1);
        this.var2 = var2;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    @Override
    public double area() {
        return getVar1()*getVar2();
    }


    public double area(int side){
        return side*side;
    }

    public double area(int length, int width){
        return length*width;
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The ares of the Rectangle : "+area());
        System.out.println("Overloaded method -1 :" +area(getVar1()));
        System.out.println("Overloadded method - 2 :"+area(getVar1(), getVar2()));

    }
}
