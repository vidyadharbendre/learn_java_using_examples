package Lessons.All_Concepts_AEIP_Example;

/*
  Explanation:

  Inheritance: Triangle, Square, and Rectangle extend the base class Shape, inheriting its side attribute.
  Encapsulation: The member variable side is protected in the base class, encapsulating it within the class hierarchy.
                 It's accessible to derived classes but not directly outside the hierarchy.
  Abstraction: The base class Shape contains an abstract method calculateArea(), making it an abstract class.
               The derived classes provide concrete implementations.
  Polymorphism: An array of Shape references stores different types of shapes (Triangle, Square, Rectangle),
                and the calculateArea() method is called for each, showcasing polymorphism in Java.
*/

// Base class: Shape
abstract class Shape {
    protected double side;

    // Constructor
    Shape(double s) {
        side = s;
    }

    // Abstract method for area calculation
    abstract double calculateArea();
}

// Derived class: Triangle
class Triangle extends Shape {
    Triangle(double s) {
        super(s);
    }

    // Implementing calculateArea method for Triangle
    double calculateArea() {
        return 0.5 * side * side;
    }
}

// Derived class: Square
class Square extends Shape {
    Square(double s) {
        super(s);
    }

    // Implementing calculateArea method for Square
    double calculateArea() {
        return side * side;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    private double height;

    Rectangle(double s, double h) {
        super(s);
        height = h;
    }

    // Implementing calculateArea method for Rectangle
    double calculateArea() {
        return side * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism - Shape references pointing to derived classes
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(4.0);
        shapes[1] = new Square(5.0);
        shapes[2] = new Rectangle(3.0, 6.0);

        // Calculating and displaying areas
        for (int i = 0; i < 3; ++i) {
            System.out.println("Area of shape " + (i + 1) + ": " + shapes[i].calculateArea());
        }
    }
}

// The output of the above program is shown below
/*
Area of shape 1: 8.0
Area of shape 2: 25.0
Area of shape 3: 18.0
 */