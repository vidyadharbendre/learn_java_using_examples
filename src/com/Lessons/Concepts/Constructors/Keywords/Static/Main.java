package Lessons.Concepts.Constructors.Keywords.Static;


import static Lessons.Concepts.Constructors.Keywords.Package.SupportClass.displayMessage;
import static Lessons.Concepts.Constructors.Keywords.Static.MessageDisplay.printMessage;

public class Main {
    public static void main(String[] args) {

    printMessage(); // within current package - printMessage exists in Static (current) package
    displayMessage(); //across packages - displayMessage exists in Package
    }
}

// The output of the above program is shown as below:
/*
This message exists Static package
This message exists in Package package
 */
