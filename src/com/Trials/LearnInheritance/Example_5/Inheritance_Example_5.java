package com.Trials.LearnInheritance.Example_5;

public class Inheritance_Example_5 {
    public static void main(String[] args) {

        Box boxRefObj1;
        boxRefObj1 = new BoxWeight();

        boxRefObj1.displayDetails();


        Box boxRefObj2;
        boxRefObj2 = new BoxWeight(2);
        boxRefObj2.displayDetails();





//        Box boxRefObj;
//        boxRefObj = new Box();
//        boxRefObj.displayDetails();
//
//        System.out.println("----------cube----------start");
//        Box boxRefObj0;
//        boxRefObj0 = new Box(3);
//        boxRefObj0.displayDetails();
//        System.out.println("----------cube----------end");
//
//        Box boxRefObj1;
//        boxRefObj1 = new Box(1, 2, 3);
//        boxRefObj1.displayDetails();
//
//        BoxWeight boxWeightRefObj1;
//        boxWeightRefObj1 = new BoxWeight(1, 2, 3, 4);
//
//        boxWeightRefObj1.displayDetails();
//
//        System.out.println("--------------------price-----------------");
//        BoxPrice boxPriceObj1;
//        boxPriceObj1 = new BoxPrice(1, 2, 3, 4, 5);
//
//        boxPriceObj1.displayDetails();
//
//        System.out.println("----------------------run-time polymorphism-------------------");
//        Box boxRefObj2;
//        boxRefObj2 = new BoxPrice(1, 2, 3, 4, 5);
//
//        boxRefObj2.displayDetails();

    }

}


class Box{
    private int length;
    private int width;
    private int height;

    public Box() {

        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    public Box(int side){
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void displayDetails(){
        System.out.println("length : "+getLength());
        System.out.println("width : "+getWidth());
        System.out.println("height : "+getHeight());
    }
}

class BoxWeight extends Box{
    private int weight;

    public BoxWeight(){
        super();
        this.weight = -1;
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(int length, int width, int height, int weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Weight : "+getWeight());
    }

}

class BoxPrice extends BoxWeight{
    private int price;

    public BoxPrice(){
        super();
        this.price = -1;
    }
    public BoxPrice(int price) {
        this.price = price;
    }

    public BoxPrice(int weight, int price) {
        super(weight);
        this.price = price;
    }

    public BoxPrice(int length, int width, int height, int weight, int price) {
        super(length, width, height, weight);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Price : "+getPrice());
    }
}