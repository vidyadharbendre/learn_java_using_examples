package com.modules.M4_Packages.S4_Exception_Handling.C3_03_Types.E2_02_UnChecked;

public class UnChecked_ArithmeticException {
    public static void main(String[] args) {
        int operand1, operand2;
        float result;

        operand1 = 99;
        operand2 = 0;

        try{
            result = operand1/operand2;
            System.out.println(operand1 +"/"+ operand2+ "="+result);
        }catch (ArithmeticException e){
            System.out.println("Name of the Exception : "+e.getMessage());
        }
    }
}

// The output of the above program is shown as below
/*
Name of the Exception : / by zero
 */