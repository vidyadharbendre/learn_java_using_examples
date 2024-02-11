package Lessons.Concepts.Keywords.This;

/**
 *
 * Author   :
 * Vidyadhar Bendre
 *
 * Email    :
 * vidyadhar.bendre@gmail.com
 *
 * Date     :
 * 25 December, 2023
 *
 * Purpose  :
 * This class demonstrates the use of static methods and variables in Java.
 *
 * In this scenario:
 *
 * 1. Static Variables: 'number1' and 'number2' are static variables, shared across
 *    all instances of the class. They belong to the class itself and are accessible
 *    without object instantiation.
 *
 * 2. Static Methods: 'assignNumbers' and 'displayNumbers' are static methods, usable
 *    without an instance of the class. They operate on class-level variables and provide
 *    functionality without requiring object instantiation.
 *
 * 3. No 'this' Keyword: The absence of object creation eliminates the necessity of
 *    using the 'this' keyword. 'this' typically refers to the current instance of
 *    the class in non-static contexts. In this case, since the scenario deals only
 *    with static elements (methods and variables), 'this' isn't required or applicable.
 *
 * By directly accessing static variables within static methods or assigning values
 * to them without object instantiation, the 'this' keyword becomes unnecessary.
 */

public class ThisStaticExample {
    private static int number1;
    private static int number2;

    // Static method to assign values to static variables
    public static void assignNumbers(int num1, int num2) {
        number1 = num1;
        number2 = num2;
    }

    // Static method to display the values of static variables
    public static void displayNumbers() {
        System.out.println("Value of 'number1': " + number1);
        System.out.println("Value of 'number2': " + number2);
    }

    public static void main(String[] args) {
        // Assigning values to static variables using the static method
        assignNumbers(10, 20);

        // Displaying the values of static variables using the static method
        displayNumbers(); // Output: Value of 'number1': 10, Value of 'number2': 20

        // Modifying the values directly
        number1 = 50;
        number2 = 60;

        // Displaying the updated values directly
        displayNumbers(); // Output: Value of 'number1': 50, Value of 'number2': 60
    }
}

// The output of the above program is shown below:
/*
Value of 'number1': 10
Value of 'number2': 20
Value of 'number1': 50
Value of 'number2': 60
 */

