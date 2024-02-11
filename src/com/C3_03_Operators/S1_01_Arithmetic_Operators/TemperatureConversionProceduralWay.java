package com.C3_03_Operators.S1_01_Arithmetic_Operators;

import java.util.Scanner;

public class TemperatureConversionProceduralWay {

    public static void main(String[] args) {
        float fahrenheit, celsius, inputCelsius, newFahrenheit;

        // Initialize Scanner object for user input
        Scanner inputObj;
        inputObj = new Scanner(System.in);

        // Prompt user for input temperature in Fahrenheit
        System.out.print("Enter a temperature in Fahrenheit...: ");
        fahrenheit = inputObj.nextFloat();

        // Calculate Celsius from Fahrenheit
        celsius = ((fahrenheit - 32) * 5.0f) / 9.0f;

        // Display Fahrenheit and Celsius temperatures
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        // Display calculated Celsius temperature
        System.out.println("Get Celsius : " + celsius);

        // Prompt user for input temperature in Celsius
        System.out.print("Enter a temperature in Celsius...: ");
        inputCelsius = inputObj.nextFloat();

        // Calculate Fahrenheit from input Celsius
        newFahrenheit = (inputCelsius * 9.0f / 5.0f) + 32;

        // Display Fahrenheit and input Celsius temperatures
        System.out.printf("Temperature in Fahrenheit: %.2f\n", newFahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", inputCelsius);

        // Display calculated Fahrenheit temperature
        System.out.println("Get Fahrenheit : " + newFahrenheit);

        // Display set Fahrenheit value of 33
        System.out.println("Set Fahrenheit to 33 : " + 33);

        // Close Scanner object
        inputObj.close();
    }
}


/* compile
javac -d ../../../../out TemperatureConversionProceduralWay.java
* */
/* execute
java -cp ../../../../out C3_03_Operators.S1_01_Arithmetic_Operators.TemperatureConversionProceduralWay
 */


// The output of the above program is shown as below:

/*
Enter a temperature in Fahrenheit...: 21
Temperature in Fahrenheit: 21.00
Temperature in Celsius: -6.11
Get Celsius : -6.111111
Enter a temperature in Celsius...: -6.11
Temperature in Fahrenheit: 21.00
Temperature in Celsius: -6.11
Get Fahrenheit : 21.001999
Set Fahrenheit to 33 : 33
 */