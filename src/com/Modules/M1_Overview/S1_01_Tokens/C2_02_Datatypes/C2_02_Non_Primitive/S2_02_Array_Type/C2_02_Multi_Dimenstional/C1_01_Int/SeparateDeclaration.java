package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C2_02_Multi_Dimenstional.C1_01_Int;

public class SeparateDeclaration {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix [0][0]  = 9;
        matrix [2][2]  = 1;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
    }
}
// The output of the above program is shown as below
/*
9 0 0
0 0 0
0 0 1
 */