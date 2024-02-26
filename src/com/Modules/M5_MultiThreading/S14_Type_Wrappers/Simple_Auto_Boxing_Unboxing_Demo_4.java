package com.Modules.M5_MultiThreading.S14_Type_Wrappers;

//Java Program to convert all primitives into its corresponding
//wrapper objects and vice-versa
public class Simple_Auto_Boxing_Unboxing_Demo_4{
    public static void main(String args[]){
        byte b=11;
        short s=22;
        int i=33;
        long l=44;
        float f=55.5F;
        double d=66.6D;
        char c='a';
        boolean b2=true;

//Autoboxing: Converting primitives into objects
        Byte byteRefObj=b;
        Short shortRefObj=s;
        Integer intRefObj=i;
        Long longRefObj=l;
        Float floatRefObj=f;
        Double doubleRefObj=d;
        Character charRefObj=c;
        Boolean boolRefObj=b2;

//Printing objects
        System.out.println("---Printing object values---");
        System.out.println("Byte object:.......: "+byteRefObj);
        System.out.println("Short object:......: "+shortRefObj);
        System.out.println("Integer object.....: "+intRefObj);
        System.out.println("Long object........: "+longRefObj);
        System.out.println("Float object.......: "+floatRefObj);
        System.out.println("Double object......: "+doubleRefObj);
        System.out.println("Character object...: "+charRefObj);
        System.out.println("Boolean object.....: "+boolRefObj);

//Unboxing: Converting Objects to Primitives
        byte bytevalue=byteRefObj;
        short shortvalue=shortRefObj;
        int intvalue=intRefObj;
        long longvalue=longRefObj;
        float floatvalue=floatRefObj;
        double doublevalue=doubleRefObj;
        char charvalue=charRefObj;
        boolean boolvalue=boolRefObj;

//Printing primitives
        System.out.println("---Printing primitive values---");
        System.out.println("byte value......: "+bytevalue);
        System.out.println("short value.....: "+shortvalue);
        System.out.println("int value.......: "+intvalue);
        System.out.println("long value......: "+longvalue);
        System.out.println("float value.....: "+floatvalue);
        System.out.println("double value....: "+doublevalue);
        System.out.println("char value......: "+charvalue);
        System.out.println("boolean value...: "+boolvalue);
    }
}
// The output of the above program is shown as below
/*
---Printing object values---
Byte object:.......: 11
Short object:......: 22
Integer object.....: 33
Long object........: 44
Float object.......: 55.5
Double object......: 66.6
Character object...: a
Boolean object.....: true
---Printing primitive values---
byte value......: 11
short value.....: 22
int value.......: 33
long value......: 44
float value.....: 55.5
double value....: 66.6
char value......: a
boolean value...: true
 */