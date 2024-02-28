# 4 Marks Question
# Discuss the purpose of type wrappers in Java. Provide examples demonstrating the usage of Character and Boolean wrappers.

# Purpose of Type Wrappers in Java

## Overview
Type wrappers, also known as wrapper classes, in Java serve several purposes:

1. **Conversion**: They provide methods for converting primitive data types into objects and vice versa.
2. **Nullability**: They allow null values to be assigned to variables, unlike primitive types.
3. **Compatibility**: They enable the use of primitive data types in collections, as collections can only store objects.
4. **Utility Methods**: They offer utility methods to perform various operations on data types, such as parsing strings and formatting.

## Character Wrapper Example

```java
public class CharacterWrapperExample {
    public static void main(String[] args) {
        // Using Character wrapper to convert char to Character object
        char letter = 'A';
        Character charObject = Character.valueOf(letter);

        // Converting Character object to char
        char newLetter = charObject.charValue();

        System.out.println("Original char: " + letter);
        System.out.println("Converted to Character object: " + charObject);
        System.out.println("Converted back to char: " + newLetter);
    }
}
```
