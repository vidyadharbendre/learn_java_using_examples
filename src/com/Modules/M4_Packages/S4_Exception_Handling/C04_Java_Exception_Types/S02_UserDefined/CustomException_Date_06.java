package com.Modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S02_UserDefined;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomException_Date_06 {
    public static void main(String[] args) throws ParseException {

        Scanner scannerRefObj;
        scannerRefObj = new Scanner(System.in);

        System.out.println("Enter date in the format - dd/mm/yyyy : ");
        String inputDt = scannerRefObj.nextLine();

        try {
            SimpleDateFormatExceptionNew.convertDateFormat(inputDt);
        } catch (InvalidDateFormatExceptionNew e) {
            System.out.println("Invalid date format: " + e.getMessage());
        }
    }
}

class SimpleDateFormatException {
    public static void convertDateFormat(String inputDate) throws ParseException, InvalidDateFormatExceptionNew {

        SimpleDateFormat sdfRefObj;
        sdfRefObj = new SimpleDateFormat("dd/MM/yyyy"); // Corrected the format to "dd/MM/yyyy"

        // Check if the input matches the expected format
        if (!isValidFormat(inputDate, sdfRefObj)) {
            throw new InvalidDateFormatExceptionNew("Invalid date format. Please enter in dd/mm/yyyy format.");
        }

        Date dateRefObj;
        dateRefObj = sdfRefObj.parse(inputDate);

        SimpleDateFormat outputRefObj;
        outputRefObj = new SimpleDateFormat("yyyy-MM-dd");

        String outputDateRefObj;
        outputDateRefObj = outputRefObj.format(dateRefObj);

        System.out.println("After changing the format to yyyy-MM-dd : " + outputDateRefObj);
    }

    private static boolean isValidFormat(String inputDate, SimpleDateFormat sdf) {
        try {
            sdf.parse(inputDate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}

class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}

