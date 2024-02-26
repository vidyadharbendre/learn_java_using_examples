package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C01_Boxing;

public class Boxing_Demo {
    public static void main(String[] args) {
        // Boxing for int
        int intVal = 10;
        Integer boxedInt;
        boxedInt = Integer.valueOf(intVal);
        System.out.println("Boxing for int: " + boxedInt);

        // Boxing for byte
        byte byteVal = 20;
        Byte boxedByte;
        boxedByte = Byte.valueOf(byteVal);
        System.out.println("Boxing for byte: " + boxedByte);

        // Boxing for short
        short shortVal = 30;
        Short boxedShort;
        boxedShort = Short.valueOf(shortVal);
        System.out.println("Boxing for short: " + boxedShort);

        // Boxing for long
        long longVal = 40L;
        Long boxedLong;
        boxedLong = Long.valueOf(longVal);
        System.out.println("Boxing for long: " + boxedLong);

        // Boxing for float
        float floatVal = 50.5f;
        Float boxedFloat;
        boxedFloat = Float.valueOf(floatVal);
        System.out.println("Boxing for float: " + boxedFloat);

        // Boxing for double
        double doubleVal = 60.6;
        Double boxedDouble;
        boxedDouble = Double.valueOf(doubleVal);
        System.out.println("Boxing for double: " + boxedDouble);

        // Boxing for char
        char charVal;
        charVal = 'a';
        Character boxedChar = Character.valueOf(charVal);
        System.out.println("Boxing for char: " + boxedChar);

        // Boxing for boolean
        boolean boolVal;
        boolVal = true;
        Boolean boxedBoolean = Boolean.valueOf(boolVal);
        System.out.println("Boxing for boolean: " + boxedBoolean);
    }
}
// The output of the above program is shown as below
/*
Boxing for int: 10
Boxing for byte: 20
Boxing for short: 30
Boxing for long: 40
Boxing for float: 50.5
Boxing for double: 60.6
Boxing for char: a
Boxing for boolean: true
 */