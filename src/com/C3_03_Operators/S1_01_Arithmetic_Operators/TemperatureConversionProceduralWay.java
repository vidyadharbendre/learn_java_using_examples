package C3_03_Operators.S1_01_Arithmetic_Operators;

import java.util.Scanner;

public class TemperatureConversionProceduralWay {

    public static void main(String[] args) {
        float fahrenheit, celsius, inputCelsius, newFahrenheit;

        Scanner inputObj;
        inputObj = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit...: ");
        fahrenheit = inputObj.nextFloat();

        celsius = ((fahrenheit - 32) * 5.0f) / 9.0f;
        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        System.out.println("Get Celsius : " + celsius);

        System.out.print("Enter a temperature in Celsius...: ");
        inputCelsius = inputObj.nextFloat();

        newFahrenheit = (inputCelsius * 9.0f / 5.0f) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f\n", newFahrenheit);
        System.out.printf("Temperature in Celsius: %.2f\n", inputCelsius);

        System.out.println("Get Fahrenheit : " + newFahrenheit);
        System.out.println("Set Fahrenheit to 33 : " + 33);

        inputObj.close();
    }
}


/* compile
javac -d ../../../../out TemperatureConversionProceduralWay.java
* */
/* execute
java -cp ../../../../out C3_03_Operators.S1_01_Arithmetic_Operators.TemperatureConversionProceduralWay
 */

/*
    Enter a temperature in Fahrenheit...: 44
        Temperature in Fahrenheit: 44.00
        Temperature in Celsius: 6.67
        Get Celsius : 6.6666665
        Enter a temperature in Celsius...: 6.67
        Temperature in Fahrenheit: 44.01
        Temperature in Celsius: 6.67
        Get Fahrenheit : 44.006
        Set Fahrenheit to 33 : 33

        Process finished with exit code 0

 */