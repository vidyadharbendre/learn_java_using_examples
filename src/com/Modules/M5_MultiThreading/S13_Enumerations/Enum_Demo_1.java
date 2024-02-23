package com.Modules.M5_MultiThreading.S13_Enumerations;

import java.util.Map;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class Enum_Demo_1 {
    // Define an enumeration for days of the week


    public static void main(String[] args) {
        // Use the enumeration constants
        Day todayRefObj;
        todayRefObj = Day.THURSDAY;
        System.out.println("Today is: " + todayRefObj);
        System.out.println("Indexing order "+ todayRefObj.ordinal());

        todayRefObj = Day.SATURDAY;
        System.out.println("Indexing order is : "+todayRefObj.ordinal());
        System.out.println("---printing all values ---");

        Day[] days;
        days = Day.values();

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }


        for (Day day : days) {
            System.out.println(day);
        }

        System.out.println("---use enhanced for loop---");
        for (Day dd: days){
            System.out.println(dd);
        }

        System.out.println("---print the value and index---");
        for (Day dd1 : days) {
            System.out.println(dd1 + " : " + dd1.ordinal());
        }


    }
}
// The output of the above program is shown as below
/*
Today is: SUNDAY
 */