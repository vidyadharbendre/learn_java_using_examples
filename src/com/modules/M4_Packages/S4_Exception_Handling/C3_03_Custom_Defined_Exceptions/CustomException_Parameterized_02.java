package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Custom_Defined_Exceptions;

public class CustomException_Parameterized_02 {
    public static void main(String[] args) {
        try{
            throw new MyParameterizedException("parameterized Exception");
        }catch (MyParameterizedException e1){
            System.out.println(e1.getMessage());
        }
    }
}
class MyParameterizedException extends Exception{
    public MyParameterizedException(String msg) {
        super(msg);
    }
}

