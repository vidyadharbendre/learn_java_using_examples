package com.Modules.M5_MultiThreading.L99_Trials;

public class LearnAutoBoxing {
    public static void main(String[] args) {

        int intValue = 5;

        /* Boxing */
        Integer intBox;
        intBox = new Integer(5);

        /* Auto Boxing */
        Integer intAutoBoxing;
        intAutoBoxing = 5;


        System.out.println("Boxing -Integer ref obj : "+intBox);
        System.out.println("Primitive - Integer value : "+intValue);
        System.out.println("Auto Boxing - Integer value : "+intAutoBoxing);


    }
}
