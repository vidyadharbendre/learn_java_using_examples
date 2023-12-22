package C0_00_Basics.S3_03_Core_OOPs_Concepts.C4_04_Polymorphism.S0_00_Example;

// Rectangle.java - Derived class extending Shape for Rectangle
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() { // Implementation for area calculation specific to Rectangle
        return length * width;
    }

    @Override
    public double calculatePerimeter() { // Implementation for perimeter calculation specific to Rectangle
        return 2 * (length + width);
    }
}
