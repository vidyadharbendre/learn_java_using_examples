package com.Modules.M5_MultiThreading.S13_Enumerations;

import java.util.Map;

public class Enum_Demo_1 {
    // Define an enumeration for days of the week
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

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

        System.out.println("---use enhanced for loop---");
        for (Day dd: days){
            System.out.println(dd);
        }

        System.out.println("---print the value and index---");
        for (Day day : days) {
            System.out.println(day + " : " + day.ordinal());
        }

    }
}
// The output of the above program is shown as below
/*
Today is: SUNDAY
 */