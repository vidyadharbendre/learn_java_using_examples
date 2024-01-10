package com.Trials.LearnInheritance.Example_3;

public class OverrideExample {
    public static void main(String[] args) {
//        Rectangle rectangleObj;
//        rectangleObj = new Rectangle(5);
//        System.out.println("rectangle object reference"+rectangleObj);

//        rectangleObj.calculateArea();

//        Circle circleObj;
//        circleObj = new Circle(5);
//        circleObj.getSide();
//        circleObj.calculateArea();

        Shape shapeObj1;
        shapeObj1 = new Shape(3);
        shapeObj1.calculateArea();
        System.out.println("shapeObj1 reference : "+shapeObj1);

        Shape shapeObj2;
        shapeObj1 = new Rectangle(3);
        shapeObj1.calculateArea();

        System.out.println("shapeObj1 reference : "+shapeObj1);

    }
}


class Shape{
    private int side;

    public Shape(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void calculateArea(){
        System.out.println("Shape - side is : "+getSide());
    }
}

class Rectangle extends Shape{
    public Rectangle(int side) {
        super(side);
    }

    @Override
    public int getSide() {
        return super.getSide();
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        double area = getSide() * getSide();
        System.out.println("Area : "+area);
    }

}

class Circle extends Shape{
    public Circle(int side) {
        super(side);
    }

    @Override
    public int getSide() {
        return super.getSide();
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        double area = 3.14 * getSide() * getSide();
        System.out.println("Area of the cirecle is : "+area);
    }
}