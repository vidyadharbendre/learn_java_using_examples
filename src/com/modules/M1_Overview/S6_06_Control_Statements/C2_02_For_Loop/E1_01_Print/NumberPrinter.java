package com.modules.M1_Overview.S6_06_Control_Statements.C2_02_For_Loop.E1_01_Print;

public class NumberPrinter {
    public void printNumbers(int start, int end) {
        int i;
        for (i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        NumberPrinter printObj;
        printObj = new NumberPrinter();

        printObj.printNumbers(1, 5);

    }
}

/*
javac -d ../../../../out NumberPrinter.java
java -cp ../../../../out C4_04_Control_Statements.S2_02_For_Loop.C1_01_Print.NumberPrinter
 */

/*
1
2
3
4
5
 */