package Lessons.ModelQuestionsAnswers.Set3.Seven;

// Abstract class Shape representing the abstraction
abstract class Shape {
    // Abstract methods for area and perimeter to be implemented by subclasses
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Concrete subclass Circle inheriting from Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    // Implementing abstract method to calculate perimeter for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        // Creating an instance of Circle
        Circle circleObj = new Circle(5);

        // Calculating and displaying area and perimeter of the circle
        System.out.println("Area of the Circle: " + circleObj.calculateArea());
        System.out.println("Perimeter of the Circle: " + circleObj.calculatePerimeter());
    }
}

// The output of the above program is shown as below:
/*
Area of the Circle: 78.5
Perimeter of the Circle: 31.400000000000002
 */