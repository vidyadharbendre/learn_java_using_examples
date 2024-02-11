package com.Modules.M4_Packages.S4_Exception_Handling.C1_01_Fundamentals;

public class Basic_Example_Exception {
    public static void main(String[] args) {
        try {
            // code may raise an exception
            int result = 9/0;
        }catch (Exception e){
            //
            System.out.println(e.getMessage());
        }
    }
}