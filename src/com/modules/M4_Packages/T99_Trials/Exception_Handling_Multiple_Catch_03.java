package com.modules.M4_Packages.T99_Trials;

public class Exception_Handling_Multiple_Catch_03 {
    public static void main(String[] args) {
        int a = 99;
        try {
            System.out.println("1. start");
            a = a/0;
            System.out.println("2. end");
        }catch (ArithmeticException e1){
            System.out.println("Arithmetic Exception Block");
            System.out.println("Name of the Exception: "+e1.getMessage());
        }catch (Exception e2){
            System.out.println("Exception Block");
            System.out.println("Name of the Exception: "+e2.getMessage());
        }

    }
}

//The output of the above program is shown as below
/*
1. start
Arithmetic Exception Block
/ by zero
 */