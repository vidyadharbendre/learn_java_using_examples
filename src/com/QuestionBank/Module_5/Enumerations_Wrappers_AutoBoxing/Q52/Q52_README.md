# 10 Marks Question
# Write a Java program that demonstrates the usage of enumerations, type wrappers, and autoboxing in Java.

# Java Program: Enumerations, Type Wrappers, and Autoboxing

## Overview
This Java program demonstrates the usage of enumerations, type wrappers, and autoboxing.

## Enumerations Example
We define an enum `Day` to represent days of the week. The program assigns a day to the `today` variable and prints it.

```java
// Enum for Days of the Week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumWrapperAutoboxingExample {
    public static void main(String[] args) {
        // Enumerations Example
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}
```
## Type Wrappers Example
We demonstrate the usage of type wrappers by creating an Integer object using the valueOf() method and retrieving its primitive value using the intValue() method.


```java

class WrapperDemo {
    public static void main(String[] args) {

// Type Wrappers Example

    Integer intWrapper = Integer.valueOf(10); // Using valueOf() method to create Integer object
    int primitiveInt = intWrapper.intValue(); // Using intValue() method to retrieve primitive int
    System.out.println("Integer Wrapper: " + intWrapper);
    System.out.println("Primitive int: " + primitiveInt);
    }
}
```

## Autoboxing Example
We demonstrate autoboxing by assigning a primitive int to an Integer variable directly.

// Autoboxing Example
```java
class Autoboxing{
    public static void main(String[] args) {
        int primitiveNum = 20;
        Integer numWrapper = primitiveNum; // Autoboxing: converting int to Integer
        System.out.println("Autoboxing Example: " + numWrapper);
    }    
}
```
This program showcases the usage of enumerations, type wrappers, and autoboxing in Java.