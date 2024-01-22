package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S02_UserDefined;

import java.util.Scanner;

public class UserDefinedException_05 {
    public static void main(String[] args) {

        Scanner scannerRefObj;
        scannerRefObj = new Scanner(System.in);
        System.out.println("Enter a number less than 100");
        int number1 = scannerRefObj.nextInt();
        try{
            SampleException.validateInput(number1);
        }catch (InvalidInputException e){
            System.out.println("Caught Exception - entered number is greater than 100");

        }

    }
}

class InvalidInputException extends Exception{
    InvalidInputException(String exceptionText){
        super(exceptionText);
    }
}


class SampleException{
    public static void validateInput(int number) throws InvalidInputException{

        if(number > 99){
            throw new InvalidInputException("Exception");
        }
        System.out.println("Valid Input");
    }


}