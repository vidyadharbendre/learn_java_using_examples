package com.Lessons.ISA_2.ModelQuestionsAnswers.Set1.Six;

/*
Explain the concept of private interface methods in Java interfaces.
Discuss how private interface methods contribute to code maintainability.
Transitioning to packages, discuss the role of packages in code
organization and modularity.
Provide examples for both topics
 */

/*
Private Interface Methods in Java Interfaces:
In Java, starting from Java 9, interfaces can have private methods.
These methods are useful for implementing code that is common to multiple
default or static methods within the same interface.
Private interface methods contribute to code maintainability by
encapsulating and reusing common logic.
 */

// Example of Private Interface Method:

public class Interface_privateMethod {
    public static void main(String[] args) {
        int sum, difference;
        Calculator calculatorRefObj;
        calculatorRefObj = new Calculator();
        sum = calculatorRefObj.add(5, 3);
        difference = calculatorRefObj.subtract(5, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

// Example interface with private methods
interface Calculation {
    default int add(int a, int b) {
        return a + b + getOffset();
    }
    default int subtract(int a, int b) {
        return a - b - getOffset();
    }
    private int getOffset() {
        return 10;
    }
}

// Class implementing the interface
class Calculator implements Calculation {
    // No need to implement private method getOffset;
    // it is handled internally
}

// The output of the above program is shown as below
/*
Sum: 18
Difference: -8
*/

