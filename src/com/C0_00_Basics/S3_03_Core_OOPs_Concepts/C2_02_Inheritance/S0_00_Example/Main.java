/**
 * Explanation:
 *
 * Shape is the base class with a method displayShapeInfo() to display shape information.
 * Circle and Rectangle are subclasses that inherit from Shape.
 * Constructors in Circle and Rectangle use super(shapeName) to initialize the shapeName attribute inherited from the Shape class.
 * Both subclasses override the displayShapeInfo() method, using super.displayShapeInfo() to access the base class method and extend it with their specific information using the super keyword.
 */

package C0_00_Basics.S3_03_Core_OOPs_Concepts.C2_02_Inheritance.S0_00_Example;

// Main.java - Demonstrating inheritance and using super keyword
public class Main {
    public static void main(String[] args) {
        Circle circleObj;
        circleObj = new Circle("MyCircle", 5);
        circleObj.displayShapeInfo(); // Output: Shape: MyCircle, Circle Specific Info:, Circle Radius: 5.0

        Rectangle rectangleObj;
        rectangleObj = new Rectangle("MyRectangle", 4, 6);
        rectangleObj.displayShapeInfo(); // Output: Shape: MyRectangle, Rectangle Specific Info:, Rectangle Length: 4.0, Width: 6.0
    }
}
