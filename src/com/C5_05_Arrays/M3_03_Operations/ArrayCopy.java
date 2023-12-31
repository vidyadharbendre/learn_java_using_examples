package C5_05_Arrays.M3_03_Operations;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int marksStudents[] = {50, 33, 14, 67, 90};
        int destMarks[] = {0};

        String marksStudentsObj = Arrays.toString(marksStudents);
        System.out.println(marksStudentsObj);
        String destMarksObj1 = Arrays.toString(destMarks);
        System.out.println(destMarksObj1);
        destMarks = Arrays.copyOf(marksStudents, 5);
        String destMarksObj = Arrays.toString(destMarks);
        System.out.println(destMarksObj);


    }
}
