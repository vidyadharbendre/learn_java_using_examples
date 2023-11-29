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
    - Objects: The `OOPsCalculator` object is stored in the heap memory.

    Operations:
    - The methods for addition, subtraction, multiplication, and division are invoked.
    - Each method operation occurs within its respective stack frame.
*/

public class OOPCalculator {
    public static void main(String[] args) {
        // Creating three instances of CalculatorConstructor with different values
        CalculatorConstructor calcObj1 = new CalculatorConstructor(10, 5);
        CalculatorConstructor calcObj2 = new CalculatorConstructor(20, 8);
        CalculatorConstructor calcObj3 = new CalculatorConstructor(15, 3);

        float sum1 = calcObj1.add();
        float product1 = calcObj1.multiply();
        float quotient1 = calcObj1.divide();

        float sum2 = calcObj2.add();
        float product2 = calcObj2.multiply();
        float quotient2 = calcObj2.divide();

        float sum3 = calcObj3.add();
        float product3 = calcObj3.multiply();
        float quotient3 = calcObj3.divide();

        // Displaying the results for each instance
        System.out.println("Instance 1:");
        System.out.println("Sum..........: " + sum1);
        System.out.println("Product......: " + product1);
        System.out.println("Quotient.....: " + quotient1);

        System.out.println("\nInstance 2:");
        System.out.println("Sum..........: " + sum2);
        System.out.println("Product......: " + product2);
        System.out.println("Quotient.....: " + quotient2);

        System.out.println("\nInstance 3:");
        System.out.println("Sum..........: " + sum3);
        System.out.println("Product......: " + product3);
        System.out.println("Quotient.....: " + quotient3);
    }
}