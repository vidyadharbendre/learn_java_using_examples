/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    22 November, 2023

    Purpose:
    Demonstrate a simple procedural approach to perform addition in Java.

    Description:
    This program showcases a procedural method for addition using static methods.
    It defines an 'add' method that takes two integers and returns their sum.
    The 'main' method calls the 'add' method and displays the result.

    Inline Comments:
    - The 'ProceduralExample' class demonstrates a straightforward approach to performing addition using a static method.
    - The 'add' method takes two integers and returns their sum.
    - In the 'main' method, the 'add' method is called to compute the sum of 3 and 4, displaying the result.
*/

public class ProceduralExample {
    // Function for addition
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(3, 4); // Calling the add function
        System.out.println("Result: " + result); // Displaying the result
    }
}

// The output of the above program is

/*

Result: 7

 */