package Trials.LearnInheritance.Example_0;

public class Inheritance_learn_0 {
    public static void main(String[] args) {

        Employee empObj;
        empObj = new Employee("Vidyadhar", 187888886754L);
        empObj.displayDetails();

        Manager managerObj;
        managerObj = new Manager("Atharva", 114567543456L, "AIML");
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

    public void displayDetails(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Aadhar : "+aadhar);
    }
}

class Manager extends Employee{

    public String department;

    public Manager(String name, long aadhar, String department) {
        super(name, aadhar);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("department : "+department);
    }
}