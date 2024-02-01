package lab.program1;

/*
1. Develop a JAVA program to add TWO matrices of suitable order N (The value of N should be read from
command line arguments).

 */
public class MatrixAddition {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single argument N for matrix order.");
            return;
        }

        int N = Integer.parseInt(args[0]); // Reading the matrix order N from command line argument

        int[][] matrixA = generateMatrix(N); // Generating the first matrix
        int[][] matrixB = generateMatrix(N); // Generating the second matrix

        System.out.println("Matrix A:");
        printMatrix(matrixA); // Printing matrix A

        System.out.println("Matrix B:");
        printMatrix(matrixB); // Printing matrix B

        int[][] sumMatrix = addMatrices(matrixA, matrixB); // Adding matrices A and B
        System.out.println("Sum of Matrix A and Matrix B:");
        printMatrix(sumMatrix); // Printing the result matrix (sum)

    }

    // Method to generate a matrix of order N with random values
    private static int[][] generateMatrix(int N) {
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // Filling matrix with random values (0-9)
            }
        }
        return matrix;
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int N = matrixA.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j]; // Adding corresponding elements
            }
        }
        return result;
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


// Compile the above program by executing the following command
/*
javac -d out MatrixAddition.java
 */
// Execute the above program using the following command
/*
java -cp out lab.program1.MatrixAddition 3
 */

// The output of the above program is shown as below
/*
Matrix A:
0 5 0
1 7 2
7 9 4

Matrix B:
0 7 7
2 0 2
9 8 0

Sum of Matrix A and Matrix B:
0 12 7
3 7 4
16 17 4

 */