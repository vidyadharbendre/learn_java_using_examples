# Encapsulation in Java

## What is Encapsulation?
Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) concepts in Java. It is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit called a class. It involves restricting access to some of the object's components and hiding the internal state of an object.

## Core Principles of Encapsulation:
- **Data Hiding:** It hides the internal state of an object from outside interference or misuse.
- **Access Control:** It controls access to the variables and methods of a class using access modifiers (public, private, protected, default).
- **Information Hiding:** It exposes only necessary and relevant information about an object, concealing implementation details.

## How Encapsulation Works in Java:
- **Private Variables:** Class variables are often made private to prevent direct access from outside the class.
- **Getters and Setters (Accessors and Mutators):** Public methods (getters and setters) are used to access and modify private variables.
- **Data Validation:** Encapsulation allows validation and control over data before it's modified or accessed.

## Advantages of Encapsulation in Java:
- **Enhanced Security:** Protects data from unauthorized access or modification.
- **Controlled Access:** Defines access levels for variables and methods, preventing unwanted modifications.
- **Code Flexibility:** Enables changes to the internal implementation without affecting external code that uses the class.
- **Code Reusability:** Encapsulation promotes reusability by providing a well-defined interface to interact with objects.
- **Maintenance and Debugging:** Eases maintenance and debugging as changes are localized within the class.

## Encapsulation Example in Java:
```java
public class Student {
    private String name;
    private int age;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
}
```
The Student class above demonstrates encapsulation by declaring name and age as private variables and providing public getters and setters to access and modify these variables.
