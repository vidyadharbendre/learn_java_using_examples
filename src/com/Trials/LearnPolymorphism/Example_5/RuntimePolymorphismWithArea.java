package com.Trials.LearnPolymorphism.Example_5;

public class RuntimePolymorphismWithArea {
    public static void main(String[] args) {

    }

}


class Shape{
    private String shapeType;
    private int length;
    private int width;

    public Shape() {
        this.shapeType = "Default";
        this.length = -1;
        this.width = -1;
    }

    public Shape(String shapeType) {
        this.shapeType = shapeType;
        System.out.println("Initilise Constructor with values "+getShapeType()+"during constructor initilisation");
    }
    public String getShapeType() {
        return shapeType;
    }


    public Shape(String shapeType, int len, int width) {
        this.shapeType = shapeType;
        this.len = len;
        this.width = width;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }


    public void displayArea(){
        System.out.println("Area of "+ getShapeType() +"is "+ calculateArea());
    }

    public double calculateArea(){
        return len*width;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}