package com.modules.M4_Packages.S4_Exception_Handling.C2_02_Types.E2_02_UnChecked;

public class UnChecked_NullPointerException {
    public static void main(String[] args) {
        String strRefObj = null;
        try {
            int length = strRefObj.length();
        }catch (NullPointerException e1){
            System.out.println(e1.getMessage());
        }
    }
}
