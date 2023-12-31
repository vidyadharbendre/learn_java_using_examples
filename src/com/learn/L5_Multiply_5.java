/*
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 2nd December, 2023
 *
 * Purpose:
 * This is to implement multiplication of two numbers.
 */

public class L5_Multiply_5 {
    public static void main(String[] args) {
        float result, num1 = 100, num2 = 99;

        result = num1 * num2;

        System.out.println("Result is: " + result);
        System.out.printf("The product of these two numbers %f * %f = %f \n", num1, num2, result);
    }
}

/*
 * Compilation Command:
 * javac -d ../../../out L5_Multiply_5.java
 *
 * Execution Command:
 * java -cp ../../../out L5_Multiply_5
 */

// The output of the above program is
/*
 * Result is: 9900.0
 * The product of these two numbers 100.0 * 99.0 = 9900.0
 */
