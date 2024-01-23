package com.modules.M4_Packages.S4_Exception_Handling;

public class Exception_Handling_Catch_02 {
    public static void main(String[] args) {
        int a = 99;

        try {
            a = a/0;
        } catch (Exception e1){
            System.out.println(e1.getMessage());
        }
    }
}

/*
start
end
 */