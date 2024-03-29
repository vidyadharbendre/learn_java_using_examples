package com.Model_Questions_and_Answers.ISA_2.ModelQuestionsAnswers.Set2.Two.Example;

public class AnotherClass {
    public static void main(String[] args) {
        MyClass myClassRefObj;
        myClassRefObj = new MyClass();

        System.out.println(myClassRefObj.publicVar);
        myClassRefObj.publicMethod();

        System.out.println(myClassRefObj.protectedVar);
        myClassRefObj.protectedMethod();

        System.out.println(myClassRefObj.defaultVar);
        myClassRefObj.defaultMethod();

        System.out.println(myClassRefObj.getPrivateVar());
        myClassRefObj.accessPrivateMethod();
    }
}

// The output of the above program is shown as below
/*
1
Public Method
 */