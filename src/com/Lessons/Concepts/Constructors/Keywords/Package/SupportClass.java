package Lessons.Concepts.Constructors.Keywords.Package;

public class SupportClass {
    public static void displayMessagePublic(){
        System.out.println("This message exists in Package package with public");
    }

    static void displayMessage(){
        System.out.println("This message is not declared as public");
    }
}
