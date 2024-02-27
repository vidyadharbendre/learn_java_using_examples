package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C05_AutoBoxingMethods;


/*
compare (int x, int y)
0 - if x =y;
-1 - if x < y;
1 - if x > y;

 */

public class AutoBoxingMethods_Compare_2 {
    public static void main(String[] args) {
        int x = 11;
        int y = 22;

        int z = Integer.compare(x, y);
        System.out.println(z);

    }
}
// The output of the above program is shown as below

// -1
