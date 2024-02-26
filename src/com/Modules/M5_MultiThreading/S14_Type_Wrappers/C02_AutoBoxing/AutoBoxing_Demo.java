package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C02_AutoBoxing;

public class AutoBoxing_Demo {
    public static void main(String[] args) {
        // Auto-boxing for int
        int intVal = 10;
        Integer autoBoxedInt = intVal;
        System.out.println("Auto-boxing for int: " + autoBoxedInt);

        // Auto-boxing for byte
        byte byteVal = 20;
        Byte autoBoxedByte = byteVal;
        System.out.println("Auto-boxing for byte: " + autoBoxedByte);

        // Auto-boxing for short
        short shortVal = 30;
        Short autoBoxedShort = shortVal;
        System.out.println("Auto-boxing for short: " + autoBoxedShort);

        // Auto-boxing for long
        long longVal = 40L;
        Long autoBoxedLong = longVal;
        System.out.println("Auto-boxing for long: " + autoBoxedLong);

        // Auto-boxing for float
        float floatVal = 50.5f;
        Float autoBoxedFloat = floatVal;
        System.out.println("Auto-boxing for float: " + autoBoxedFloat);

        // Auto-boxing for double
        double doubleVal = 60.6;
        Double autoBoxedDouble = doubleVal;
        System.out.println("Auto-boxing for double: " + autoBoxedDouble);

        // Auto-boxing for char
        char charVal = 'a';
        Character autoBoxedChar = charVal;
        System.out.println("Auto-boxing for char: " + autoBoxedChar);

        // Auto-boxing for boolean
        boolean boolVal = true;
        Boolean autoBoxedBoolean = boolVal;
        System.out.println("Auto-boxing for boolean: " + autoBoxedBoolean);
    }
}
// The output of the above program is shown as below
/*
Auto-boxing for int: 10
Auto-boxing for byte: 20
Auto-boxing for short: 30
Auto-boxing for long: 40
Auto-boxing for float: 50.5
Auto-boxing for double: 60.6
Auto-boxing for char: a
Auto-boxing for boolean: true
 */