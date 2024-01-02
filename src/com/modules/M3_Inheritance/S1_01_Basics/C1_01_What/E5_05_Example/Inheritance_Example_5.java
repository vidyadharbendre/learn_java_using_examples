package modules.M3_Inheritance.S1_01_Basics.C1_01_What.E5_05_Example;

/*
alt insert key for constructor: For windows command
 */

// Employee superclass
class Employee {
    private String name;
    private int empId;
    private double salary;

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nEmployee ID: " + empId + "\nSalary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    private String department;

    public Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Developer subclass
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Salesperson subclass
class Salesperson extends Employee {
    private String territory;

    public Salesperson(String name, int empId, double salary, String territory) {
        super(name, empId, salary);
        this.territory = territory;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Territory: " + territory);
    }
}

// Example usage
public class Inheritance_Example_5 {
    public static void main(String[] args) {
        Manager managerObj;
        managerObj = new Manager("Vidyadhar Bendre", 101, 75000, "Operations");
        Developer developerObj;
        developerObj = new Developer("Akshara Bendre", 102, 80000, "Java");
        Salesperson salespersonObj;
        salespersonObj = new Salesperson("Atharava Bendre", 103, 60000, "North Region");

        managerObj.displayInfo();
        System.out.println();
        developerObj.displayInfo();
        System.out.println();
        salespersonObj.displayInfo();
    }
}

// The output of the above program is shown as below:
/*

Name: Vidyadhar Bendre
Employee ID: 101
Salary: 75000.0
Department: Operations

Name: Akshara Bendre
Employee ID: 102
Salary: 80000.0
Programming Language: Java

Name: Atharava Bendre
Employee ID: 103
Salary: 60000.0
Territory: North Region

 */