package com.Modules.M5_MultiThreading.S14_Type_Wrappers;

class IntWrapper{
    private int anInt;

    public IntWrapper() {
        this.anInt = 1;
    }
    public IntWrapper(int anInt) {
        this.anInt = anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return Integer.toString(anInt);
    }
}


public class Simple_Integer_Wrapper_Demo_5 {
    public static void main(String[] args) {
        IntWrapper intWrapperRefObj;
        intWrapperRefObj = new IntWrapper();

        System.out.println("Default value set to Integer datatype...: "+intWrapperRefObj);

        intWrapperRefObj = new IntWrapper(11);
        System.out.println("Parameterized value : "+intWrapperRefObj);

    }
}
