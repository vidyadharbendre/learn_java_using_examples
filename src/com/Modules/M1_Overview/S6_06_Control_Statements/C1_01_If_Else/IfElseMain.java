package com.Modules.M1_Overview.S6_06_Control_Statements.C1_01_If_Else;

import java.util.Scanner;

public class IfElseMain {
    public static void main(String[] args) {
        int num;

        System.out.println("Enter a number");
        Scanner getInputObj;
        getInputObj = new Scanner(System.in);

        num = getInputObj.nextInt();
        System.out.println("The entered number is :"+num);

        if (num > 0){
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}

/*
javac -d ../../../../out IfElseMain.java
java -cp ../../../../out C4_04_Control_Statements.S1_01_If_Else.IfElseMain
 */

// The output of the above program is:
/*
javac -d ../../../../out IfElseMain.java
java -cp ../../../../out com.modules.M1_Overview.S6_06_Control_Statements.S1_01_If_Else.IfElseMain
Enter a number
36
The entered number is :36
Number is positive
_____________________________________________________________________________
java -cp ../../../../out com.modules.M1_Overview.S6_06_Control_Statements.S1_01_If_Else.IfElseMain
Enter a number
-9
The entered number is :-9
Number is negative

 */