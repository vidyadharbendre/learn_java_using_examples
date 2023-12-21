package C0_00_Basics.S3_03_Core_OOPs_Concepts.C4_04_Abstraction;

// Main.java

public class Main {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape rectangleObj;
        rectangleObj = new Rectangle(5, 10);

        Shape circleObj;
        circleObj = new Circle(7);

        System.out.println("Circle Area "+circleObj.calculateArea());
        System.out.println("Circle Perimeter "+circleObj.calculatePerimeter());
        System.out.println("Rectangle Area "+rectangleObj.calculateArea());
        System.out.println("Rectangle Perimeter "+rectangleObj.calculatePerimeter());


    }
}

