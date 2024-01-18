package com.lab.program2;

abstract class EmployeeDemo_Abstract {

    private int employeeID;
    private String employeeName;
    private double employeeSalary;

    // Constructor for initializing Employee details
    public EmployeeDemo_Abstract(int employeeID, String employeeName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Abstract method to be implemented by subclasses
    public abstract void raiseSalary(double percent);

    // Getter methods
    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    // Setter method to update salary
    protected void setEmployeeSalary(double updatedSalary) {
        this.employeeSalary = updatedSalary;
    }
}

// Concrete class representing a specific type of Employee
class SalariedEmployee extends EmployeeDemo_Abstract {
    // Constructor chaining to initialize details
    public SalariedEmployee(int employeeID, String employeeName, double employeeSalary) {
        super(employeeID, employeeName, employeeSalary);
    }

    // Implementation of the abstract method
    @Override
    public void raiseSalary(double percent) {
        double raiseAmount = getEmployeeSalary() * (percent / 100);
        // Increase the salary by the calculated raise amount
        double updatedSalary = getEmployeeSalary() + raiseAmount;
        // Update the salary
        setEmployeeSalary(updatedSalary);
    }
}

// Main class for testing
public class EmployeeDemo_Abstract_Override {
    public static void main(String[] args) {
        // Creating an instance of SalariedEmployee
        SalariedEmployee salariedEmployee = new SalariedEmployee(101, "Vidyadhar Bendre", 50000.0);

        // Displaying initial details
        System.out.println("Employee ID: " + salariedEmployee.getEmployeeID());
        System.out.println("Employee Name: " + salariedEmployee.getEmployeeName());
        System.out.println("Employee Salary: in rupees : " + salariedEmployee.getEmployeeSalary());

        // Increasing salary by 10%
        salariedEmployee.raiseSalary(10);

        // Displaying updated salary
        System.out.println("\nEmployee Salary after 10% raise: in Rupees : " + salariedEmployee.getEmployeeSalary());
    }
}