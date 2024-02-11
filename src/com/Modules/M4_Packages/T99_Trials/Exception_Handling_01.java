package com.Modules.M4_Packages.T99_Trials;

public class Exception_Handling_01 {
    public static void main(String[] args) {
        System.out.println("Printing");
        int a = 5;
        a = a / 0;
    }
}


/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.modules.M4_Packages.T99_Trials.Exception_Handling_01.main(Exception_Handling_01.java:7)
 */