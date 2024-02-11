package Lessons.ModelQuestionsAnswers.Set2.Two;

public class MatrixExample {
    public static void main(String[] args) {
        // Initializing a 2D matrix with predefined elements
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Displaying the initialized matrix using the static method
        System.out.println("Initialized Matrix:");
        displayMatrix(matrix);
    }
    // Static method to display matrix elements
    public static void displayMatrix(int[][] matrix) {
        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// The output of the above program is shown as below:
/*
Initialized Matrix:
1 2 3
4 5 6
7 8 9
 */