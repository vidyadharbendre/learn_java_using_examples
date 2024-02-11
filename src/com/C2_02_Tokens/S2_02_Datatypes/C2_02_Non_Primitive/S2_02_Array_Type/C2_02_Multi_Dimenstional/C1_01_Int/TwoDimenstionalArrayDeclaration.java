package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C2_02_Multi_Dimenstional.C1_01_Int;

public class TwoDimenstionalArrayDeclaration {
    public static void main(String[] args) {
        int[][] TwoDimMatrix = {
                {1, 2, 3},
                {4},
                {5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < TwoDimMatrix.length; row++) {
            for (int column = 0; column < TwoDimMatrix[row].length; column++) {
                System.out.print(TwoDimMatrix[row][column]+ " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(TwoDimMatrix));
    }

}

// The output of the above program is shown as below
/*
1 2 3
4
5 6
7 8 9
 */
