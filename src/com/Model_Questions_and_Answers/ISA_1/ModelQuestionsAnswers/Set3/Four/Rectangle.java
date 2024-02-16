package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set3.Four;

public class Rectangle {
    private int length;
    private int width;

    // Constructor to initialize length and width
    public Rectangle(int initialLength, int initialWidth) {
        this.length = initialLength;
        this.width = initialWidth;
    }

    // Method to calculate and display the area of the rectangle
    public void calculateArea() {
        int area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }

    public static void main(String[] args) {
        // Creating an instance of Rectangle with initial values 5 and 7
        Rectangle rect1;
        rect1 = new Rectangle(5, 7);

        // Displaying the area with initial values
        rect1.calculateArea();

        // Updating values to 9 and 11
        rect1.length = 9;
        rect1.width = 11;

        // Displaying the area with updated values
        rect1.calculateArea();
    }
}
// The output of the above program is shown as below:
/*
Area of the rectangle: 35
Area of the rectangle: 99
 */
