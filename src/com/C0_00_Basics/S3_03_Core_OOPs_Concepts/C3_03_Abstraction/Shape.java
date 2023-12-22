package C0_00_Basics.S3_03_Core_OOPs_Concepts.C3_03_Abstraction;

// Abstract class defining a shape
abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Abstract method to calculate perimeter (to be implemented by subclasses)
    public abstract double calculatePerimeter();

    // Concrete method in the abstract class
    public void display() {
        System.out.println("This is a shape.");
    }
}

