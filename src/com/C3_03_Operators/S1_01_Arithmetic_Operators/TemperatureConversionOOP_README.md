# Temperature Conversion Program (Object-Oriented Approach)

This Java program facilitates temperature conversions between Fahrenheit and Celsius using an object-oriented approach.

## Purpose
The purpose of this program is to facilitate temperature conversion between Fahrenheit and Celsius through an object-oriented paradigm, employing class methods for conversion and encapsulating temperature properties.

## How to Use
1. **Compilation**: Compile the program using the following command:
    ```bash
    javac -d ../../../../out TemperatureConversionOOP.java
    ```

2. **Execution**: Execute the compiled program with the following command:
    ```bash
    java -cp ../../../../out C3_03_Operators.S1_01_Arithmetic_Operators.TemperatureConversionOOP
    ```

3. **Usage**: Upon execution, follow the program prompts:
   - Enter a temperature in Fahrenheit.
   - The program will display the input temperature in both Fahrenheit and Celsius.
   - Then, enter a temperature in Celsius.
   - The program will display the input temperature in both Celsius and recalculated Fahrenheit.
   - Additionally, it will demonstrate setting the Fahrenheit value to 33.

## Sample Output
Enter a temperature in Fahrenheit...: 21
Temperature in Fahrenheit: 21.00
Temperature in Celsius: -6.11
Get Celsius : -6.111111
Enter a temperature in Celsius...: -6.11
Temperature in Fahrenheit: 21.00
Temperature in Celsius: -6.11
Get Fahrenheit : 21.001999
Set Fahrenheit to 33 : 33.0

Process finished with exit code 0


## Description
The program defines a `TemperatureConversionOOP` class that encapsulates Fahrenheit and Celsius properties with methods for conversions:
- `getFahrenheit()`: Retrieves the Fahrenheit temperature.
- `setFahrenheit()`: Sets the Fahrenheit temperature and recalculates Celsius.
- `getCelsius()`: Retrieves the Celsius temperature.
- `setCelsius()`: Sets the Celsius temperature and recalculates Fahrenheit.
- `displayTemperatures()`: Displays both Fahrenheit and Celsius temperatures.

It demonstrates temperature conversion in an object-oriented manner, separating concerns through class methods and encapsulation.
