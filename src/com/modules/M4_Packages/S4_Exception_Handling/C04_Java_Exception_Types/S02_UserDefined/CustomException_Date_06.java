package com.modules.M4_Packages.S4_Exception_Handling.C04_Java_Exception_Types.S02_UserDefined;

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

        SimpleDateFormatException.convertDateFormat(inputDt);

    }
}

class SimpleDateFormatException{
    public static void convertDateFormat(String inputDate) throws ParseException {

        try{
            SimpleDateFormat sdfRefObj;
            sdfRefObj = new SimpleDateFormat("dd/mm/yyyy");

            Date dateRefObj;
            dateRefObj = sdfRefObj.parse(inputDate);

            SimpleDateFormat outputRefObj;
            outputRefObj = new SimpleDateFormat("yyyy-MM-dd");

            String outputDateRefObj;
            outputDateRefObj = outputRefObj.format(dateRefObj);

            System.out.println("After changing the format to yyyy-MM-dd : "+outputDateRefObj);
        }catch (ParseException e){
            System.out.println("Some error : "+e.getMessage());
        }
    }
}

// The output of the above program is shown as below:
/*
Enter date in the format - dd/mm/yyyy :
31/01/2024
After changing the format to yyyy-MM-dd : 2024-01-31
 */