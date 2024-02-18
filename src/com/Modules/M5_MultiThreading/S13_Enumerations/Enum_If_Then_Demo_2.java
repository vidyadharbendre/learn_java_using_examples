package com.Modules.M5_MultiThreading.S13_Enumerations;


public class Enum_If_Then_Demo_2 {

    enum WeekDays{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }


    public static void main(String[] args) {
        for(WeekDays days : WeekDays.values()){
            weekend(days);
        }
    }

    private static void weekend(WeekDays days){
        if(days.equals(WeekDays.Sunday)){
            System.out.println(days + " is a Holiday");
        }
        else {
            System.out.println(days + " is a Weekday");
        }
    }
}

// The output of the above program is shown as below
/*
Sunday is a Holiday
Monday is a Weekday
Tuesday is a Weekday
Wednesday is a Weekday
Thursday is a Weekday
Friday is a Weekday
Saturday is a Weekday
 */