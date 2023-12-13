package C3_03_Operators.S1_01_Arithmetic_Operators;

/*

Author:
Vidyadhar Bendre

Email:
vidyadhar.bendre@gmail.com

Date:
12 December 2023

Purpose:
The purpose of this program is to facilitate temperature conversion between Fahrenheit and
Celsius through an object-oriented paradigm, employing class methods for conversion and
encapsulating temperature properties.

Description
The program defines a `TemperatureConversionOOP` class that encapsulates Fahrenheit and Celsius properties with methods for conversions:
- `getFahrenheit()`: Retrieves the Fahrenheit temperature.
- `setFahrenheit()`: Sets the Fahrenheit temperature and recalculates Celsius.
- `getCelsius()`: Retrieves the Celsius temperature.
- `setCelsius()`: Sets the Celsius temperature and recalculates Fahrenheit.
- `displayTemperatures()`: Displays both Fahrenheit and Celsius temperatures.

It demonstrates temperature conversion in an object-oriented manner, separating concerns
through class methods and encapsulation.



 */
import java.util.Scanner;

public class TemperatureConversionOOP {
    private float fahrenheit;
    private float celsius;
    // Constructor to initialize temperature values
    public TemperatureConversionOOP(float initialFahrenheit) {
        fahrenheit = initialFahrenheit;
        convertToCelsius();
    }
    // Getter for Fahrenheit temperature
    public float getFahrenheit() {
        return fahrenheit;
    }
    // Setter for Fahrenheit temperature
    public void setFahrenheit(float newFahrenheit) {
        fahrenheit = newFahrenheit;
        convertToCelsius();
    }

    // Getter for Celsius temperature
    public float getCelsius() {
        return celsius;
    }

    // Setter for Celsius temperature
    public void setCelsius(float newCelsius) {
        celsius = newCelsius;
        convertToFahrenheit();
    //    this.fahrenheit = (celsius * 9.0f) / 5.0f + 32;
    }

    public void convertToFahrenheit() {
        fahrenheit = (celsius * 9.0f) / 5.0f + 32;
    }
    public void convertToCelsius() {
        celsius = ((fahrenheit - 32) * 5.0f) / 9.0f;
    }


    // Method to display temperatures
    public void displayTemperatures() {
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
    }

    public static void main(String[] args) {
        float inputFahrenheit, inputCelsius;

        Scanner consoleObj;
        consoleObj = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit...: ");
        inputFahrenheit = consoleObj.nextFloat();

        TemperatureConversionOOP converterObj;
        converterObj = new TemperatureConversionOOP(inputFahrenheit);
        converterObj.displayTemperatures();

        System.out.println("Get Celsius : "+converterObj.getCelsius());

        System.out.print("Enter a temperature in Celsius...: ");
        inputCelsius = consoleObj.nextFloat();

        converterObj.setCelsius(inputCelsius);
        converterObj.displayTemperatures();

        System.out.println("Get Fahrenheit : "+converterObj.getFahrenheit());
        converterObj.setFahrenheit(33);
        System.out.println("Set Fahrenheit to 33 : "+converterObj.getFahrenheit());

        consoleObj.close();
    }
}

/* compile
javac -d ../../../../out TemperatureConversionOOP.java
* */
/* execute
java -cp ../../../../out C3_03_Operators.S1_01_Arithmetic_Operators.TemperatureConversionOOP
 */


// The output of the above program is shown as below;
/*
    Enter a temperature in Fahrenheit...: 21
        Temperature in Fahrenheit: 21.00
        Temperature in Celsius: -6.11
        Get Celsius : -6.111111
        Enter a temperature in Celsius...: -6.11
        Temperature in Fahrenheit: 21.00
        Temperature in Celsius: -6.11
        Get Fahrenheit : 21.001999
        Set Fahrenheit to 33 : 33.0

 */

/*
(base) vidyadharbendre@Vidyadhars-MacBook-Pro S1_01_Arithmetic_Operators % java -cp ../../../../out C3_03_Operators.S1_01_Arithmetic_Operators.TemperatureConversionOOP
Enter a temperature in Fahrenheit...: 44
Temperature in Fahrenheit: 44.00
Temperature in Celsius: 6.67
Get Celsius : 6.6666665
Enter a temperature in Celsius...: 6.67
Temperature in Fahrenheit: 44.01
Temperature in Celsius: 6.67
Get Fahrenheit : 44.006
Set Fahrenheit to 33 : 33.0

 */

/*
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

 */