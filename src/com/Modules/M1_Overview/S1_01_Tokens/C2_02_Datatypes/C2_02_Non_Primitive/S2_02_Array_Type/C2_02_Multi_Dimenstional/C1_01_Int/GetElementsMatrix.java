package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C2_02_Multi_Dimenstional.C1_01_Int;

import java.util.Scanner;
public class GetElementsMatrix {
    public static void main(String[] args) {
        int[][] matrix_A = getMatrixFromUser("A");
        int[][] matrix_B = getMatrixFromUser("B");

        System.out.println("\nMatrix A:");
        displayElements(matrix_A);

        System.out.println("\nMatrix B:");
        displayElements(matrix_B);

        // Rest of your code for matrix operations
    }

    public static int[][] getMatrixFromUser(String name) {
        Scanner scannerObj;
        scannerObj = new Scanner(System.in);

        System.out.println("Enter the number of rows for Matrix " + name + ":");
        int rows = scannerObj.nextInt();

        System.out.println("Enter the number of columns for Matrix " + name + ":");
        int columns = scannerObj.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements for Matrix " + name + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scannerObj.nextInt();
            }
        }
        return matrix;
    }

    public static void displayElements(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Other matrix operation methods can be added here
}

// The output of the above program is shown as below
/*
Enter the number of rows for Matrix A:
3
Enter the number of columns for Matrix A:
3
Enter elements for Matrix A:
Enter element at position (0, 0): 1
Enter element at position (0, 1): 2
Enter element at position (0, 2): 3
Enter element at position (1, 0): 4
Enter element at position (1, 1): 5
Enter element at position (1, 2): 6
Enter element at position (2, 0): 7
Enter element at position (2, 1): 8
Enter element at position (2, 2): 9
Enter the number of rows for Matrix B:
2
Enter the number of columns for Matrix B:
2
Enter elements for Matrix B:
Enter element at position (0, 0): 4
Enter element at position (0, 1): 3
Enter element at position (1, 0): 2
Enter element at position (1, 1): 1

Matrix A:
1 2 3
4 5 6
7 8 9

Matrix B:
4 3
2 1
 */