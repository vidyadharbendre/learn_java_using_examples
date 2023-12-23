# Understanding Access Modifiers in Java: `protected` vs `private`

## What?
In Java, access modifiers control the visibility of class members (variables or methods) within and outside the class. `protected` and `private` are two key access modifiers that define the accessibility of these members.

## Why?
Understanding the differences between `protected` and `private` is crucial for implementing proper encapsulation and controlling access to class members.

## When to Use `private`:
### Who?
- `private` restricts access to members within the class itself.
- Who should use it: Encapsulation principle in Object-Oriented Programming.

### What?
- `private` members are inaccessible outside the class where they're declared.
- What it helps achieve: Ensures data integrity by preventing direct external access.

### How?
- Declare variables or methods as `private` to restrict access.
- How it's used: To encapsulate internal state and provide controlled access via getters and setters.

## When to Use `protected`:
### Who?
- `protected` allows access within the class, subclasses, and the same package.
- Who should use it: Inheritance principle in Object-Oriented Programming.

### What?
- `protected` members are accessible within the same package and subclasses.
- What it helps achieve: Facilitates inheritance and controlled access in related classes.

### How?
- Use `protected` for members that need to be accessible to subclasses.
- How it's used: Enables inheritance and allows controlled access within related classes.

## Core Differences:
### `private` vs `protected`
- **Scope:**
  - `private`: Access limited to the declaring class.
  - `protected`: Access within class, subclasses, and same package.
- **Inheritance:**
  - `private`: Not inherited by subclasses.
  - `protected`: Inherited by subclasses.
- **Outside Access:**
  - `private`: Inaccessible from outside the class.
  - `protected`: Accessible within package and subclasses.

### OOP Principles and Access Modifiers:
- **Encapsulation (Uses `private`):**
  - Encapsulation principle in OOP involves hiding the internal state of an object.
  - Achieved by using `private` to restrict direct access to internal members, ensuring data integrity.

- **Inheritance (Uses `protected`):**
  - Inheritance principle involves creating new classes from existing ones.
  - Utilizes `protected` to allow access within a class hierarchy, enabling subclasses to inherit and use certain members.

Understanding these distinctions aids in designing classes that adhere to encapsulation principles, maintain proper access control, and facilitate inheritance in Object-Oriented Programming.
