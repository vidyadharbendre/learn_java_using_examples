/*
    Author:
    Vidyadhar Bendre

    Email:
    vidyadhar.bendre@gmail.com

    Date:
    29 November, 2023

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

public class OOPsAddMulDivide {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Setting values to the attributes
        calculator.number1 = 10;
        calculator.number2 = 5;

        // Performing operations
        float sum = calculator.add();
        float product = calculator.multiply();
        float quotient = calculator.divide();

        // Displaying the results
        System.out.println("Sum........: " + sum);
        System.out.println("Product....: " + product);
        System.out.println("Quotient...: " + quotient);
    }
}

// The output of the above program is shown as below:
/*

Sum........: 15.0
Product....: 50.0
Quotient...: 2.0

 */