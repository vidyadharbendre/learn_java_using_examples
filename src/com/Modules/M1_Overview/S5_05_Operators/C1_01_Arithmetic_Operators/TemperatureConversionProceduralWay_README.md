# Temperature Conversion Program (Procedural Approach)

This Java program allows users to convert temperatures between Fahrenheit and Celsius using arithmetic operations.

## Purpose
The purpose of this program is to provide a simple tool for users to convert temperatures from one unit to another (Fahrenheit to Celsius and vice versa) through user input and arithmetic calculations.

## How to Use
1. **Compilation**: To compile the program, use the following command:
    ```bash
    javac -d ../../../../out TemperatureConversionProceduralWay.java
    ```

2. **Execution**: Execute the compiled program using the following command:
    ```bash
    java -cp ../../../../out C3_03_Operators.S1_01_Arithmetic_Operators.TemperatureConversionProceduralWay
    ```

3. **Usage**: When the program is executed, follow the on-screen prompts:
    - Enter a temperature in Fahrenheit.
    - The program will display the input temperature in both Fahrenheit and Celsius.
    - Then, enter a temperature in Celsius.
    - The program will display the input temperature in both Celsius and recalculated Fahrenheit.
    - Additionally, it will demonstrate setting the Fahrenheit value to 33.

## Sample Output
Enter a temperature in Fahrenheit...: 44
Temperature in Fahrenheit: 44.00
Temperature in Celsius: 6.67
Get Celsius : 6.6666665
Enter a temperature in Celsius...: 6.67
Temperature in Fahrenheit: 44.01
Temperature in Celsius: 6.67
Get Fahrenheit : 44.006
Set Fahrenheit to 33 : 33



## Description
The program utilizes Java's `Scanner` class to accept user input for temperatures. It employs the following conversion formulas:
- Fahrenheit to Celsius: `Celsius = (Fahrenheit - 32) * 5.0 / 9.0`
- Celsius to Fahrenheit: `Fahrenheit = (Celsius * 9.0 / 5.0) + 32`

It provides an interactive way to perform temperature conversions in a procedural programming style.
