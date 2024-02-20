package com.Modules.M5_MultiThreading.L99_Trials;

enum FlagColourEnum {
    ORANGE("orange"),
    BLUE("blue"),
    WHITE("white"),
    GREEN("green");

    private final String colour;

    FlagColourEnum(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
public class EnumDemo {
    public static void main(String[] args) {
        System.out.println(FlagColourEnum.ORANGE.getColour());
        System.out.println(FlagColourEnum.BLUE.getColour());
        System.out.println(FlagColourEnum.WHITE.getColour());
        System.out.println(FlagColourEnum.GREEN.getColour());
    }
}
// The output of the above program is shown as below
/*
orange
blue
white
green
 */
