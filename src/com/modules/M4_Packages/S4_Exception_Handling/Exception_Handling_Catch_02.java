package com.modules.M4_Packages.S4_Exception_Handling;

public class Exception_Handling_Catch_02 {
    public static void main(String[] args) {
        int a = 99;
        try {
            System.out.println("1.start");
            a = a/0;
            System.out.println("2. end");

        } catch (ArithmeticException e){
            System.out.println("catch block started");
            System.out.println(e.getMessage());
        }
    }
}

/*
start
end
 */