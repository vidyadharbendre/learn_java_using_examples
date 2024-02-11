package Lessons.ModelQuestionsAnswers.Set3.Three;

public class EncapsulationWithConstructor {

    // Encapsulation using constructors
    public class PersonWithConstructor {
        private String name;
        private int age;

        // Constructor to initialize name and age
        public PersonWithConstructor(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter methods to access private members
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        // Creating an instance of PersonWithConstructor using a constructor
        EncapsulationWithConstructor encapsulationObj;
        encapsulationObj = new EncapsulationWithConstructor();
        PersonWithConstructor person1;
        person1 = encapsulationObj.new PersonWithConstructor("Vidyadhar", 52);

        // Accessing private members using getters
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}
// The output of the above program is shown as below:
/*
Name: Vidyadhar
Age: 52
 */