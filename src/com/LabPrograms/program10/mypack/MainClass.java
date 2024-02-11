package com.LabPrograms.program10.mypack;

/*
10. Develop a JAVA program to create a package named mypack and import & implement it in a suitable
class.

 */
// Step 3: Import and implement the package in a suitable class

public class MainClass {
    public static void main(String[] args) {
        // Step 4: Create an instance of the class from the package
        MyPackageClass myPackageObjectRefObj;
        myPackageObjectRefObj = new MyPackageClass();

        // Step 5: Call the method from the package class
        myPackageObjectRefObj.displayMessage();
    }
}
