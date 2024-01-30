package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.EightTwo.Geometry;

public class PackageExample {
    public static void main(String[] args) {
        Rectangle rectangleRefObj;
        rectangleRefObj = new Rectangle(5, 3);

        System.out.println("Rectangle Area : "+rectangleRefObj.calculateArea());

        Circle circleRefObj;
        circleRefObj = new Circle(100);
        System.out.println("Area of the Circle : "+ circleRefObj.calculateArea());

    }
}
