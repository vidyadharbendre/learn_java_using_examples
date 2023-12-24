package Lessons.ModelQuestionsAnswers.Set1.Nine;

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
// The output of the above program is shown below:
/*
Square of 5 is: 25
 */
