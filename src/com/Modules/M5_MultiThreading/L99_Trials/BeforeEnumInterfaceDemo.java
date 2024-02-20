package com.Modules.M5_MultiThreading.L99_Trials;

interface FlagColour{
    // Declaring constants in Capital letter
    final String ORANGE = "orange";
    final String BLUE = "blue";
    static final String WHITE = "white";
    static final String GREEN = "green";

}
public class BeforeEnumInterfaceDemo implements FlagColour{
    public static void main(String[] args) {
        System.out.println(FlagColour.ORANGE);
        System.out.println(FlagColour.BLUE);

        System.out.println(FlagColour.WHITE);
        System.out.println(FlagColour.GREEN);

        System.out.println(ORANGE);
        System.out.println(BLUE);
    }
}
// The output of the above program is shown as below
/*
orange
blue
white
green
 */