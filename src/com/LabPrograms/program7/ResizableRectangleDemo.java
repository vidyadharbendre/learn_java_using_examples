package com.LabPrograms.program7;

/*
7. Develop a JAVA program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow
an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods
 */


// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Implement the Resizable interface in the Rectangle class
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize width and height
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods for width and height
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    // Implement the resizeWidth method from the Resizable interface
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    // Implement the resizeHeight method from the Resizable interface
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    // Display the current state of the rectangle
    public void display() {
        System.out.println("Rectangle - Width: " + getWidth() + ", Height: " + getHeight());
    }
}

// Main class for testing
public class ResizableRectangleDemo {
    public static void main(String[] args) {
        // Create an instance of Rectangle


        Rectangle rectangleRefObj;
        rectangleRefObj = new Rectangle(5, 8);

        rectangleRefObj.display();

        // Display the initial state of the rectangle
        System.out.println("Initial State:");
        rectangleRefObj.display();

        // Resize the rectangle by changing width and height
        rectangleRefObj.resizeWidth(10);
        rectangleRefObj.resizeHeight(15);

        // Display the resized state of the rectangle
        System.out.println("\nResized State:");
        rectangleRefObj.display();
    }
}

// The output of the above program is shown as below
/*
Initial State:
Rectangle - Width: 5, Height: 8

Resized State:
Rectangle - Width: 10, Height: 15
 */