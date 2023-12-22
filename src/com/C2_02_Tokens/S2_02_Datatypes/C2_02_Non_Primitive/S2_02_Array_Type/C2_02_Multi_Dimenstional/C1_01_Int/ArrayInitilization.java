package C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C2_02_Multi_Dimenstional.C1_01_Int;

public class ArrayInitilization {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6},
        };

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]+ " ");
            }
            System.out.println();

        }
    }


}
