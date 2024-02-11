package com.C4_04_Control_Statements.S2_02_For_Loop.C3_03_Pattern;

public class PatternPrint {
    public void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternPrint patternPrintObj;
        patternPrintObj = new PatternPrint();

        patternPrintObj.printPattern(4);

    }
}

// The output of the above program is shown as below
/*
 *
 * *
 * * *
 * * * *
 */
