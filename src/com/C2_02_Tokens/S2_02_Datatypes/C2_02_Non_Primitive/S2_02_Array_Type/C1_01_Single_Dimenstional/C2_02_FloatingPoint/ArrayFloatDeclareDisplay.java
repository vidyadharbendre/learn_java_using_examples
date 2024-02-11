package com.C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C2_02_FloatingPoint;

import java.util.Scanner;

public class ArrayFloatDeclareDisplay {
    public static void main(String[] args) {
        int lengthArray;

        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the total number of student marks to be entered:");
        lengthArray = getInput.nextInt();

        System.out.println("The entered length of the array is " + lengthArray);
        float[] studentsMarks = new float[lengthArray];

        for (int i = 0; i < studentsMarks.length; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            studentsMarks[i] = getInput.nextFloat();
        }

        System.out.println("Displaying student marks:");
        displayArrayElements(studentsMarks);
    }

    public static void displayArrayElements(float[] studentsMarks) {
        for (int i = 0; i < studentsMarks.length; i++) {
            System.out.println("Student " + (i + 1) + " marks: " + studentsMarks[i]);
        }
    }
}

// The output of the above program is shown as below
/*
Enter the total number of student marks to be entered:
3
The entered length of the array is 3
Enter marks for student 1:
39
Enter marks for student 2:
56
Enter marks for student 3:
79
Displaying student marks:
Student 1 marks: 39.0
Student 2 marks: 56.0
Student 3 marks: 79.0
 */