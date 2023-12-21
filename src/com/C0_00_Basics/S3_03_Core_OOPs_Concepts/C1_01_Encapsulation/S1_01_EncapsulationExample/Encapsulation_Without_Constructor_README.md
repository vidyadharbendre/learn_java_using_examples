# Encapsulation Example without Constructor

This Java example demonstrates encapsulation without utilizing a constructor in the `Person` class. Encapsulation is achieved by controlling access to the class's data attributes (`name`, `rollNumber`, `age`, `marks`) through setter and getter methods.

## `Person` Class

The `Person` class features private attributes and public setter and getter methods:

### Attributes

- `name`: Stores the person's name.
- `rollNumber`: Stores the person's roll number.
- `age`: Stores the person's age.
- `marks`: Stores the person's marks.

### Setter Methods

- `setName(String name)`: Sets the person's name.
- `setRollNumber(int rollNumber)`: Sets the person's roll number.
- `setAge(float age)`: Sets the person's age (with age validation).
- `setMarks(float marks)`: Sets the person's marks.

### Getter Methods

- `getName()`: Retrieves the person's name.
- `getRollNumber()`: Retrieves the person's roll number.
- `getAge()`: Retrieves the person's age.
- `getMarks()`: Retrieves the person's marks.

## `Main` Class

The `Main` class demonstrates the usage of the `Person` class by:

1. Creating a `Person` object.
2. Setting the attributes (`name`, `rollNumber`, `age`, `marks`) using setter methods.
3. Retrieving and displaying these attributes using getter methods.

## Execution

To execute the example, compile and run the `Main` class:

### Compilation Command

```bash
javac -d <destination_directory> *.java
