package com.Lessons.ISA_2.ModelQuestionsAnswers.Set2.Two.Example;

public class MyClass {
    public int publicVar;         // Public access
    protected int protectedVar;   // Protected access
    int defaultVar;               // Default access (package-private)
    private int privateVar;       // Private access

    // Constructor
    public MyClass() {
        this.publicVar = 1;
        this.protectedVar = 2;
        this.defaultVar = 3;
        this.privateVar = 4;
    }

    // Methods
    public void publicMethod() {
        System.out.println("Public Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }
}

