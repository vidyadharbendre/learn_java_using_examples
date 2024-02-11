package com.modules.M1_Overview.S6_06_Control_Statements.C2_02_For_Loop.E2_02_Even;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        int i;

        for (i=2; i<=10; i+=2){
            System.out.println(i);
        }
    }
}


/*
javac -d ../../../../out PrintEvenNumbers.java
java -cp ../../../../out C4_04_Control_Statements.S2_02_For_Loop.C2_02_Even.PrintEvenNumbers
 */
