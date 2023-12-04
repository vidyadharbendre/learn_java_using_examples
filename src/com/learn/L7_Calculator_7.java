/*
    1st Program
    Author:
    Vidyadhar Bendre

    Date:
    29 November, 2023

    Email:
    vidyadhar.bendre@gmail.com

    Description:
    This class defines a Calculator with instance variables and methods to perform basic arithmetic
    operations.

    Instance Variables:
    - float number1: Represents the first number used in calculations.
    - float number2: Represents the second number used in calculations.
    - These variables are instance variables, specific to each instance of the Calculator class.
    - Instance variables store unique data for each object created from this class.

    Methods:
    - float add(): Performs addition using number1 and number2.
    - float multiply(): Performs multiplication using number1 and number2.
    - float divide(): Performs division using number1 and number2. Handles division by zero.
*/

/*

Author:
Your name

Date:
29th November, 2023

Purpose: This is to create a class of Calculator

 */

class L7_Calculator_7 {
    // Attributes (Instance Variables)
    float number1;
    float number2;

    // Methods for performing operations
    float add() {
        return number1 + number1;
    }

    float multiply() {
        return number1 * number2;
    }

    float divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }
}

/*
* Compile tha above program using the following command
*
* javac -d ../../../out L7_Calculator_7.java
*
* */