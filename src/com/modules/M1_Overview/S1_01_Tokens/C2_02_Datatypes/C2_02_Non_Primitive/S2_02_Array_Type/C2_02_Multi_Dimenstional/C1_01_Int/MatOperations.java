package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C2_02_Multi_Dimenstional.C1_01_Int;

public class MatOperations {
    public static void main(String[] args) {
        int[][] matrix_A = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };

        int[][] matrix_B = {
                {8, 7, 6},
                {5, 4, 3},
                {2, 3, 1}
        };

        for (int[] ints : matrix_A) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("Call static method to display elements of matrix A");
        displayElements(matrix_A);
        System.out.println("Display elements of matrix B by calling static method");
        displayElements(matrix_B);
        System.out.println("Sum Of Two MAtrix");
        int[][] sum = addElementsMatrix(matrix_A, matrix_B);
        displayElements(sum);
        System.out.println("Difference Of Two MAtrix");
        int[][] fdifference = subtractMatrices(matrix_A, matrix_B);
        displayElements(fdifference);
        System.out.println("Product Of Two Matrices");
        int[][] fproduct = multiplyMatrices(matrix_A, matrix_B);
        displayElements(fproduct);
    }

    public static void displayElements(int[][] fmatrix) {
        for (int frow = 0; frow < fmatrix.length; frow++) {
            for (int fcolumn = 0; fcolumn < fmatrix[frow].length; fcolumn++) {
                System.out.print(fmatrix[frow][fcolumn] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addElementsMatrix(int[][] fmatrixA, int[][] fmatrixB){
        int rows = fmatrixA.length;
        int columns = fmatrixA[rows-1].length;
        int[][] fsumOfTwoMatrix = new int[rows][columns];

        for (int i = 0; i < fmatrixA.length; i++) {
            for (int j = 0; j < fmatrixA[i].length; j++) {
                fsumOfTwoMatrix[i][j] = fmatrixA[i][j] + fmatrixB[i][j];
            }
        }
        return fsumOfTwoMatrix;
    }


    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] fmatrixA, int[][] fmatrixB) {
        int rows = fmatrixA.length;
        int columns = fmatrixA[rows-1].length;
        int[][] difference = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < fmatrixA[i].length; j++) { // Using matrixA[i].length for columns in each row
                difference[i][j] = fmatrixA[i][j] - fmatrixB[i][j];
            }
        }
        return difference;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[rowsA-1].length;
        int columnsB = matrixB[rowsA-1].length;
        int[][] product = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < matrixA[i].length; k++) { // Using matrixA[i].length for columns in each row
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return product;
    }

}

// The output of the above program is shown as below
/*
1 2 3
3 4 5
6 7 8
Call static method to display elements of matrix A
1 2 3
3 4 5
6 7 8
Display elements of matrix B by calling static method
8 7 6
5 4 3
2 3 1
Sum Of Two MAtrix
9 9 9
8 8 8
8 10 9
Difference Of Two MAtrix
-7 -5 -3
-2 0 2
4 4 7
Product Of Two Matrices
24 24 15
54 52 35
99 94 65
 */