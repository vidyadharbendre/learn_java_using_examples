package C0_00_Basics.S3_03_Core_OOPs_Concepts.C4_04_Abstraction;

// Circle.java

// Circle class implementing Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing abstract method to calculate perimeter for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
