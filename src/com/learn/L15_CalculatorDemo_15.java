/*
Author: Vidyadhar Bendre
Email: vidyadhar.bendre@gmail.com
Date: 2nd November, 2023
Purpose: This program showcases the use of two classes - Calculator and CalculaterOOPsPublicPrivate,
demonstrating different access modifiers and method functionalities in object-oriented programming.

Description:
This program includes two classes, L15_CalculatorDemo_15 and L14_CalculaterOOPsPublicPrivate_14.
The L15_CalculatorDemo_15 class illustrates the usage of methods from the L7_Calculator_7 class and the L14_CalculaterOOPsPublicPrivate_14 class to perform arithmetic operations.

Declaration: This program comprises two classes - L15_CalculatorDemo_15 and
L14_CalculaterOOPsPublicPrivate_14.

*/

// 4th Program
public class L15_CalculatorDemo_15 {
    public static void main(String[] args) {
        // Creating an object of the original Calculator class

        // Allocating reference 'calc' on the stack
        L7_Calculator_7 calc;
        // Allocating a 'Calculator' object on the heap and assigning its reference to 'calc'
        calc = new L7_Calculator_7();

        // Setting values for number1 and number2
        calc.number1 = 10;
        calc.number2 = 5;

        // Performing operations and displaying results
        System.out.println("Addition..........................: " + calc.add());
        System.out.println("Multiplication....................: " + calc.multiply());
        System.out.println("Division..........................: " + calc.divide());

        // Creating an object of the CalculaterPublicPrivate class

        // Allocating reference 'calcOOPs' on the stack
        L14_CalculaterOOPsPublicPrivate_14 calcOOPs;

        // Allocating a 'Calculator' object on the heap and assigning its reference to 'calcOOPs'
        calcOOPs = new L14_CalculaterOOPsPublicPrivate_14();

        // Setting values for number1 and number2 using public methods
        calcOOPs.setNumber1(10);
        calcOOPs.setNumber2(5);

        // Performing operations and displaying results
        System.out.println("Displaying the sum, product, and quotient in the main program\n");
        System.out.println("Addition (Public/Private).........: " + calcOOPs.add());
        System.out.println("Multiplication (Public/Private)...: " + calcOOPs.multiply());
        System.out.println("Division (Public/Private).........: " + calcOOPs.divide());

        calcOOPs.setNumber1(10);
        calcOOPs.setNumber2(5);
        calcOOPs.displayResults();

        calcOOPs.setNumber1(90);
        calcOOPs.setNumber2(10);
        calcOOPs.displayResults();
    }
}

/*
The output of the above program is shown below:

Addition..........................: 20.0
Multiplication....................: 50.0
Division..........................: 2.0
Displaying the sum, product, and quotient in the main program

Addition (Public/Private).........: 15.0
Multiplication (Public/Private)...: 50.0
Division (Public/Private).........: 2.0
Printing the below as defined in one of the methods
Addition (Public/Private).........: 15.0
Multiplication (Public/Private)...: 50.0
Division (Public/Private).........: 2.0
Printing the below as defined in one of the methods
Addition (Public/Private).........: 100.0
Multiplication (Public/Private)...: 900.0
Division (Public/Private).........: 9.0
*/

/*
javac -d ../../../out L15_CalculatorDemo_15
*/
