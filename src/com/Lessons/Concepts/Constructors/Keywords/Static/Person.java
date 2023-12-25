package Lessons.Concepts.Constructors.Keywords.Static;

public class Person {

    String namePerson;
    float agePerson;
    long aadharPerson;
    boolean married;
    // properties like world population and india population are common to the Person class
    // such attributes are declared as static
    // static attributes are not dependent on objects, even before creating it, one can
    // print their default values by just accessing it through their class names.
    // static belongs to the class not to objects (independent of objects)
    // when methods are declared as static - no need to instantiate a class - available to use directly like main - beginning of the java program.

    static double world_population = 7_000_000_000.0f;
    static double india_population = 1_400_000_000f;
    // command + 'N' Key - to create constructor

    public Person(){
        System.out.println("Default Constructor without arguments");
    }
    public Person(String namePerson, float agePerson, long aadharPerson, boolean married) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.aadharPerson = aadharPerson;
        this.married = married;
        this.world_population +=0 ; // 7.0 billion as a double
        Person.india_population += 0; // 1.4 billion as a double
    }

    public static void notDependingOnObjects(){
        System.out.println("Not Dependent on Instance or Object");
        // you cannot call dependentOnObject() within static method
        //this.dependentOnObject(); This line would given an error! <as per above>
        // However, you can call static method within non-static method.

        Person personObj1;
        personObj1 = new Person();

        personObj1.dependentOnObject();
    }

    public static void increasePopulations() {
        System.out.println("Not Dependent on Instance or Object");
        world_population += 1; // Increment the world population by 1
        india_population += 1; // Increment the India population by 1
        Person obj1;
        obj1 = new Person();
        obj1.dependentOnObject();
    }

    public void dependentOnObject(){
        System.out.println("Dependent on instance or object creation or exposed only upon object creation");
    //    notDependingOnObjects();
    //    increasePopulations();
    }
}
