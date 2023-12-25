package Lessons.Concepts.Constructors.Keywords.Static;


import static Lessons.Concepts.Constructors.Keywords.Package.SupportClass.displayMessagePublic;
import static Lessons.Concepts.Constructors.Keywords.Static.MessageDisplay.printMessage;

public class Main {
    public static void main(String[] args) {
    printMessage(); // within current package - printMessage exists in Static (current) package
// Hit alt + Enter key to get the import statements automatically

    displayMessagePublic(); //across packages - displayMessage exists in Package
// Hit alt + Enter key to get the import statements automatically

//    displayMessage(){    This is not declared as public - not able to access it outside


    Person person1;
    person1 = new Person("Vidyadhar", 52.0f, 787856563231L, true);

    Person person2;
    person2 = new Person("Poornima", 47.0f, 108976564321L, true );

        System.out.println(person1.namePerson);
        System.out.println(person2.namePerson);
        System.out.println(Person.world_population);
        System.out.println(Person.india_population);

    }
}

// The output of the above program is shown as below:
/*
This message exists Static package
This message exists in Package package with public
Vidyadhar
Poornima
 */
