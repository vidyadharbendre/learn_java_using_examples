/*

    This should be 9th Program
    May be later can be utilized to talk about inheritance by extending it

    Author:
    Vidyadhar Bendre

    Date:
    v1 - 29 November, 2023
    v2 - 02 December, 2023

    Email:
    vidyadhar.bendre@gmail.com

    Description:
    This class defines a CalculatorConstructor with instance variables and methods to perform basic
    arithmetic operations.

    Instance Variables:
    - float number1: Represents the first number used in calculations.
    - float number2: Represents the second number used in calculations.
    - These variables are instance variables, specific to each instance of the CalculatorConstructor
      class.
    - Instance variables store unique data for each object created from this class.

    Methods:
    - float add(): Performs addition using number1 and number2.
    - float multiply(): Performs multiplication using number1 and number2.
    - float divide(): Performs division using number1 and number2. Handles division by zero.
    - CalculatorConstructor(float num1, float num2): Constructor to initialize number1 and number2
      during object creation.
*/

class CalculatorConstructor_9 {
    // Attributes (Instance Variables)
    float number1;
    float number2;

    // Constructor to initialize number1 and number2
    CalculatorConstructor_9(float num1, float num2) {
        this.number1 = num1;
        this.number2 = num2;
    }

    // Methods for performing operations
    float add() {
        return number1 + number2;
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
    // Method to display the results
    void displayResults() {
        float sum = add();
        float product = multiply();
        float quotient = divide();

        System.out.println("Sum.................: " + sum);
        System.out.println("Product.............: " + product);
        System.out.println("Quotient............: " + quotient);
    }


}

// compile tha above program with the below mentioned command
/*
javac -d out .\CalculatorConstructor_9.java
*/
