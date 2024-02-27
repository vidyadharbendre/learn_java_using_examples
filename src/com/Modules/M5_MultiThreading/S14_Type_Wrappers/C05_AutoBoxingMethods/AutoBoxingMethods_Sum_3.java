package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C05_AutoBoxingMethods;



public class AutoBoxingMethods_Sum_3 {
    public static void main(String[] args) {
        int x = 22;
        int y = 11;
        int z = Integer.sum(x, y);
        System.out.println(z);
        /*
        Now wrap the x and y integers
         */
        Integer int_x_RefObj;
        int_x_RefObj = new Integer(44);

        Integer int_y_RefObj;
        int_y_RefObj = new Integer(55);

        int s = Integer.sum(int_x_RefObj, int_y_RefObj);
        System.out.println(s);



    }

}

// The output of the above program is shown as below
// 33
