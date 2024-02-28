package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C05_AutoBoxingMethods;

public class AutoBoxingMethods_ParseInt_4 {
    public static void main(String[] args) {
        String s = "11";
        int i;
        i = Integer.parseInt(s);
        System.out.println("s - integer value..... : "+i);

        System.out.println("i+11...................: "+(i+11));
        System.out.println("s+11 - string concat...: "+(s+11));
    }
}
// The output of the above program is shown as below
/*
s - integer value..... : 11
i+11...................: 22
s+11 - string concat...: 1111
 */