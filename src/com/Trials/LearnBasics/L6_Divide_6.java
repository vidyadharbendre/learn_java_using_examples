/*
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 2nd November, 2023
 *
 * Purpose:
 * This program performs division of two numbers and displays the result if the divisor is not zero.
 */

public class L6_Divide_6 {
    public static void main(String[] args) {
        float res, num1 = 10, num2 = 10;

        if (num2 != 0) {
            res = num1 / num2;
            System.out.println("Result is: " + res);
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

/*
 * Compilation Command:
 * javac -d ../../../out L6_Divide_6.java
 *
 * Execution Command:
 * java -cp ../../../out L6_Divide_6
 */

// The output of the above program is
/*
 * Result is: 1.0
 */
