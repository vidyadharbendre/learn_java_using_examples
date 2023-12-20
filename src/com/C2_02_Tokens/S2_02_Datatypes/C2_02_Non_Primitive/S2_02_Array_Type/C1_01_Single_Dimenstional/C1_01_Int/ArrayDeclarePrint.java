package C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C1_01_Int;
public class ArrayDeclarePrint {
    public static void main(String[] args) {

//      int[] arrayInt;
//      arrayInt = new int[7];

        int[] arrayInt = {5, 8, 9, 38, 11, 69, 89, 99};
        int i;
        for (i = 0; i < arrayInt.length; i++) {
            System.out.println(i+" th element is "+arrayInt[i]);
        }
    }
}
