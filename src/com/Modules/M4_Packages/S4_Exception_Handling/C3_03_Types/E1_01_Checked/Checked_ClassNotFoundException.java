package com.Modules.M4_Packages.S4_Exception_Handling.C3_03_Types.E1_01_Checked;

public class Checked_ClassNotFoundException {
    public static void main(String[] args) {
        try{
            Class.forName("Non ExistentClass of Class");
        }catch (ClassNotFoundException e1){
            System.out.println("ClassNotFoundExceptions : " +e1.getMessage());
        }

    }
}

// The output of the above program is shown as below
/*
ClassNotFoundExceptions : Non ExistentClass of Class
 */