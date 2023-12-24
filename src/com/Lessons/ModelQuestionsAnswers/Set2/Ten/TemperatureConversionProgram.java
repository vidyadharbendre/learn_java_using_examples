package Lessons.ModelQuestionsAnswers.Set2.Ten;

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        // Creating an instance of TemperatureConversion using a constructor
        TemperatureConversion2 tempObj;
        tempObj = new TemperatureConversion2(0, 32);

        // Displaying initial temperatures
        tempObj.displayTemperatures();

        // Setting temperatures and displaying them again
        tempObj.setCelsius(25);
        tempObj.displayTemperatures();

        tempObj.setFahrenheit(98.6);
        tempObj.displayTemperatures();
    }
}
// The output of the above program is shown as below:
/*
Temperature in Celsius: 0.0°C
Temperature in Fahrenheit: 32.0°F
Temperature in Celsius: 25.0°C
Temperature in Fahrenheit: 77.0°F
Temperature in Celsius: 37.0°C
Temperature in Fahrenheit: 98.6°F
 */