package com.modules.M1_Overview.S6_06_Control_Statements.C1_01_If_Else;

import java.util.Scanner;

// Interface defining the number check behavior
interface NumberChecker {
    void checkNumber(int num);
}

// Class implementing the NumberChecker interface
class PositiveNumberChecker implements NumberChecker {
    @Override
    public void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is not positive");
        }
    }
}

public class IfElseInheritance {
    public static void main(String[] args) {
        int num;
        Scanner inputNum;
        inputNum = new Scanner(System.in);
        System.out.println("Enter a number");
        num = inputNum.nextInt();

        // Using inheritance to perform number check
        PositiveNumberChecker checkerObj;
        checkerObj = new PositiveNumberChecker();
        checkerObj.checkNumber(num);
    }
}
