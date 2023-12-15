/*
Purpose:
This program demonstrates the usage of a constructor and a method to perform a number check, determining if a given number is positive or not.

Description:
- The class IfElseConstructor contains a default constructor and a method called checkNumber.
- The constructor IfElseConstructor() is empty, serving as the default constructor.
- The method checkNumber(int num) takes an integer argument and checks if it's greater than 0.
    - If the number is positive, it prints "Number is Positive".
    - Otherwise, it prints "Number is not Positive".
- In the main method:
    - An object 'obj' of type IfElseConstructor is created using the constructor.
    - The checkNumber method is called on the 'obj' with the value 10, triggering the number check and printing the result.

Explanation:
- The class IfElseConstructor serves as a container for the constructor and the checkNumber method.
- The constructor is used to create an object of the class.
- The checkNumber method performs the number check based on the given input and prints the result.
- In the main method, an object 'obj' is instantiated, and the checkNumber method is called on this object with the value 10 to demonstrate the number check functionality.
*/
package C4_04_Control_Statements.S1_01_If_Else;

import java.util.Scanner;

public class IfElseConstructor {
    public IfElseConstructor() {
        // Default constructor
    }

    public void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is not Positive");
        }
    }

    public static void main(String[] args) {
        int num;

        IfElseConstructor objCon;
        objCon = new IfElseConstructor();

        Scanner getInputObj;
        getInputObj = new Scanner(System.in);

        System.out.println("Enter a number");
        num = getInputObj.nextInt();

        objCon.checkNumber(num); // Calling the checkNumber method with the value
    }
}

/*
## How to Use
        1. **Compilation**: Compile the program using the following command:
        ```bash
        javac -d ../../../../out IfElseConstructor.java
        ```

        2. **Execution**: Execute the compiled program with the following command:
        ```bash
        java -cp ../../../../out C4_04_Control_Statements.S1_01_If_Else.IfElseConstructor
        ```
*/

// The output of the aboe program is
/*

(base) vidyadharbendre@Vidyadhars-MacBook-Pro S1_01_If_Else % javac -d ../../../../out IfElseConstructor.java
(base) vidyadharbendre@Vidyadhars-MacBook-Pro S1_01_If_Else % java -cp ../../../../out C4_04_Control_Statements.S1_01_If_Else.IfElseConstructor
Number is Positive

*/