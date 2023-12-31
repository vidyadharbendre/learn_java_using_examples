package modules.M2_Introducing_Classes;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter and setter methods...

    // Method to update age
    public void celebrateBirthday() {
        this.age++;
        System.out.println(name + " celebrated a birthday! Now aged: " + age);
    }

    // Method to change gender
    public void changeGender(String newGender) {
        this.gender = newGender;
        System.out.println(name + " changed gender to: " + gender);
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Akshara", 25, "Female");
        person1.displayInfo();  // Output: Name: Alice, Age: 25, Gender: Female

        person1.celebrateBirthday();  // Method call to update age
        person1.displayInfo();  // Output: Name: Alice, Age: 26, Gender: Female

        person1.changeGender("Male");  // Method call to change gender
        person1.displayInfo();  // Output: Name: Alice, Age: 26, Gender: Male
    }
}

// The output of the above program is shown as below:
/*
Name: Akshara, Age: 25, Gender: Female
Akshara celebrated a birthday! Now aged: 26
Name: Akshara, Age: 26, Gender: Female
Akshara changed gender to: Male
Name: Akshara, Age: 26, Gender: Male
 */