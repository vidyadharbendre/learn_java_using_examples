package com.Modules.M4_Packages.S4_Exception_Handling;

public class Exception_Handling_Throw_05 {
    public static void main(String[] args) {
        int a, b;
        float result;

        try{
            result = divide_by_zero(5, 0);
            System.out.println("result : "+ result);
        } catch (ArithmeticException e2){
            System.out.println("Arithmetic Exception begins...");
            System.out.println(e2.getMessage());
        } catch (Exception e1) {
            System.out.println("Exception begins...");
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Always executes...");
        }

    }
    public static float divide_by_zero(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new RuntimeException("please do not pass zero");
        }
        return (float) a / b;
    }
}
