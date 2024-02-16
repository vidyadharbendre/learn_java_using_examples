package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set3.One;

// Non-primitive type example - Class
class MyClass {
    String content = "Display this content"; // Variable within MyClass

}

public class NonPrimitiveMemoryAllocation {
    public static void main(String[] args) {
        // Memory allocation at compile time
        MyClass objRef; // Allocates memory for the reference 'objRef' of type 'MyClass'

        // Memory allocation at runtime
        objRef = new MyClass(); // Allocates memory for an object of 'MyClass'

        // Accessing and displaying content using the object reference
        System.out.println(objRef.content);
    }
}