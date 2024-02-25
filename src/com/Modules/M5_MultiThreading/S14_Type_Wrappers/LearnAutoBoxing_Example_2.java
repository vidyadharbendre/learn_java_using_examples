package com.Modules.M5_MultiThreading.S14_Type_Wrappers;

public class LearnAutoBoxing_Example_2 {
    public static void main(String[] args) {

        int int_1 = 5;

        /* Boxing */
        Integer intBox;
        intBox = new Integer(15);

        /* Auto Boxing */
        Integer intAutoBoxing;
        intAutoBoxing = 25;

        System.out.println("Primitive - Integer value : "+int_1);
        System.out.println("Boxing -Integer value : "+intBox);
        System.out.println("Auto Boxing - Integer value : "+intAutoBoxing);

        intBox = new Integer(35);
        int intUnBox = intBox.intValue();
        System.out.println("UnBoxing - Integer value : "+intUnBox);

        int intAutoUnBox = intUnBox;
        System.out.println("Auto UnBoxing - Integer value : "+intAutoUnBox);
    }
}
