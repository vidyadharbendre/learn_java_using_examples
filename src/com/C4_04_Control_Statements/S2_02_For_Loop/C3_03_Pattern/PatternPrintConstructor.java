package com.C4_04_Control_Statements.S2_02_For_Loop.C3_03_Pattern;

public class PatternPrintConstructor {
    private int rows;

    public PatternPrintConstructor(int initialRows) {
        this.rows = initialRows;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int newRows) {
        this.rows = newRows;
    }

    public void printPattern() {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternPrintConstructor patternPrinterObj;
        patternPrinterObj = new PatternPrintConstructor(4);
        patternPrinterObj.printPattern();

        // Changing rows using the setter
        patternPrinterObj.setRows(6);
        patternPrinterObj.printPattern();
    }
}

// The output of the above program is shown as below
/*
 *
 * *
 * * *
 * * * *
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */