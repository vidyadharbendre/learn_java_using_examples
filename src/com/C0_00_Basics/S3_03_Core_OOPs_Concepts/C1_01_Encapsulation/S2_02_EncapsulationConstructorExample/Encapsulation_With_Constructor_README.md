# Encapsulation Example with Constructor

This Java example demonstrates encapsulation using a constructor in the `Person` class to initialize private attributes (`name`, `rollNumber`, `age`, `marks`). Encapsulation ensures controlled access to these attributes through getter methods while initializing them via a constructor.

## `Person` Class

The `Person` class features private attributes and getter methods along with a constructor:

### Attributes

- `name`: Stores the person's name.
- `rollNumber`: Stores the person's roll number.
- `age`: Stores the person's age.
- `marks`: Stores the person's marks.

### Constructor

The constructor initializes the `Person` object's attributes during object creation:

```java
public Person(String name, int rollNumber, float age, float marks) {
    // Assigning values to attributes
    // Includes validation for age
    // Displaying error message for invalid age
}
```
### Getter Methods
- **getName():** Retrieves the person's name.
- **getRollNumber():** Retrieves the person's roll number.
- **getAge():** Retrieves the person's age.
- **getMarks():** Retrieves the person's marks.

### Usage
To use the Person class, create an instance by providing values to the constructor. The constructor ensures encapsulation by initializing the private attributes while enforcing any necessary validations.

```java
// Creating a Person object using the constructor
Person personObj;
personObj = new Person("Vidyadhar", 101, 52.5f, 85.5f);

// Getting attributes using getter methods
String name = personObj.getName();
int rollNumber = personObj.getRollNumber();
float age = personObj.getAge();
float marks = personObj.getMarks();

```
