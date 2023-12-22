package C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C2_02_Multi_Dimenstional.C1_01_Int;

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
