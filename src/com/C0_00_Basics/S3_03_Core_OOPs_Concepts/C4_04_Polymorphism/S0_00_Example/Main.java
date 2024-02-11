/*
* Explanation:
Shape is the base abstract class with abstract methods calculateArea() and calculatePerimeter().
Circle and Rectangle are subclasses that extend Shape and provide specific implementations for the abstract methods.
In the Main class, objects of Circle and Rectangle are instantiated using Shape references. Polymorphism is showcased by invoking calculateArea() and calculatePerimeter() methods on these objects, demonstrating the overridden behavior based on the actual instance type.
*/
package com.C0_00_Basics.S3_03_Core_OOPs_Concepts.C4_04_Polymorphism.S0_00_Example;

// Main.java - Demonstrating polymorphism by using Shape references
public class Main {
    public static void main(String[] args) {
        Shape circleObj;
        circleObj = new Circle(5); // Instantiate Circle object using Shape reference

        Shape rectangleObj;
        rectangleObj = new Rectangle(4, 6); // Instantiate Rectangle object using Shape reference

        // Call calculateArea() and calculatePerimeter() using Shape references
        System.out.println("Circle Area: " + circleObj.calculateArea());
        System.out.println("Circle Perimeter: " + circleObj.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangleObj.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangleObj.calculatePerimeter());
    }
}

// The output of the above program is shown as below
/*
Circle Area: 78.53981633974483
Circle Perimeter: 31.41592653589793
Rectangle Area: 24.0
Rectangle Perimeter: 20.0
 */
