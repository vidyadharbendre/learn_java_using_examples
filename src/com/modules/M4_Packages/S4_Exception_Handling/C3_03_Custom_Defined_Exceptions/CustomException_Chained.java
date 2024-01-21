package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Custom_Defined_Exceptions;

public class CustomException_Chained {
    public static void main(String[] args) throws MyExceptionChained {
        int result;
        try{
            result = 5/0;
        }catch (Exception e1){
            throw new MyExceptionChained("Error Processing", e1);
        }
    }
}

class MyExceptionChained extends Exception{
    public MyExceptionChained(String message, Throwable cause) {
        super(message, cause);
    }

}
