package C5_05_Arrays.M3_03_Operations;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int marksStudents[] = {50, 77, 43, 25, 61, 88, 93, 42};
        System.out.println("Displaying the given Array");
        String marksStu = Arrays.toString(marksStudents);
        System.out.println(marksStu);

        System.out.println("Displaying the sorted Array");
        Arrays.sort(marksStudents);
        String marksStuSort = Arrays.toString(marksStudents);
        System.out.println(marksStuSort);

    }
}
