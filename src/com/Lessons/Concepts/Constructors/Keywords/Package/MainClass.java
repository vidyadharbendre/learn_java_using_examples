package Lessons.Concepts.Constructors.Keywords.Package;

/**
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Date:
 * 25 December 2023
 *
 * Purpose:
 * This class demonstrates the usage of a support class in Java packages.
 *
 * 1. 'MainClass' is the main class showcasing the usage of a support class.
 *
 * 2. The 'main()' method creates an instance of 'SupportClass' and calls its method.
 *
 */

// Define a class to demonstrate usage of a support class

public class MainClass {
    public static void main(String[] args) {

        SupportClass supportClassObj;
        supportClassObj = new SupportClass();

        supportClassObj.displayMessage();
    }
}
// The output of the above program is shown below:
/*
This is a SupportClass method
 */