package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.SevenTwo;

/*
Backward Compatibility:
Default and static methods in interfaces were introduced in Java 8 to enhance
backward compatibility.
They allow interfaces to evolve over time by adding new methods without breaking
existing implementations.

Before Java 8, adding a new method to an existing interface would break all the
 classes that implemented that interface.
 With default methods, existing classes automatically inherit the new method,
 and they can choose to override it if needed.
 Static methods provide utility methods associated with the interface itself.
 */


public class StaticMethodExample {
    public static void main(String[] args) {
        int resultAdd, resultSubtract;

        resultAdd = MathOperation.add(33,66);
        resultSubtract = MathOperation.subtract(99, 66);

        System.out.println("Addition : "+resultAdd);
        System.out.println("Subtraction : "+resultSubtract);
    }
}

interface MathOperation{
    static int add(int a, int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
}
