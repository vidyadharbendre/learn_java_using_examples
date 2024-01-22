package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S02_UserDefined;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UDE_Date_07 {
    public static void main(String[] args) {
        Scanner scannerRefObj = new Scanner(System.in);

        System.out.println("Enter date in the format - dd/MM/yyyy : ");
        String inputDt = scannerRefObj.nextLine();

        try {
            SimpleDateFormatExceptionNew.convertDateFormat(inputDt);
        } catch (InvalidDateFormatExceptionNew e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}

class SimpleDateFormatExceptionNew {
    public static void convertDateFormat(String inputDate) throws ParseException, InvalidDateFormatExceptionNew {

        SimpleDateFormat sdfRefObj;
        sdfRefObj = new SimpleDateFormat("dd/MM/yyyy");

        // Check if the input matches the expected format
        if (!isValidFormat(inputDate, sdfRefObj)) {
            throw new InvalidDateFormatExceptionNew("Invalid date format. Please enter in dd/MM/yyyy format.");
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
        sdf.setLenient(false); // Disable lenient mode to enforce strict parsing

        try {
            Date parsedDate = sdf.parse(inputDate);

            // Perform additional validation for day and month ranges
            Calendar cal = Calendar.getInstance();
            cal.setTime(parsedDate);
            int inputDay = cal.get(Calendar.DAY_OF_MONTH);
            int inputMonth = cal.get(Calendar.MONTH) + 1; // Month is zero-based, so add 1

            return inputDay >= 1 && inputDay <= 31 && inputMonth >= 1 && inputMonth <= 12;
        } catch (ParseException e) {
            return false;
        }
    }
}

class InvalidDateFormatExceptionNew extends Exception {
    public InvalidDateFormatExceptionNew(String message) {
        super(message);
    }
}
