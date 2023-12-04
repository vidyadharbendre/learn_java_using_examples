/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    22 November, 2023

    Purpose:
    Demonstrates the use of a constructor in Java, initializing an object with a value and performing addition.

    Description:
    This program defines a class, ConstructorAdd, showcasing the usage of a constructor method to perform addition.
    It initializes the 'value' variable upon object creation by adding two integers and displays the computed sum directly in the main method.

    Explanation:
    - The ConstructorAdd class contains a private 'value' variable and a constructor that performs addition on two integers and assigns the result to 'value'.
    - It includes a main method where an instance of ConstructorAdd is created using the constructor, performing addition, and displaying the computed sum.

    Inline Comments:
    - The 'ConstructorAdd' class initializes 'value' by performing addition in the constructor.
    - The main method creates an instance of 'ConstructorAdd', which computes the sum of two integers using the constructor and displays it.
*/
package C0_00_Basics.S2_02_Procedural_Vs_OOPs;
public class ConstructorAdd {
    private int value; // Private variable to store the value

    // Constructor performs addition of two integers and initializes 'value'
    public ConstructorAdd(int a, int b) {
        value = a + b; // Performing addition and assigning the result to 'value'
    }

    public static void main(String[] args) {
        ConstructorAdd obj = new ConstructorAdd(3, 4); // Creating an instance and performing addition using the constructor
        System.out.println("Result: " + obj.value); // Displaying the computed sum
    }
}

// The output of the above program is
/*

Result: 7

 */