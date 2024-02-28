package com.QuestionBank.Module_5.Enumerations_Wrappers_AutoBoxing.Q51;

/*
# 5 Marks Question
# Describe autoboxing and unboxing in Java. Provide examples demonstrating autoboxing and unboxing with primitive types.
 */
public class AutoboxingUnboxingDemo {
    public static void main(String[] args) {
        // Autoboxing: converting int to Integer
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing

        // Unboxing: converting Integer to int
        Integer wrapperInt2 = 20;
        int primitiveInt2 = wrapperInt2; // Unboxing

        System.out.println("Autoboxing Example:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);

        System.out.println("\nUnboxing Example:");
        System.out.println("Wrapper Integer: " + wrapperInt2);
        System.out.println("Primitive int: " + primitiveInt2);
    }
}

// The output of the above program is shown as below
/*
Autoboxing Example:
Primitive int: 10
Wrapper Integer: 10

Unboxing Example:
Wrapper Integer: 20
Primitive int: 20
 */