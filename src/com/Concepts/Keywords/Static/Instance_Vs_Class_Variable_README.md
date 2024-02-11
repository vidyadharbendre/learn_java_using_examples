# Instance vs Class Variables in Java

Understanding the differences between instance and class variables is crucial in object-oriented programming in Java. These variables differ in scope, memory allocation, and their association with objects and classes.

### Instance Variables

1. **Scope:**
    - Belongs to individual instances (objects) of a class.
    - Each object has its own copy, storing unique data for each instance.

2. **Memory Allocation:**
    - Memory allocated when an object is instantiated.
    - Each object maintains its own set of instance variables.

3. **Association:**
    - Accessed using object references (`this` keyword in Java).
    - Changes to instance variables in one object do not affect other objects.

4. **Declaration:**
    - Declared within a class but outside of methods or constructors.
    - Typically initialized within constructors or directly at the point of declaration.

### Class Variables (Static Variables)

1. **Scope:**
    - Associated with the class as a whole rather than specific instances.
    - Shared among all instances (objects) of the class.

2. **Memory Allocation:**
    - Memory allocated when the class is loaded into memory.
    - Only a single copy exists, shared among all instances.

3. **Association:**
    - Accessed using the class name itself or through object references.
    - Changes to a class variable affect all instances of the class.

4. **Declaration:**
    - Declared using the `static` keyword within the class but outside of methods.
    - Initialized directly at the point of declaration or within a static block.

### Example (Java)

File: `InstanceVsClass.java`

```java
public class InstanceVsClass {
    // Instance variable
    private int instanceVar;

    // Class variable (static)
    private static int classVar;

    public InstanceVsClass(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    public void displayValues() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
    }

    public static void main(String[] args) {
        InstanceVsClass obj1 = new InstanceVsClass(10);
        InstanceVsClass obj2 = new InstanceVsClass(20);

        obj1.displayValues(); // Displays variables for obj1
        obj2.displayValues(); // Displays variables for obj2
    }
}
```

- **instanceVar is an instance variable specific to each object of InstanceVsClass.** -
- **classVar is a class variable shared among all instances of InstanceVsClass.** -
- **Understanding the distinction between these variables is vital in managing data at both the instance and class levels.** -

- This information clarifies the differences between instance and class variables in Java, providing insights into their usage and implications within object-oriented programming.