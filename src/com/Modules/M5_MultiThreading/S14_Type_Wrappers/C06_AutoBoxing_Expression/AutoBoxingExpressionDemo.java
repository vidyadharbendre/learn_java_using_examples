package com.Modules.M5_MultiThreading.S14_Type_Wrappers.C06_AutoBoxing_Expression;

/*
Autoboxing/unboxing in expressions involves the automatic conversion between primitive types and wrapper objects within expressions. This allows you to use primitive types and wrapper objects interchangeably in expressions without explicit conversions.

Let's demonstrate this with an example using enum constants:
 */
enum Numbers {
    ONE(1), TWO(2), THREE(3);

    private final int value;

    Numbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class AutoBoxingExpressionDemo {
    public static void main(String[] args) {
        // Autoboxing: primitive int to Numbers enum constant
        Numbers num1_RefObj;
        num1_RefObj = Numbers.ONE;

        // Unboxing: Numbers enum constant to primitive int
        int num2_RefObj;
        num2_RefObj = Numbers.TWO.getValue();

        System.out.println("Enum constant: " + num1_RefObj);
        System.out.println("Primitive value: " + num2_RefObj);
    }
}

// The output of the above program is shown as below
/*
Enum constant: ONE
Primitive value: 2
 */