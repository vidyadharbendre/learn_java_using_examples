package C3_03_Operators.S1_01_Arithmetic_Operators;

import java.util.Scanner;

public class TemperatureConversionOOP {
    private float fahrenheit;
    private float celsius;
    // Constructor to initialize temperature values
    public TemperatureConversionOOP(float initialFahrenheit) {
        this.fahrenheit = initialFahrenheit;
        this.celsius = ((fahrenheit - 32) * 5.0f) / 9.0f;
    }
    // Getter for Fahrenheit temperature
    public float getFahrenheit() {
        return fahrenheit;
    }

    // Setter for Fahrenheit temperature
    public void setFahrenheit(float newFahrenheit) {
        this.fahrenheit = newFahrenheit;
        this.celsius = ((fahrenheit - 32) * 5.0f) / 9.0f;
    }

    // Getter for Celsius temperature
    public float getCelsius() {
        return celsius;
    }

    // Setter for Celsius temperature
    public void setCelsius(float newCelsius) {
        this.celsius = newCelsius;
        this.fahrenheit = (celsius * 9.0f) / 5.0f + 32;
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