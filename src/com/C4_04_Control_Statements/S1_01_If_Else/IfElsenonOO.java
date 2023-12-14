/*
Purpose:
The purpose of this program is to demonstrate the use of static methods to perform a number check and determine if a given number is positive or not without using object-oriented concepts.

Description:
- The class IfElsenonOO contains only static methods and no object instantiation.
- The method checkNumber(int num) is a static method that takes an integer argument and checks if it's greater than 0.
    - If the number is positive, it prints "Number is positive".
    - Otherwise, it prints "Number is not positive".
- In the main method:
    - The static checkNumber method is directly called with the value 10 to perform the number check and display the result.

Explanation:
- The class IfElsenonOO is designed to showcase the functionality of static methods in Java.
- Since all methods are static, there's no need to create an object of the class to access the checkNumber method.
- The checkNumber method performs the number check based on the given input and prints the result.
- In the main method, the static checkNumber method is invoked directly with the value 10 to demonstrate the number check functionality without the need for object instantiation.
*/
package C4_04_Control_Statements.S1_01_If_Else;

public class IfElsenonOO {
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }
    }

    public static void main(String[] args) {
        checkNumber(10);
    }
}

/*
        1. **Compilation**: Compile the program using the following command:
                ```bash
                javac -d ../../../../out IfElsenonOO.java
                ```

                2. **Execution**: Execute the compiled program with the following command:
                ```bash
                java -cp ../../../../out C4_04_Control_Statements.S1_01_If_Else.IfElsenonOO
                ```
*/

// The output of the above program is :
/*
* Number is positive

 *
*
*
* */