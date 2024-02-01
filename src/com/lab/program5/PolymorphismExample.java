package com.lab.program5;

/*
5. Develop a JAVA program to create a class named shape. Create three sub classes namely: circle, triangle
and square, each class has two member functions named draw () and erase (). Demonstrate  polymorphism concepts by developing suitable methods, defining member data and main program.

 */
// Shape class
class Shape {
    // Member functions draw() and erase() in the Shape class
    public void draw() {
        System.out.println("Drawing shape");
    }

    public void erase() {
        System.out.println("Erasing shape");
    }
}

// Circle class extending Shape
class Circle extends Shape {
    // Overriding draw() and erase() methods for Circle
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}

// Triangle class extending Shape
class Triangle extends Shape {
    // Overriding draw() and erase() methods for Triangle
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
}

// Square class extending Shape
class Square extends Shape {
    // Overriding draw() and erase() methods for Square
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating Shape references pointing to Circle, Triangle, and Square objects
        Shape shapeRefObj1;
        shapeRefObj1 = new Circle();

        Shape shapeRefObj2;
        shapeRefObj2 = new Triangle();

        Shape shapeRefObj3;
        shapeRefObj3 = new Square();

        // Demonstrating polymorphism
        shapeRefObj1.draw();
        shapeRefObj1.erase();

        shapeRefObj2.draw();
        shapeRefObj2.erase();

        shapeRefObj3.draw();
        shapeRefObj3.erase();
    }
}


/*
Drawing Circle
Erasing Circle
Drawing Triangle
Erasing Triangle
Drawing Square
Erasing Square
 */