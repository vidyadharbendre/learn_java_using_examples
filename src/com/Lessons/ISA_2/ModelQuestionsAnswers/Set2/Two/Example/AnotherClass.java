package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Two.Example;

import com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Two.Example.MyClass;

public class AnotherClass {
    public static void main(String[] args) {
        MyClass myClassRefObj;
        myClassRefObj = new MyClass();

        System.out.println(myClassRefObj.publicVar);
        myClassRefObj.publicMethod();

    }
}

// The output of the above program is shown as below
/*
1
Public Method
 */