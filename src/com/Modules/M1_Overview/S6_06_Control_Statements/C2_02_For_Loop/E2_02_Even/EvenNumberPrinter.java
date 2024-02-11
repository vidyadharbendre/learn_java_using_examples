package com.Modules.M1_Overview.S6_06_Control_Statements.C2_02_For_Loop.E2_02_Even;

public class EvenNumberPrinter {
    public void printNumbers(int start, int end){
        int i;
        for(i=start; i <= end; i+=2){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        EvenNumberPrinter prtEvenObj;
        prtEvenObj = new EvenNumberPrinter();

        prtEvenObj.printNumbers(2, 8);
    }
}


/*
javac -d ../../../../out EvenNumberPrinter.java
java -cp ../../../../out C4_04_Control_Statements.S2_02_For_Loop.C2_02_Even.EvenNumberPrinter
 */