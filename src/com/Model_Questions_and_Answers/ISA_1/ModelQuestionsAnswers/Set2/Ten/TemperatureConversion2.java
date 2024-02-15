package com.Model_Questions_and_Answers.ISA_1.ModelQuestionsAnswers.Set2.Ten;

// TemperatureConversion class to convert temperatures between Celsius and Fahrenheit
public class TemperatureConversion2 {
    private double celsius;
    private double fahrenheit;

    // Constructor to initialize Celsius and Fahrenheit temperatures
    public TemperatureConversion2(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    // Setter methods to set Celsius and Fahrenheit temperatures
    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius
    }

    // Getter methods to retrieve Celsius and Fahrenheit temperatures
    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    // Method to display temperatures in both Celsius and Fahrenheit
    public void displayTemperatures() {
        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
    }
}
