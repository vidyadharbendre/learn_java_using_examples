package Lessons.Concepts.ClassAndConstructor;

public class Car_6 {
    // Instance variables
    private String brand;
    private String model;
    private int year;

    // Constructors
    public Car_6() {
        // Default constructor
        this.brand = "Maruthi";
        this.model = "Alto";
        this.year=2020;
    }

    public Car_6(String brand, String model, int year) {
        // Parameterized constructor
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Methods
    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCarInfo() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year;
    }

}
