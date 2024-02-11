package Lessons.Concepts.Constructors.GetterSetter;

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
 * Purpose  : This class demonstrates how the same object can be referenced by multiple references in Java.
 *
 * In this scenario:
 *
 * 1. 'SameObjectTwoReferences' class illustrates how objects can be referred to by different references.
 *
 * 2. 'variable1' (int) is a private instance variable of the class.
 *
 * 3. Default and parameterized constructors initialize 'variable1'.
 *
 * 4. 'setVariable1(int)' method updates the value of 'variable1'.
 *
 * 5. 'getVariable1()' method retrieves the value of 'variable1'.
 *
 * 6. 'main()' method serves as the entry point, demonstrating:
 *    - Creation of objects using default and parameterized constructors.
 *    - Assigning objects to different references.
 *    - Modifying and retrieving values of 'variable1'.
 */
public class SameObjectTwoReferences {
    private int variable1;

    SameObjectTwoReferences() {
        // Default constructor initializing 'variable1' to 100
        this.variable1 = 100;
    }

    SameObjectTwoReferences(int newVariable1) {
        // Parameterized constructor setting 'variable1' to the value passed as an argument
        this.variable1 = newVariable1;
    }

    public void setVariable1(int updateVariable) {
        // Method to update 'variable1' with a new value
        this.variable1 = updateVariable;
    }

    public int getVariable1() {
        // Method to retrieve the value of 'variable1'
        return variable1;
    }

    public static void main(String[] args) {
        // Creating the first object and displaying its default value
        SameObjectTwoReferences firstObj;
        firstObj = new SameObjectTwoReferences();
        System.out.println("Default Variable1...: " + firstObj.variable1);

        // Assigning the first object to a second reference and printing its value
        SameObjectTwoReferences secondObj;
        secondObj = firstObj;
        System.out.println("Printing Default Through secondObj...: " + secondObj.variable1);

        // Creating a third object with a specific value and printing it
        SameObjectTwoReferences thirdObj;
        thirdObj = new SameObjectTwoReferences(911);
        System.out.println("Printing Third Object...: " + thirdObj.variable1);

        // Assigning the third object to the second reference and printing its value
        secondObj = thirdObj;
        System.out.println(secondObj.variable1);

        // Updating 'variable1' using the set method and displaying the modified value
        thirdObj.setVariable1(688);
        System.out.println("Updated Value through SetMethod...:" + thirdObj.variable1);

        // Retrieving 'variable1' using the get method and displaying its value
        System.out.println("Retrieve the variable through get method...:" + thirdObj.getVariable1());
    }
}
// The output of the above program is shown as below:
/*
Default Variable1...: 100
Printing Default Through secondObj...: 100
Printing Third Object...: 911
911
Updated Value through SetMethod...:688
Retrieve the variable through get method...:688
 */