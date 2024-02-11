package Lessons.Concepts.Keywords.Static;


import static Lessons.Concepts.Keywords.Package.SupportClass.displayMessagePublic;

public class Main {
    public static void main(String[] args) {
        MessageDisplay.printMessage(); // within current package - printMessage exists in Static (current) package
// Hit alt + Enter key to get the import statements automatically

        displayMessagePublic(); //across packages - displayMessage exists in Package
// Hit alt + Enter key to get the import statements automatically

//    displayMessage(){    This is not declared as public - not able to access it outside


        Person person0;
        System.out.println(Person.india_population);
        System.out.println(Person.world_population);

        Person person1;
        person1 = new Person("Vidyadhar", 52.0f, 787856563231L, true);

        Person person2;
        person2 = new Person("Poornima", 47.0f, 108976564321L, true );

        System.out.println(person1.namePerson);
        System.out.println(person2.namePerson);
        System.out.println(Person.world_population);
        System.out.println(Person.india_population);

        Person person3;
        person3 = new Person("Akshara", 18.0f, 567876542341L, false);

        System.out.println(person3.namePerson);
        System.out.println(Person.world_population);
        System.out.println(Person.india_population);

        System.out.println("static vs non static methods");
        person1.dependentOnObject();
        // press option and enter key to automatically import class that has static methods!
        Person.notDependingOnObjects();

    }
}

// The output of the above program is shown as below:
/*
This message exists in Package package with public
1.4E9
7.0E9
Vidyadhar
Poornima
7.0E9
1.4E9
Akshara
7.0E9
1.4E9
static vs non static methods
Dependent on instance or object creation or exposed only upon object creation
Not Dependent on Instance or Object
Default Constructor without arguments
Dependent on instance or object creation or exposed only upon object creation
 */
