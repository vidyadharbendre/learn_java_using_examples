# 5 Marks Question
# Describe autoboxing and unboxing in Java. Provide examples demonstrating autoboxing and unboxing with primitive types.

# Autoboxing and Unboxing in Java

## Overview
Autoboxing and unboxing are features introduced in Java that allow automatic conversion between primitive types and their corresponding wrapper classes. Autoboxing automatically converts primitive types to their wrapper class objects, while unboxing automatically converts wrapper class objects back to their primitive types.

## Autoboxing
Autoboxing is the process of automatically converting a primitive type to its corresponding wrapper class object.

### Example:
```java
// Autoboxing: converting int to Integer
    int primitiveInt = 10;
    Integer wrapperInt = primitiveInt; // Autoboxing

    System.out.println("Primitive int: " + primitiveInt);
    System.out.println("Wrapper Integer: " + wrapperInt);
