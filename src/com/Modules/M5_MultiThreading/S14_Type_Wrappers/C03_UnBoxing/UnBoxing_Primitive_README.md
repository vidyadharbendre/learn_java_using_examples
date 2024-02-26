# Unboxing for Primitive Data Types

Unboxing is the process of converting a wrapper class object into its corresponding primitive data type. In Java, each wrapper class has methods to extract the primitive value it wraps. The purpose of unboxing is to retrieve the primitive value from the wrapper object.

Unboxing can be performed implicitly when a wrapper class object is assigned directly to a variable of its corresponding primitive type. For example, when an `Integer` object is assigned to an `int` variable, unboxing occurs automatically to extract the `int` value from the `Integer` object.

Here's an example of unboxing for all primitive data types:

- `Integer`: `int unboxedInt = boxedInt;`
- `Byte`: `byte unboxedByte = boxedByte;`
- `Short`: `short unboxedShort = boxedShort;`
- `Long`: `long unboxedLong = boxedLong;`
- `Float`: `float unboxedFloat = boxedFloat;`
- `Double`: `double unboxedDouble = boxedDouble;`
- `Character`: `char unboxedChar = boxedChar;`
- `Boolean`: `boolean unboxedBoolean = boxedBoolean;`
