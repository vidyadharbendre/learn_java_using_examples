package com.Modules.M1_Overview.S6_06_Control_Statements.C2_02_For_Loop.E1_01_Print;

public class ForLoopPrint {
    public static void main(String[] args) {
        int i;

        for(i=1; i <= 5; i++){
            System.out.println(i);
        }
    }
}

/*
javac -d ../../../../out ForLoopPrint.java
java -cp ../../../../out C4_04_Control_Statements.S2_02_For_Loop.C1_01_Print.ForLoopPrint
 */
// The output of the program is shown as below:
/*
1
2
3
4
5
 */