package C0_00_Basics.S3_03_Core_OOPs_Concepts.C3_03_Abstraction;

// Rectangle class implementing Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method to calculate area for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementing abstract method to calculate perimeter for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
