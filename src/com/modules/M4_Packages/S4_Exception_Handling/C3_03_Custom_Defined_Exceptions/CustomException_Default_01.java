package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Custom_Defined_Exceptions;

public class CustomException_Default_01 {
    public static void main(String[] args) {

        try {
            throw new MyException();
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    public MyException() {
        super("Default - My Custom Exception !");
    }
}

//The output of the above program is shown as below
/*
Default - My Custom Exception !
 */
