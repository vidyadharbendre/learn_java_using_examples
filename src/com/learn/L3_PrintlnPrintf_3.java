package com.learn;
/*
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 24 November, 2023
 *
 * Purpose:
 * The purpose of this Java program is to demonstrate the usage of printf, println,
 * and print methods for outputting text to the console in different formats.
 *
 * Description:
 * Declares and initializes an integer variable num with the value 10 and a double variable pi with
 * the value 3.1416.
 * Uses printf to display formatted output by inserting the values of num and pi into a string with
 * placeholders (%d for integers and %.2f for a floating-point number with two decimal places).
 *
 * Uses println to print two separate lines with the text "1-Hello" and "2-Hello", respectively,
 * each followed by a newline character.
 * Uses print to display "3-Hello" without a newline character and then "4-World" without a newline
 * character, resulting in both texts being displayed on the same line.
 *
 * Explanation:
 * printf is utilized to format and display text with placeholders (%d and %.2f) for integer and
 * floating-point values, respectively. This method allows for formatted output.
 *
 * println is used to print text followed by a newline character, ensuring that each subsequent
 * println statement outputs text on a new line.
 * print is employed to display text without inserting a newline character.
 * Consequently, multiple print statements on the same line will result in the text being displayed
 * continuously without line breaks.
 */

public class L3_PrintlnPrintf_3 {
    public static void main(String[] args) {
        // Declaring variables
        int num = 10; // Initializing an integer variable
        double pi = 3.1416; // Initializing a double variable

        // Printing formatted output using printf with placeholders
        System.out.printf("The number is %d and the value of pi is %.2f%n", num, pi);

        // Printing "1-Hello" followed by a newline using println
        System.out.println("1-Hello - prints in next line");

        // Printing "2-Hello" followed by a newline using println
        System.out.println("2-Hello - prints in next line");

        // Printing "3-Hello" without a newline using print
        System.out.print("3-Hello ");

        // Printing "4-World" without a newline using print
        System.out.print("4-World");
    }
}

/*
 * Compilation Command:
 * javac -d ../../../out L3_PrintlnPrintf_3.java
 */

// The output of the above program is shown below
/*
 * The number is 10 and the value of pi is 3.14
 * 1-Hello - prints in next line
 * 2-Hello - prints in next line
 * 3-Hello 4-World
 */
