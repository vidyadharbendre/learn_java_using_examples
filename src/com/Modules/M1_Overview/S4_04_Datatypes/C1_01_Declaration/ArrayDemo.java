package com.Modules.M1_Overview.S4_04_Datatypes.C1_01_Declaration;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int marksStudents[] = {89, 20, 66, 89, 19, 27, 75};

        String marStu = Arrays.toString(marksStudents);

        System.out.println(marStu);

    }

}

// The output of the above program is shown as below
/*
[89, 20, 66, 89, 19, 27, 75]
 */