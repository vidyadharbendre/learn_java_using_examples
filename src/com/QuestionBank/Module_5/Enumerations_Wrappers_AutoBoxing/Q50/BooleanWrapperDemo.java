package com.QuestionBank.Module_5.Enumerations_Wrappers_AutoBoxing.Q50;


public class BooleanWrapperDemo {
    public static void main(String[] args) {
        // Using Boolean wrapper to convert boolean to Boolean object
        boolean flag = true;
        Boolean boolObject;
        boolObject = Boolean.valueOf(flag);

        // Converting Boolean object to boolean
        boolean newFlag;
        newFlag = boolObject.booleanValue();

        System.out.println("Original boolean: " + flag);
        System.out.println("Converted to Boolean object: " + boolObject);
        System.out.println("Converted back to boolean: " + newFlag);
    }
}
// The output of the above program is shown as below
/*
Original boolean: true
Converted to Boolean object: true
Converted back to boolean: true
 */