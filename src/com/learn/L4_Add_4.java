/*
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Purpose:
 * This is to add two numbers and display the sum of these two numbers.
 */

public class L4_Add_4 {
    public static void main(String[] args) {
        int a = 10, b = 20, sum;

        sum = a + b;
        System.out.println("Sum " + sum);
        System.out.printf("The sum of %d + %d = %d\n", a, b, sum);
    }
}

/*
 * Compilation Command:
 * javac -d ../../../out L4_Add_4.java
 *
 * Execution Command:
 * java -cp ../../../out L4_Add_4
 */

// The output of the above program is
/*
 * Sum 30
 * The sum of 10 + 20 = 30
 */
