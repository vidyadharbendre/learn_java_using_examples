package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C1_01_Int;
public class ArrayDeclareStaticDisplay {
    public static void main(String[] args) {

//      int[] arrayInt;
//      arrayInt = new int[7];

        int[] arrayInt = {5, 8, 9, 38, 11, 69, 89};

        displayElements(arrayInt);
    }
    public static void displayElements(int[] farrayInt){
        int fi;
        for (fi = 0; fi < farrayInt.length; fi++) {
            System.out.println(fi+" th element is "+farrayInt[fi]);
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
 */