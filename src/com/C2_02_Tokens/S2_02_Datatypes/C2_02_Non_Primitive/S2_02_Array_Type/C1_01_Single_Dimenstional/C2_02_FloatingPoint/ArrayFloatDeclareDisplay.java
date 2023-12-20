package C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C2_02_FloatingPoint;

import java.util.Scanner;

public class ArrayFloatDeclareDisplay {
    public static void main(String[] args) {
        int i, lengthArray;
        float[] studentsMarks;

        Scanner getInput;
        getInput = new Scanner(System.in);

        System.out.println("Enter the total number of students marks to be entered");
        lengthArray = getInput.nextInt();

        System.out.println("The entered length of an array is "+lengthArray);
        studentsMarks = new float[lengthArray];



        displayArrayElements(studentsMarks);
    }
    public static void displayArrayElements(float[] fstudentsMarks){
        int fi;
        for (fi = 0; fi < fstudentsMarks.length; fi++) {
            System.out.println(fstudentsMarks[fi]);
        }
    }
}
