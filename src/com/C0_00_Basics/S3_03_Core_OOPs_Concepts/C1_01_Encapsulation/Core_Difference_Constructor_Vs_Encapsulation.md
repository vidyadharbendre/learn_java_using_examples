# Constructor vs Encapsulation

## Constructor

### Definition
A constructor is a special method within a class that is automatically called when an object is created. It is used to initialize the state of the object.

### Purpose
- **Initialization:** Constructors initialize the object's state by assigning initial values to its attributes/variables.
- **Object Creation:** They are used to create objects of a class and ensure they start in a valid state.
- **Usage:** Constructors set default values, perform initialization tasks, and ensure object consistency upon instantiation.

### Example (Java)
```java
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String initialName, int initialAge) {
        name = initialName;
        age = initialAge;
    }
}
```
## Encapsulation
### Definition
Encapsulation is the bundling of data (attributes) and methods (functions) within a class. It involves restricting access to some parts of the object and hiding its internal state.

### Purpose
- **Data Hiding:** Encapsulation hides the internal state of an object by marking attributes as private, allowing controlled access through methods.
- **Access Control:** It controls access to the internal components, allowing manipulation only through well-defined interfaces (methods).
- **Usage:** Encapsulation maintains the integrity of an object's state and protects it from external interference.
### Example (Java)
```java
public class BankAccount {
    private double balance;

    // Getter and setter methods for encapsulation
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        // Perform validation before updating the balance
        balance += amount;
    }
}
```

## Key Difference:
### Focus
- **Constructor:** Focuses on initializing object state during instantiation.
- **Encapsulation:** Focuses on bundling data and methods, controlling access to object internals.
### Role
- **Constructor:** Specific method used for object creation and initialization.
- **Encapsulation:** Broader principle ensuring data integrity and controlled access within a class.
### Functionality
- **Constructor:** Initializes object state by setting initial values.
- **Encapsulation:** Controls access to object components, hides internal details.

These differences illustrate that constructors are specifically used for initializing object state, while encapsulation ensures proper organization and controlled access within a class.