package com.Trials.LearnBasics;





public class CircleAreaPerimeterDemo {
    public static void main(String[] args) {
        Circle circleRefObj;
        circleRefObj = new Circle();
        circleRefObj.calculateArea();
        circleRefObj.calculatePerimeter();

    }

}

class Circle{
    private int r;

    public Circle() {
        this.r = 1;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void calculateArea(){
        System.out.println("Area : "+ 3.14*getR()*getR());
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter : "+ 2*3.14*getR());
    }


}


