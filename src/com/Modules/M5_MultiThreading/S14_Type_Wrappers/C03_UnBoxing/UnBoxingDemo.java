package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C03_UnBoxing;

public class UnBoxingDemo {
    public static void main(String[] args) {
        // Unboxing for Integer
        Integer boxedInt = 10;
        int unboxedInt = boxedInt;
        System.out.println("Unboxing for Integer: " + unboxedInt);

        // Unboxing for Byte
        Byte boxedByte = 20;
        byte unboxedByte = boxedByte;
        System.out.println("Unboxing for Byte: " + unboxedByte);

        // Unboxing for Short
        Short boxedShort = 30;
        short unboxedShort = boxedShort;
        System.out.println("Unboxing for Short: " + unboxedShort);

        // Unboxing for Long
        Long boxedLong = 40L;
        long unboxedLong = boxedLong;
        System.out.println("Unboxing for Long: " + unboxedLong);

        // Unboxing for Float
        Float boxedFloat = 50.5f;
        float unboxedFloat = boxedFloat;
        System.out.println("Unboxing for Float: " + unboxedFloat);

        // Unboxing for Double
        Double boxedDouble = 60.6;
        double unboxedDouble = boxedDouble;
        System.out.println("Unboxing for Double: " + unboxedDouble);

        // Unboxing for Character
        Character boxedChar = 'a';
        char unboxedChar = boxedChar;
        System.out.println("Unboxing for Character: " + unboxedChar);

        // Unboxing for Boolean
        Boolean boxedBoolean = true;
        boolean unboxedBoolean = boxedBoolean;
        System.out.println("Unboxing for Boolean: " + unboxedBoolean);
    }
}

// The output of the above program is shown as below
/*
Unboxing for Integer: 10
Unboxing for Byte: 20
Unboxing for Short: 30
Unboxing for Long: 40
Unboxing for Float: 50.5
Unboxing for Double: 60.6
Unboxing for Character: a
Unboxing for Boolean: true
 */