# Data Types in Java

Java offers various data types, both primitive and non-primitive, each serving different purposes in programming.

## Overview

The `DataTypesExample` program demonstrates the usage of different data types available in Java. It showcases the declaration and usage of various data types:

- `byte`: 8-bit signed integer (range: -128 to 127)
- `short`: 16-bit signed integer (range: -32,768 to 32,767)
- `int`: 32-bit signed integer (range: -2^31 to 2^31-1)
- `long`: 64-bit signed integer (range: -2^63 to 2^63-1)
- `float`: 32-bit floating point (stores decimal numbers)
- `double`: 64-bit floating point (stores decimal numbers)
- `char`: 16-bit Unicode character
- `boolean`: Represents true or false values

Additionally, it showcases a non-primitive data type:

- `String`: Represents a sequence of characters

## Example

```java
public class DataTypesExample {

    public static void main(String[] args) {
        // Declaration and initialization of various data types
        byte myByte = 10;
        short myShort = 100;
        int myInt = 1000;
        long myLong = 1000000L;
        float myFloat = 3.14f;
        double myDouble = 3.14159265359;
        char myChar = 'A';
        boolean myBoolean = true;
        String myString = "Hello, Java!";

        // Displaying values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);
        System.out.println("String: " + myString);
    }
}
```