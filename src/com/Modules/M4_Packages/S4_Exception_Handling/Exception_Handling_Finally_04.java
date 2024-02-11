package com.Modules.M4_Packages.S4_Exception_Handling;

public class Exception_Handling_Finally_04 {
    public static void main(String[] args) {
        int a=99;

        try {
            System.out.println("---1. start---");
//            a = a/0;
            a = 99/10;
            System.out.println("---2. end---");

        }catch (ArithmeticException e1){
            System.out.println("...Arithmetic Exception start...");
            System.out.println("Name of the Exception is : "+e1.getMessage());
            System.out.println("Arithmetic Exception end");
        }catch (Exception e2){
            System.out.println("...Exception stat...");
            System.out.println("Name of the Exception is : "+e2.getMessage());
            System.out.println("...Exception end...");
        }finally {
            System.out.println("---finally block starts---");
            System.out.println("Always executes with or without exception occurring!");
        }
    }
}

/*
---1. start---
...Arithmetic Exception start...
Name of the Exception is : / by zero
Arithmetic Exception end
---finally block starts---
Always executes
 */
