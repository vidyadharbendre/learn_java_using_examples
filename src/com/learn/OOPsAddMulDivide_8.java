/*
    2nd Program

    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    v1 - 29 November, 2023
    v2 - 02 December, 2023


    Question:
    Demonstration of Memory Allocation in Java for a Simple Calculator Program

    Purpose:
    To explain memory allocation in Java using a simple calculator program.

    Description:
    This program simulates a basic calculator with addition, multiplication, and division operations.

    Memory Allocation:
    - Stack: Stores method invocations, local variables, and references to objects.
    - Heap: Stores objects and their instance variables.

    Stack Memory:
    - Method invocations: Each time a method (e.g., addition, multiplication) is called, it creates
      a stack frame.

    - Local variables: Variables declared within a method are stored here.
      For example:
        - `result`, `operand1`, `operand2` are local variables for calculations.

    Heap Memory:
    - Objects: The `Calculator` object is stored in the heap memory.

    Operations:
    - The methods for addition, subtraction, multiplication, and division are invoked.
    - Each method operation occurs within its respective stack frame.
*/


public class OOPsAddMulDivide_8 {
    public static void main(String[] args) {
        float sum, product, quotient;

        Calculator_7 calculatorObj;
        calculatorObj = new Calculator_7();

        // Setting values to the attributes
        calculatorObj.number1 = 10;
        calculatorObj.number2 = 5;

        // Performing operations
        sum = calculatorObj.add();
        product = calculatorObj.multiply();
        quotient = calculatorObj.divide();

        // Displaying the results
        System.out.println("Sum........: " + sum);
        System.out.println("Product....: " + product);
        System.out.println("Quotient...: " + quotient);
    }
}

// Compile & execute
/*
*
* javac -d out OOPsAddMulDivide_8.java
* java -cp out OOPsAddMulDivide_8
* 
* */


// The output of the above program is shown as below:
/*

Sum........: 15.0
Product....: 50.0
Quotient...: 2.0

 */