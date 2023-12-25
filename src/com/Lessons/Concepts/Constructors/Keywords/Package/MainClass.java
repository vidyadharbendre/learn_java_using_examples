package Lessons.Concepts.Constructors.Keywords.Package;

import static Lessons.Concepts.Constructors.Keywords.Package.SupportClass.displayMessage;
import static Lessons.Concepts.Constructors.Keywords.Package.SupportClass.displayMessagePublic;

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
 *
 */

// Define a class to demonstrate usage of a support class

public class MainClass {
    public static void main(String[] args) {
        displayMessagePublic();
        displayMessage();
    }
}
// The output of the above program is shown below:
/*
This message exists in Package package with public
This message is not declared as public
 */