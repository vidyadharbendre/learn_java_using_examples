/*
 *
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 29 November, 2023
 *
 * Question:
 * Demonstration of Memory Allocation in Java for a Simple Calculator Program
 *
 * Purpose:
 * To explain memory allocation in Java using a simple calculator program.
 *
 * Description:
 * This program simulates a basic calculator with addition, multiplication, and division operations.
 *
 * Memory Allocation:
 * - Stack: Stores method invocations, local variables, and references to objects.
 * - Heap: Stores objects and their instance variables.
 *
 * Stack Memory:
 * - Method invocations: Each time a method (e.g., addition, multiplication) is called, it creates
 *   a stack frame.
 * - Local variables: Variables declared within a method are stored here.
 *   For example:
 *     - `result`, `operand1`, `operand2` are local variables for calculations.
 *
 * Heap Memory:
 * - Objects: The `OOPsCalculator` object is stored in the heap memory.
 *
 * Operations:
 * - The methods for addition, subtraction, multiplication, and division are invoked.
 * - Each method operation occurs within its respective stack frame.
 */

public class L10_OOPCalculator_10 {
    public static void main(String[] args) {

        // Stack memory allocation for reference variables
        L9_CalculatorConstructor_9 calcObj1;
        L9_CalculatorConstructor_9 calcObj2;
        L9_CalculatorConstructor_9 calcObj3;

        // Heap memory allocation for objects
        // Creating 'calcObj1' on the heap with values 10 and 5
        calcObj1 = new L9_CalculatorConstructor_9(10, 5);
        // Creating 'calcObj2' on the heap with values 20 and 8
        calcObj2 = new L9_CalculatorConstructor_9(20, 8);
        // Creating 'calcObj3' on the heap with values 15 and 3
        calcObj3 = new L9_CalculatorConstructor_9(15, 3);

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

// Compile the above program with the following command
/*
 * javac -d ../../../out L10_OOPCalculator_10.java
 */
// Run the program with the following command
/*
java -cp ../../../out L10_OOPCalculator_10
*/

// The output of the above program is shown as below:
/*

Instance 1:
Sum..........: 15.0
Product......: 50.0
Quotient.....: 2.0

Instance 2:
Sum..........: 28.0
Product......: 160.0
Quotient.....: 2.5

Instance 3:
Sum..........: 18.0
Product......: 45.0
Quotient.....: 5.0

 */

/*
javac -d ../../../out OOPCalculator_10.java
 */
