package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set2.Seven;

public class NonStaticExample {
    private double radius;

    // Constructor to initialize radius
    public NonStaticExample(double radius) {
        this.radius = radius;
    }

    // Non-static method to calculate the area of the circle
    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        NonStaticExample circleObj;
        circleObj = new NonStaticExample(5.0);
        double area = circleObj.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}
// The output of the above example is shown below:

/*
Area of the circle: 78.5
 */
