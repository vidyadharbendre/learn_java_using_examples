# Model Question Paper 1:

9. **Design and differentiate between static and non-static methods & demonstrate with an example for each.**

## StaticExample

This class demonstrates the usage of a static method in Java to calculate the square of a number.

#### Java Code:

```java
public class StaticExample {

    public static void main(String[] args) {
        int number = 5;
        int squareResult = StaticExample.square(number);
        System.out.println("Square of " + number + " is: " + squareResult);
    }

    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }
}
```

## NonStaticExample:

```markdown

This class illustrates the usage of a non-static method in Java to calculate the area of a circle.

#### Java Code:

```java
public class NonStaticExample {
    private double radius;

    // Constructor to initialize radius
    public NonStaticExample(double radius) {
        this.radius = radius;
    }

    // Non-static method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        NonStaticExample circleObj;
        circleObj = new NonStaticExample(5.0);
        double area = circleObj.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}
```