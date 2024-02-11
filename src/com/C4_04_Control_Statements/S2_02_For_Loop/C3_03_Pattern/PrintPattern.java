package com.C4_04_Control_Statements.S2_02_For_Loop.C3_03_Pattern;

public class PrintPattern {
    public static void main(String[] args) {
        int i, j;

        for(i=1; i <= 4; i++){
            for(j=1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
javac -d ../../../../out PrintPattern.java
java -cp ../../../../out C4_04_Control_Statements.S2_02_For_Loop.C3_03_Pattern.PrintPattern
 */

// The output of the above program is shown as below:
/*
 *
 * *
 * * *
 * * * *
 */
