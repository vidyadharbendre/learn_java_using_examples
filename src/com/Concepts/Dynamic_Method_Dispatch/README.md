# Dynamic Method Dispatch in Java

Dynamic Method Dispatch is a fundamental concept in object-oriented programming languages like Java. It enables the selection of overridden methods at runtime, providing flexibility and extensibility in code implementation.

## Overview
Dynamic Method Dispatch allows a subclass to override methods from its superclass and determines which overridden method to execute during runtime. It's a crucial aspect of polymorphism in Java, facilitating the invocation of subclass-specific methods even when referenced by a superclass variable.

### Key Points:
- **Runtime Invocation:** Methods are chosen at runtime based on the actual object type, not the reference type.
- **Polymorphic Behavior:** Enables a subclass object to be assigned to a superclass reference and execute subclass-specific methods.
- **Flexibility:** Offers flexibility and extensibility in code by allowing method invocation to be determined dynamically.

## 5W1H Breakdown

### What is Dynamic Method Dispatch?
Dynamic Method Dispatch is a mechanism in object-oriented programming that allows the selection of overridden methods at runtime.

### When does Dynamic Method Dispatch occur?
It occurs when a subclass overrides a method of its superclass, and an object of the subclass is assigned to a reference variable of the superclass.

### Where is Dynamic Method Dispatch used?
This mechanism is utilized in Java and other object-oriented languages supporting polymorphism.

### Why is Dynamic Method Dispatch important?
It enables the selection of overridden methods at runtime, offering flexibility in method invocation and enhancing code extensibility.

### Who benefits from Dynamic Method Dispatch?
Developers working with inheritance and polymorphism in Java benefit from Dynamic Method Dispatch, allowing for more flexible and extensible code.

### How does Dynamic Method Dispatch work in Java?
During runtime, when a subclass object is assigned to a reference variable of its superclass, the method executed is determined based on the actual type of the object. This enables invocation of overridden subclass-specific methods.

Dynamic Method Dispatch is a cornerstone of polymorphism in Java, offering significant advantages in designing robust and scalable object-oriented systems.
