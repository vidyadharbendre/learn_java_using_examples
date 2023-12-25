package Lessons.Concepts.Constructors.Keywords.Final;

/**
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 25 December 2023
 *
 * Purpose:
 * This class demonstrates the usage of 'final' keyword in Java.
 *
 *
 * 1. 'FinalExample' class showcases the usage of 'final' keyword with variables and methods.
 *
 * 2. 'myNumber' is a public final variable initialized with a value of 10.
 *    It's declared 'final' to prevent reassignment after initialization.
 *
 * 3. 'myString' is a private final variable initialized within the constructor.
 *    Its value cannot be altered after initialization.
 *
 * 4. The constructor 'FinalExample()' initializes the 'myString' variable with "Hello, Final!".
 *
 * 5. Method 'displayMessage()' is a final method that prints the value of 'myString'.
 *    Final methods cannot be overridden in subclasses.
 *
 * 6. 'main()' method demonstrates the usage of 'FinalExample' by:
 *    - Creating an instance 'demoObj' of 'FinalExample'.
 *    - Accessing and displaying the final variables ('myNumber').
 *    - Calling the final method ('displayMessage()').
 *    - Attempting to modify final variables or override a final method (which will result in a compilation error).
 */

// Define a class with final variables and methods
class FinalExample {
    // Final variables
    public final int myNumber = 10;
    private final String myString;

    // Constructor to initialize final variable
    public FinalExample() {
        myString = "Hello, Final!";
    }

    // Final method
    public final void displayMessage() {
        System.out.println("Message: " + myString);
    }

    public static void main(String[] args) {
        // Create an instance of FinalDemo
        FinalExample demoObj;
        demoObj = new FinalExample();

        // Access final variables
        System.out.println("My number: " + demoObj.myNumber);

        // Call final method
        demoObj.displayMessage();

        // Attempt to modify final variables or override final method
        // (which will result in a compilation error)
        // demo.myNumber = 20; // Cannot assign a value to a final variable
        // demo.myString = "New String"; // Cannot assign a value to a final variable
        // public final void displayMessage() { /* Code */ } // Cannot override a final method
    }
}

// The output of the above program is shown as below:
/*
My number: 10
Message: Hello, Final!
 */