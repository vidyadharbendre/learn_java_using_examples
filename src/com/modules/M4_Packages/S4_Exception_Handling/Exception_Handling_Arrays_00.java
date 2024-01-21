package com.modules.M4_Packages.S4_Exception_Handling;

import static sun.swing.MenuItemLayoutHelper.max;

public class Exception_Handling_Arrays_00 {
    public static void main(String[] args) {
        int i=0, result;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        result = displayArray(array);
        System.out.println("The maximum length of an Array : "+result);

        try{
            System.out.println(array[9]);
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ArrayIndexOutOfBoundsException start");
            System.out.println(e2.getMessage());
        } catch (Exception e1){
            String s;
            s = "Name of the exception : " + e1.getMessage();
            System.out.println(s);
        }

    }

    public static int displayArray(int[] array){
        int i = 0;
        for (i=0; i<array.length; i++){
            System.out.println("Array[ "+i +" ] = "+array[i]);
        }
        return i-1;
    }

}
