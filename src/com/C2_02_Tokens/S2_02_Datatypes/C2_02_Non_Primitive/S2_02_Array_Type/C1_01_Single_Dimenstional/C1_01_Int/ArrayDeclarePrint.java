package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C1_01_Int;
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

// The output of the above program is shown as below
/*
0 th element is 5
1 th element is 8
2 th element is 9
3 th element is 38
4 th element is 11
5 th element is 69
6 th element is 89
7 th element is 99
 */