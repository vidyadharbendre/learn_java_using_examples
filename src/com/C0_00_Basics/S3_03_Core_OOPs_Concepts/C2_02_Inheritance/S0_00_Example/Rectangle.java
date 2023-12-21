package C0_00_Basics.S3_03_Core_OOPs_Concepts.C2_02_Inheritance.S0_00_Example;

// Rectangle.java - Derived class inheriting from Shape
public class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String shapeName, double length, double width) {
        super(shapeName); // Call to superclass constructor using super keyword
        this.length = length;
        this.width = width;
    }

    public void displayRectangleInfo() {
        System.out.println("Rectangle Length: " + length + ", Width: " + width);
    }

    // Overriding displayShapeInfo() method from superclass
    @Override
    public void displayShapeInfo() {
        super.displayShapeInfo(); // Call to superclass method using super keyword
        System.out.println("Rectangle Specific Info:");
        displayRectangleInfo(); // Invoking its own method
    }
}

