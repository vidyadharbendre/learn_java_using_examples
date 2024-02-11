package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S02_UserDefined;

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

