/*
    13th Program

    Author: Vidyadhar Bendre
    Email: vidyadhar.bendre@gmail.com
    Date: 29th November, 2023

    Purpose:
    This class serves as a template for creating objects that encapsulate two float attributes
    and provide methods for performing basic arithmetic operations and attribute manipulation.
    It demonstrates the concept of encapsulation and method functionalities in an object-oriented
    manner.
*/

public class ClassOOPsTemplate_13 {
    // Private attributes to encapsulate the state of the object
    private float attribute1;
    private float attribute2;

    // Constructors for object initialization
    public ClassOOPsTemplate_13(float attr1, float attr2) {
        this.attribute1 = attr1;
        this.attribute2 = attr2;
    }

    // Getter methods for accessing private attributes
    public float getAttribute1() {
        return attribute1;
    }

    public float getAttribute2() {
        return attribute2;
    }

    // Setter methods for modifying private attributes
    public void setAttribute1(float newValue) {
        this.attribute1 = newValue;
    }

    public void setAttribute2(float newValue) {
        this.attribute2 = newValue;
    }

    // Methods representing behavior or actions of the object

    /**
     * Performs addition of two integer parameters.
     * @param param1 First integer parameter
     * @param param2 Second integer parameter
     * @return Result of the addition operation
     */
    public int performAddition(int param1, int param2) {
        // Method implementation
        int result = param1 + param2;
        return result;
    }

    /**
     * Calculates the square of a float parameter.
     * @param param Input float parameter
     * @return Result of squaring the input
     */
    public float performSquare(float param) {
        // Method implementation
        float result = param * param;
        return result;
    }

    // Additional methods...

    // Main method or other entry point for testing (if applicable)
    public static void main(String[] args) {
        // Code for testing the class functionality
        ClassOOPsTemplate_13 obj = new ClassOOPsTemplate_13(1.0f, 2.0f);
        // Test cases or interactions with the object
    }
}


// Compile the above program using the below mentioned command

