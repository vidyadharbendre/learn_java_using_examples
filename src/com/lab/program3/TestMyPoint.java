package com.lab.program3;

/*
4. A class called MyPoint, which models a 2D point with x and y coordinates, is designed as follows:
● Two instance variables x (int) and y (int).
● A default (or "no-arg") constructor that construct a point at the default location of (0, 0).
● A overloaded constructor that constructs a point with the given x and y coordinates.
● A method setXY() to set both x and y.
● A method getXY() which returns the x and y in a 2-element int array.
● A toString() method that returns a string description of the instance in the format "(x, y)".
● A method called distance(int x, int y) that returns the distance from this point to another point at the
given (x, y) coordinates
● An overloaded distance(MyPoint another) that returns the distance from this point to the given
MyPoint instance (called another)
● Another overloaded distance() method that returns the distance from this point to the origin (0,0)
Develop the code for the class MyPoint. Also develop a JAVA program (called TestMyPoint) to test all the
methods defined in the class.

 */
class MyPoint {
    // Two instance variables x (int) and y (int)
    private int x;
    private int y;

    // Default (no-arg) constructor that constructs a point at the default location of (0, 0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor that constructs a point with given x and y coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return x and y in a 2-element int array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // toString() method that returns a string description of the instance in the format "(x, y)"
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Method to calculate distance from this point to another point at given (x, y) coordinates
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    // Overloaded distance() method that returns the distance from this point to another MyPoint instance
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
    }

    // Another overloaded distance() method that returns the distance from this point to the origin (0,0)
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}

public class TestMyPoint {
    public static void main(String[] args) {
        // Creating MyPoint instances
        MyPoint pointRefObj1;
        pointRefObj1 = new MyPoint();
        MyPoint pointRefObj2;
        pointRefObj2 = new MyPoint(3, 4);

        // Setting new x and y coordinates for point1
        pointRefObj1.setXY(1, 1);

        // Getting x and y coordinates for point1
        int[] xy = pointRefObj1.getXY();
        System.out.println("Point 1 coordinates: (" + xy[0] + ", " + xy[1] + ")");

        // Printing points and distances
        System.out.println("Point 1: " + pointRefObj1.toString());
        System.out.println("Point 2: " + pointRefObj1.toString());
        System.out.println("Distance from (3,4) to (0,0): " + pointRefObj2.distance(0, 0));
        System.out.println("Distance from Point 2 to Point 1: " + pointRefObj2.distance(pointRefObj1));
        System.out.println("Distance from Point 1 to origin (0,0): " + pointRefObj1.distance());
    }
}

/*
Point 1 coordinates: (1, 1)
Point 1: (1, 1)
Point 2: (1, 1)
Distance from (3,4) to (0,0): 5.0
Distance from Point 2 to Point 1: 3.605551275463989
Distance from Point 1 to origin (0,0): 1.4142135623730951
 */