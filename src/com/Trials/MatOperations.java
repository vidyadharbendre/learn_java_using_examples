package com.Trials;

public class MatOperations {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int[][] matrixB={
                {9, 8, 7},
                {6, 7, 7},
                {1, 2, 3},
        };

        int rows = matrixA.length;
        int columns = matrixA[rows-1].length;

        int[][] sumTwoMatrix = new int[rows][columns];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sumTwoMatrix[i][j] = matrixB[i][j]+matrixA[i][j];
            }
        }
        displayElements(matrixA);
        System.out.println("-----------");
        displayElements(matrixB);
        System.out.println("-----------");
        displayElements(sumTwoMatrix);
    }

    public static void displayElements(int[][] fmat) {
        int fi, fj;
        for (fi = 0; fi < fmat.length; fi++) {
            for (fj = 0; fj < fmat[fi].length; fj++) {
                System.out.print(fmat[fi][fj]+" ");
            }
            System.out.println();
        }
    }
}

// The output of the above program is shown as below
/*
1 2 3
4 5 6
7 8 9
-----------
9 8 7
6 7 7
1 2 3
-----------
10 10 10
10 12 13
8 10 12
 */