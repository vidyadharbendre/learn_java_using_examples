/*

    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    22 November, 2023

    Purpose:
    Demonstrates the use of a constructor in Java, initializing an object with a value.

    Description:
    This program defines a class, ConstructorExample, showcasing the usage of a constructor method with the same name as the class.
    It initializes the 'value' variable upon object creation and displays the stored value directly in the main method.

    Explanation:
    - The ConstructorExample class contains a private 'value' variable and a constructor that assigns a value to it upon object instantiation.
    - It includes a main method where an instance of ConstructorExample is created, and its constructor is used to set the 'value' to 10.
    - The 'value' is then displayed directly from the main method to demonstrate its initialization using the constructor.

    Inline Comments:
    - The 'ConstructorExample' class initializes 'value' upon object creation using the constructor.
    - The main method creates an instance of 'ConstructorExample', setting 'value' to 10, and displays it.
*/
package C0_00_Basics.S2_02_Procedural_Vs_OOPs;
public class ConstructorExample {
    private int value; // Private variable to store the value

    // Constructor with the same name as the class to initialize 'value'
    public ConstructorExample(int val) {
        value = val; // Assigning the parameter 'val' to the 'value' variable
    }

    public static void main(String[] args) {
        ConstructorExample obj;
        obj = new ConstructorExample(10); // Creating an instance and setting 'value' to 10 using the constructor
        System.out.println("Value: " + obj.value); // Displaying the stored 'value'
    }
}

// The output of the above program is

/*

Value: 10

*/