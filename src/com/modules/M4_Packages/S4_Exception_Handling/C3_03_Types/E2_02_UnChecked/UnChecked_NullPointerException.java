package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Types.E2_02_UnChecked;

public class UnChecked_NullPointerException {
    public static void main(String[] args) {
        int length;
        String strRefObj = null;
        try{
            length = strRefObj.length();
        }catch (NullPointerException e4){
            System.out.println(e4.getMessage());
        }
    }
}
