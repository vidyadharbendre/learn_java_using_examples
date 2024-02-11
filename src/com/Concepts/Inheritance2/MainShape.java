package Lessons.Concepts.Inheritance2;

public class MainShape {
    public static void main(String[] args) {

        Shape shapeObj1;
        shapeObj1 = new Shape(10);
        shapeObj1.displayInformation();

        Square squareObj2;
        squareObj2 = new Square(10, 10);
        squareObj2.displayInformation();

        Square squareObj3;
        squareObj3 = new Square(10, 20);
        squareObj3.displayInformation();

        Cube cubeObj4;
        cubeObj4 = new Cube(10, 10, 10);
        cubeObj4.displayInformation();

        Shape shapeObj5;
        shapeObj5 = new Cube(10, 20, 30);

        shapeObj5.displayInformation();

    }

}

// The output of the above program is shown as below:

/*
The area of the Circle is...: 314.0
The area of the Square is...: 100.0
The area of the Rectangle is...: 200.0
The area of the Cube is...: 1000.0
The area of the cuboid is...: 6000.0
 */
