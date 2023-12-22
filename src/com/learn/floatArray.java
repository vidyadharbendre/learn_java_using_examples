public class floatArray {
    public static void main(String[] args) {
        float[] studentMarks = {67, 80, 70, 45, 98};
        int len;
        float avg;
        displayElements(studentMarks);
        len = getlengthArray(studentMarks);
        System.out.println(len);

        avg = averageElements(studentMarks);
        System.out.println("Average "+avg);

    }
    public static float averageElements(float[] fstudentMarks){
        int fi;
        float ftotal=0.0f;
        for (fi = 0; fi < fstudentMarks.length; fi++) {
            ftotal += fstudentMarks[fi];
        }
        return ftotal / fstudentMarks.length;
    }
    public static void displayElements(float[] fstudentMarks){
        int fi;
        for (fi = 0; fi < fstudentMarks.length; fi++) {
            System.out.println(fstudentMarks[fi]);
        }
    }
    public static int getlengthArray(float[] fstudentMarks){
        return  fstudentMarks.length;
    }

}
