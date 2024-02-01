package com.lab.program2;

/*
3. A class called Employee, which models an employee with an ID, name and salary, is designed as shown in
the following class diagram. The method raiseSalary (percent) increases the salary by the given
percentage. Develop the Employee class and suitable main method for demonstration.

 */
public class EmployeeDemo {
    public static void main(String[] args) {
        // Creating an Employee object with initial details
        Employee employeeRefObj;
        employeeRefObj = new Employee(101, "Vidyadhar Bendre", 50000.0);

        // Displaying initial details of the Employee
        System.out.println("Employee ID: " + employeeRefObj.getEmployeeID());
        System.out.println("Employee Name: " + employeeRefObj.getEmployeeName());
        System.out.println("Employee Salary: in rupees : " + employeeRefObj.getEmployeeSalary());

        // Increasing employee's salary by 10%
        employeeRefObj.raiseSalary(10);

        // Displaying updated salary after the raise
        System.out.println("\nEmployee Salary after 10% raise: in Rupees : " + employeeRefObj.getEmployeeSalary());
    }
}


class Employee {
    // Instance variables for Employee: ID, name, and salary
    private int employeeID;
    private String employeeName;
    private double employeeSalary;

    // Constructor to initialize Employee with ID, name, and salary
    public Employee(int employeeID, String employeeName, double employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    // Method to raise salary by a given percentage
    public void raiseSalary(double percent) {
        // Calculate the raise amount based on the given percentage
        double raiseAmount = employeeSalary * (percent / 100);
        // Increase the salary by the calculated raise amount
        employeeSalary += raiseAmount;
    }

    // Getter method for Employee ID
    public int getEmployeeID() {
        return employeeID;
    }

    // Getter method for Employee name
    public String getEmployeeName() {
        return employeeName;
    }

    // Getter method for Employee salary
    public double getEmployeeSalary() {
        return employeeSalary;
    }
}
/*
Employee ID: 101
Employee Name: Vidyadhar Bendre
Employee Salary: in rupees : 50000.0

Employee Salary after 10% raise: in Rupees : 55000.0
*

 */
