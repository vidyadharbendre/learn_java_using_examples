# Auto-unboxing for Primitive Data Types

Auto-unboxing is a feature introduced in Java that allows wrapper objects to be automatically converted into their corresponding primitive types when needed. It simplifies code by eliminating the need for explicit unboxing.

In Java, when a wrapper class object is assigned directly to a variable of its corresponding primitive type, the compiler automatically performs the unboxing operation internally. This process is known as auto-unboxing.

Here's an example of auto-unboxing for all primitive data types:

- `Integer`: `int unboxedInt = boxedInt;`
- `Byte`: `byte unboxedByte = boxedByte;`
- `Short`: `short unboxedShort = boxedShort;`
- `Long`: `long unboxedLong = boxedLong;`
- `Float`: `float unboxedFloat = boxedFloat;`
- `Double`: `double unboxedDouble = boxedDouble;`
- `Character`: `char unboxedChar = boxedChar;`
- `Boolean`: `boolean unboxedBoolean = boxedBoolean;`
