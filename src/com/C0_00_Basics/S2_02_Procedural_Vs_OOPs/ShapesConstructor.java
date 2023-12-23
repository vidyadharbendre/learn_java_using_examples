package C0_00_Basics.S2_02_Procedural_Vs_OOPs;

public class ShapesConstructor {
    private double side; // For square
    private double length; // For rectangle
    private double width; // For rectangle and cube
    private double radius; // For circle

    // Default constructor for circle
    public ShapesConstructor() {
        side = 0; // Default side of square
        length = 0; // Default length of rectangle
        width = 0; // Default width of rectangle and cube
        radius = 0; // Default radius of circle
    }

    // Constructor for square or circle
    public ShapesConstructor(double dimension) {
        if (dimension <= 0) {
            System.out.println("Invalid dimension");
            return;
        }
        if (dimension == (int) dimension) { // Check if it's an integer value to create a square
            side = dimension; // Initialize side of square
        } else {
            radius = dimension; // Initialize radius of circle
        }
    }

    // Constructor for rectangle or cube
    public ShapesConstructor(double l, double w) {
        if (l <= 0 || w <= 0) {
            System.out.println("Invalid dimensions");
            return;
        }
        length = l; // Initialize length of rectangle
        width = w; // Initialize width of rectangle and cube
    }

    // Constructor for cube
    public ShapesConstructor(double s1, double s2, double s3) {
        if (s1 <= 0 || s2 <= 0 || s3 <= 0 || s1 != s2 || s1 != s3) {
            System.out.println("Invalid dimensions for cube");
            return;
        }
        side = s1; // Initialize side of cube
        length = s2; // Assigning extra parameters to length and width for differentiation
        width = s3;
    }

    // Function to calculate area of a square
    public double calculateSquareArea() {
        return side * side;
    }

    // Function to calculate area of a rectangle
    public double calculateRectangleArea() {
        return length * width;
    }

    // Function to calculate area of a circle
    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    // Function to calculate area of a cube
    public double calculateCubeArea() {
        return 6 * side * side;
    }

    public static void main(String[] args) {
        // Creating shapes based on different constructors
        ShapesConstructor shape1 = new ShapesConstructor(); // Create circle with default radius
        ShapesConstructor shape2 = new ShapesConstructor(5.0); // Create square with side 5.0
        ShapesConstructor shape3 = new ShapesConstructor(4.0, 6.0); // Create rectangle with length 4.0 and width 6.0
        ShapesConstructor shape4 = new ShapesConstructor(3.0, 3.0, 3.0); // Create cube with side 3.0

        // Calculating areas using appropriate methods
        System.out.println("Area of Circle: " + shape1.calculateCircleArea());
        System.out.println("Area of Square: " + shape2.calculateSquareArea());
        System.out.println("Area of Rectangle: " + shape3.calculateRectangleArea());
        System.out.println("Area of Cube: " + shape4.calculateCubeArea());
    }
}
