# Abstraction vs Polymorphism

## Abstraction

Abstraction involves hiding complex implementation details and emphasizing essential features of an object. It allows focusing on the fundamental properties and behaviors while concealing unnecessary intricacies.

- **Objective:** Focuses on essential properties while hiding non-essential details.
- **Implementation:** Utilizes abstract classes and interfaces, defining methods without specific implementations.
- **Example:** The `Shape` class with abstract methods (`calculateArea()` and `calculatePerimeter()`) is an abstraction. It outlines what these methods should do without specifying how they're implemented in subclasses.

## Polymorphism

Polymorphism refers to an object's ability to exhibit different behaviors or forms based on the context. It enables objects of different classes to be treated as instances of a common superclass or interface.

- **Objective:** Allows objects of different types to be treated uniformly based on a shared interface.
- **Implementation:** Achieved through method overriding or method overloading.
- **Example:** Using a `Shape` reference to point to either a `Circle` or a `Rectangle` and calling the `calculateArea()` or `calculatePerimeter()` method demonstrates polymorphism. The specific behavior executed is based on the actual implementation in the concrete subclass.

### Core Difference

- **Abstraction** simplifies complexity by defining interfaces or abstract classes, focusing on defining blueprints.
- **Polymorphism** enables different behavior for method calls based on the actual object's specific implementation, allowing for flexibility and uniform treatment of different object types.
