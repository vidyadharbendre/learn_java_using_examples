package C2_02_Tokens.S2_02_Datatypes.C2_02_Non_Primitive.S2_02_Array_Type.C1_01_Single_Dimenstional.C2_02_FloatingPoint;

public class ArrayFloatDeclarAssign {
    public static void main(String[] args) {
        int i, lengthArray, j;
        float[] studentsMarks = {98, 20, 56, 38, 90, 67, 57, 93};
        float totalMarks=0, averageMarks;

        totalMarks = calculateAverage(studentsMarks);
        System.out.println("total calculated "+totalMarks);
        displayArrayElements(studentsMarks);
    }

    public static float calculateAverage(float[] fstudentsMarks){
        int fj;
        float ftotalMarks=0;
        for (fj = 0; fj < fstudentsMarks.length; fj++) {
            ftotalMarks += fstudentsMarks[fj];
        }
        System.out.println("Total marks within static method "+ftotalMarks);
        return ftotalMarks/fstudentsMarks.length;
    }
    public static void displayArrayElements(float[] fstudentsMarks){
        int fi;
        for (fi = 0; fi < fstudentsMarks.length; fi++) {
            System.out.println(fstudentsMarks[fi]);
        }
    }
}
