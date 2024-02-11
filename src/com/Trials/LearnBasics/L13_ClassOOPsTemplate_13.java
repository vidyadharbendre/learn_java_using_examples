/*
 * Improved OOPS Template
 *
 * Author: Vidyadhar Bendre
 * Email: vidyadhar.bendre@gmail.com
 * Date: 29th November, 2023
 *
 * Purpose:
 * This class serves as a template for creating objects that encapsulate two float attributes
 * and provide methods for performing basic arithmetic operations and attribute manipulation.
 * It demonstrates the concept of encapsulation and method functionalities in an object-oriented
 * manner.
 */

public class L13_ClassOOPsTemplate_13 {
    // Private attributes to encapsulate the state of the object
    /**
    These declare private attributes attribute1 and attribute2 of type float.
    They are only accessible within the L13_ClassOOPsTemplate_13 class.
     */
    private float attribute1; // First float attribute
    private float attribute2; // Second float attribute

    // Constructors for object initialization
    /**
    This is a constructor method.
    It initializes attribute1 and attribute2 with values provided during object creation.
     */
    public L13_ClassOOPsTemplate_13(float attr1, float attr2) {
        this.attribute1 = attr1; // Initialize attribute1 with attr1 value
        this.attribute2 = attr2; // Initialize attribute2 with attr2 value
    }

    // Getter methods for accessing private attributes
    /**
    These below given methods allow access to the private attributes attribute1 and attribute2.
     */
    public float getAttribute1() {
        return attribute1; // Return the value of attribute1
    }
    public float getAttribute2() {
        return attribute2; // Return the value of attribute2
    }
    // Setter methods for modifying private attributes
    /**
    These methods modify the private attributes attribute1 and attribute2 with new values
     */
    public void setAttribute1(float newValue) {
        this.attribute1 = newValue; // Set the value of attribute1 to newValue
    }

    public void setAttribute2(float newValue) {
        this.attribute2 = newValue; // Set the value of attribute2 to newValue
    }

    // Methods representing behavior or actions of the object
    /**
    They are meant to demonstrate the behavior or actions of the object.
     */
    /**
     * Performs addition of two integer parameters.
     * @param param1 First integer parameter
     * @param param2 Second integer parameter
     * @return Result of the addition operation
     */
    public int performAddition(int param1, int param2) {
        // Method implementation
        int result = param1 + param2; // Adding param1 and param2
        return result; // Return the result of the addition operation
    }

    /**
     * Calculates the square of a float parameter.
     * @param param Input float parameter
     * @return Result of squaring the input
     */
    public float performSquare(float param) {
        // Method implementation
        float result = param * param; // Calculating square of param
        return result; // Return the squared result
    }

    // Additional methods...

    // Main method or other entry point for testing (if applicable)
    public static void main(String[] args) {
        // Code for testing the class functionality
        L13_ClassOOPsTemplate_13 obj;
        obj = new L13_ClassOOPsTemplate_13(1.0f, 2.0f); // Creating an object with initial values 1.0f and 2.0f

        // Test cases or interactions with the object can be added here
    }
}

// Compile the above program using the below mentioned command
/*
 * javac -d ../../../out L13_ClassOOPsTemplate_13.java
*/



/*
Class Declaration:

public class L13_ClassOOPsTemplate_13 { ... }
This declares a class named L13_ClassOOPsTemplate_13.
Private Attributes:

private float attribute1; // First float attribute
private float attribute2; // Second float attribute

Constructor:

public L13_ClassOOPsTemplate_13(float attr1, float attr2) { ... }


public float getAttribute1() { ... }
public float getAttribute2() { ... }
These methods allow access to the private attributes attribute1 and attribute2.
Setter Methods:

public void setAttribute1(float newValue) { ... }
public void setAttribute2(float newValue) { ... }
These methods modify the private attributes attribute1 and attribute2 with new values.
Methods for Object Behavior:

performAddition and performSquare are methods that perform addition and square operations.
They are meant to demonstrate the behavior or actions of the object.
Main Method:

public static void main(String[] args) { ... }
It's the entry point for testing the class functionality.
 */