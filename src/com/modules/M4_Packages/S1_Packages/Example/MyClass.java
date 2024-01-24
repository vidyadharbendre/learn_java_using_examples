package com.modules.M4_Packages.S1_Packages.Example;

/*
Relationship Between Packages and Member Access Control:
In Java, packages are used to organize and group related classes and interfaces.
The access control modifiers (public, protected, default (package-private), and private) play a crucial role in defining the visibility of classes, methods, and fields within and outside packages.

Member Access Control Impact:
- Public Access Modifier:
    Members with the public modifier are accessible from anywhere, both within the same package
    and from other packages.

- Protected Access Modifier:

    Members with the protected modifier are accessible within the same package and by subclasses, even if they are in different packages.
    Default (Package-Private) Access Modifier:

    Members with default access (no access modifier) are accessible only within the same package.

- Private Access Modifier:
    Members with the private modifier are accessible only within the same class.
 */


public class MyClass {
    public int publicVar;         // Public access
    protected int protectedVar;   // Protected access within package
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

    // Public method to access private method
    public void accessPrivateMethod() {
        privateMethod();
    }


    public int getPrivateVar() {
        return privateVar;
    }
}

// The output of the above program is shown as below
/*
1
Public Method
2
Protected Method
3
Default Method
4
Private Method
 */
