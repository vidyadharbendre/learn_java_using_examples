public class floatArray {
    public static void main(String[] args) {
        float[] studentMarks = {67, 80, 70, 45, 98};
        int len;
        displayElements(studentMarks);
        len = getlengthArray(studentMarks);
        System.out.println(len);
    }
    public static void displayElements(float[] fstudentMarks){
            for (int fi = 0; fi < fstudentMarks.length; fi++) {
                System.out.println(fstudentMarks[fi]);
            }
    }
    public static int getlengthArray(float[] fstudentMarks){
        return  fstudentMarks.length;
    }

}
