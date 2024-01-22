package com.modules.M4_Packages.S4_Exception_Handling.C05_Exception_Handling_Methods.S04_04_Throw;

public class ThrowExample2 {
    public static void main(String[] args) {
        average();
    }

    static void average(){
        try{
            throw new ArithmeticException("Demonstrating Throw");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

// The output of the above program is shown as below
/*
Demonstrating Throw
 */


