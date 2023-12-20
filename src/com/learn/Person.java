public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Person person1;
        person1 = new Person();

        // Accessing object properties using getters
        System.out.println("Initial Details:");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // Creating object using parameterized constructor
        Person person2;
        person2 = new Person("Vidyadhar", 53);

        // Displaying details of person2 using display method
        System.out.println("\nDetails of person2:");
        person2.display();

        // Setting new values for person1 using setters
        person1.setName("Poornima");
        person1.setAge(47);

        // Displaying updated details of person1 using display method
        System.out.println("\nUpdated Details of person1:");
        person1.display();
    }
}

/*
 * Compilation Command:
 * javac -d ../../../out Person.java
 *
 * Execution Command:
 * java -cp ../../../out Person
 */