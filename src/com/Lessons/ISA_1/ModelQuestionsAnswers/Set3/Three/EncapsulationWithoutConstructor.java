package Lessons.ModelQuestionsAnswers.Set3.Three;

// Encapsulation without constructors
public class EncapsulationWithoutConstructor {
    private String name;
    private int age;

    // Setter methods to set private members
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods to access private members
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating an instance of EncapsulationWithoutConstructor without a constructor
        EncapsulationWithoutConstructor person2;
        person2 = new EncapsulationWithoutConstructor();

        // Setting private members using setters
        person2.setName("Poornima");
        person2.setAge(47);

        // Accessing private members using getters
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}

// The output of the above program is shown below:
/*
Name: Poornima
Age: 47
 */