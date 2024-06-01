package com.Modules.M1_Overview.S6_06_Control_Statements.C2_02_For_Loop.E3_03_Pattern;

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                // print displays the text without adding a new line
                System.out.print(j + " ");
            }
            System.out.println(""); // println displays the text along with a new line
        }
    }
}