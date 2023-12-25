package Lessons.Concepts.Constructors.Keywords.Static;

public class Person {

    String namePerson;
    float agePerson;
    long aadharPerson;
    boolean married;
    // properties like world population and india population are common to the Person class
    // such attributes are declared as static
    static double world_population = 7_000_000_000.0f;
    static double india_population = 1_400_000_000f;
    // command + 'N' Key - to create constructor

    public Person(String namePerson, float agePerson, long aadharPerson, boolean married) {
        this.namePerson = namePerson;
        this.agePerson = agePerson;
        this.aadharPerson = aadharPerson;
        this.married = married;
        this.world_population +=1 ; // 7.0 billion as a double
        Person.india_population += 1; // 1.4 billion as a double
    }
}
