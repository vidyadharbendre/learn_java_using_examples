package Trials.LearnInheritance.Example_0;

public class Inheritance_learn_0 {
    public static void main(String[] args) {

        Employee empObj;
        empObj = new Employee("Vidyadhar", 187888886754L);
        empObj.displayDetails();

        empObj.setName("Poornima");
        empObj.setAadhar(455566668998L);
        empObj.displayDetails();

        Manager managerObj;
        managerObj = new Manager("Atharva", 114567543456L, "AIML");
        managerObj.displayDetails();

        managerObj.setName("Akshara");
        managerObj.setAadhar(566534217890L);
        managerObj.setDepartment("CS");
        managerObj.displayDetails();

    }
}


class Employee{
    private String name;
    private double aadhar;

    public Employee(String name, long aadhar) {
        this.name = name;
        this.aadhar = aadhar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAadhar(double aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public double getAadhar() {
        return aadhar;
    }

    public void displayDetails(){
        System.out.println("Employee Name : "+getName());
        System.out.println("Employee Aadhar : "+getAadhar());
    }
}

class Manager extends Employee{

    public String department;

    public Manager(String name, long aadhar, String department) {
        super(name, aadhar);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("department : "+getDepartment());
    }

}

// The output of the above program is shown as below
/*
Employee Name : Vidyadhar
Employee Aadhar : 1.87888886754E11
Employee Name : Poornima
Employee Aadhar : 4.55566668998E11
Employee Name : Atharva
Employee Aadhar : 1.14567543456E11
department : AIML
Employee Name : Akshara
Employee Aadhar : 5.6653421789E11
department : CS
 */