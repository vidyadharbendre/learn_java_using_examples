package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C04_AutoUnBoxing;

public class AutoUnBoxingDemo {
    public static void main(String[] args) {
        // Auto-unboxing for Integer
        Integer boxedInt = 10;
        int unboxedInt = boxedInt; // Auto-unboxing
        System.out.println("Auto-unboxing for Integer: " + unboxedInt);

        // Auto-unboxing for Byte
        Byte boxedByte = 20;
        byte unboxedByte = boxedByte; // Auto-unboxing
        System.out.println("Auto-unboxing for Byte: " + unboxedByte);

        // Auto-unboxing for Short
        Short boxedShort = 30;
        short unboxedShort = boxedShort; // Auto-unboxing
        System.out.println("Auto-unboxing for Short: " + unboxedShort);

        // Auto-unboxing for Long
        Long boxedLong = 40L;
        long unboxedLong = boxedLong; // Auto-unboxing
        System.out.println("Auto-unboxing for Long: " + unboxedLong);

        // Auto-unboxing for Float
        Float boxedFloat = 50.5f;
        float unboxedFloat = boxedFloat; // Auto-unboxing
        System.out.println("Auto-unboxing for Float: " + unboxedFloat);

        // Auto-unboxing for Double
        Double boxedDouble = 60.6;
        double unboxedDouble = boxedDouble; // Auto-unboxing
        System.out.println("Auto-unboxing for Double: " + unboxedDouble);

        // Auto-unboxing for Character
        Character boxedChar = 'a';
        char unboxedChar = boxedChar; // Auto-unboxing
        System.out.println("Auto-unboxing for Character: " + unboxedChar);

        // Auto-unboxing for Boolean
        Boolean boxedBoolean = true;
        boolean unboxedBoolean = boxedBoolean; // Auto-unboxing
        System.out.println("Auto-unboxing for Boolean: " + unboxedBoolean);
    }
}

// The output of the above program is shown as below
/*
Auto-unboxing for Integer: 10
Auto-unboxing for Byte: 20
Auto-unboxing for Short: 30
Auto-unboxing for Long: 40
Auto-unboxing for Float: 50.5
Auto-unboxing for Double: 60.6
Auto-unboxing for Character: a
Auto-unboxing for Boolean: true
 */