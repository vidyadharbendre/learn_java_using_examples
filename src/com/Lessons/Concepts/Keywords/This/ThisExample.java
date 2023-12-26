package Lessons.Concepts.Keywords.This;

/**
 * Author   : Vidyadhar Bendre
 * Email    : vidyadhar.bendre@gmail.com
 * Date     : 25 December, 2023
 * Purpose  : This class demonstrates the usage of 'this' keyword in Java.
 *
 * In this scenario:
 *
 * 1. 'number1' and 'number2' are instance variables of the class 'ThisExample'.
 *    They store values specific to each object instance.
 *
 * 2. The constructor 'ThisExample(int number1, int number2)' initializes 'number1' and 'number2'
 *    with the values passed as parameters. 'this' keyword is used to distinguish between
 *    the instance variables and the constructor parameters.
 *
 * 3. Method 'getObject()' returns the current class instance using 'this'.
 *
 * 4. Method 'displayNumbers()' displays the values of 'number1' and 'number2' of the current instance.
 *    'this' is used to access instance variables.
 *
 * 5. In 'main()', two objects 'obj1' and 'obj2' of 'ThisExample' are created and their values are displayed.
 *    'this' is used within the class methods to refer to the instance variables.
 *
 * 6. Direct modification of instance variables without 'this' keyword is showcased in 'main()' to demonstrate
 *    how the absence of 'this' refers to the instance variables, distinguishing them from local variables.
 */
public class ThisExample {
    private int number1;
    private int number2;

    // Constructor with two parameters
    public ThisExample(int number1, int number2) {
        this.number1 = number1; // 'this' refers to the instance variable 'number1'
        this.number2 = number2; // 'this' refers to the instance variable 'number2'
    }

    // Method using 'this' to return the current class instance
    public ThisExample getObject() {
        return this; // Returns the current class instance
    }

    // Method to display the values of 'number1' and 'number2'
    public void displayNumbers() {
        System.out.println("Value of 'number1': " + this.number1);
        System.out.println("Value of 'number2': " + this.number2);
    }

    public static void main(String[] args) {
        ThisExample obj1;
        obj1 = new ThisExample(10, 20);

        ThisExample obj2 = new ThisExample(30, 40);

        // Using 'this' to display the values of 'number1' and 'number2'
        obj1.displayNumbers(); // Output: Value of 'number1': 10, Value of 'number2': 20
        obj2.displayNumbers(); // Output: Value of 'number1': 30, Value of 'number2': 40

        // Not using 'this' to assign values to instance variables directly
        obj1.number1 = 50; // Changes the value of 'number1' in obj1
        obj2.number2 = 60; // Changes the value of 'number2' in obj2

        // Displaying the updated values
        obj1.displayNumbers(); // Output: Value of 'number1': 50, Value of 'number2': 20
        obj2.displayNumbers(); // Output: Value of 'number1': 30, Value of 'number2': 60
    }
}
// The output of the above program is shown as below:
/*
Value of 'number1': 10
Value of 'number2': 20
Value of 'number1': 30
Value of 'number2': 40
Value of 'number1': 50
Value of 'number2': 20
Value of 'number1': 30
Value of 'number2': 60
 */
