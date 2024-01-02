package Trials.LearnInheritance.Example_1;

public class Inheritance_learn_1 {
    public static void main(String[] args) {

        Car carParamObj;
        carParamObj = new Car("Toyota", "Fortuner", 1990, 2);
        carParamObj.displayCarDetails();

        Motorbike motorbikeDefaultObj;
        motorbikeDefaultObj = new Motorbike("Sports");
        motorbikeDefaultObj.displayMotorDetails();

        Motorbike motorbikeParamObj;
        motorbikeParamObj = new Motorbike("Bajaj", "Kawashaki", 1999,  "Regular");

        motorbikeParamObj.displayMotorDetails();

    }
}

class Vehicle {
    private String brand;
    private String model;
    private int year;
    public Vehicle() {
        this.brand = "Default brand";
        this.model = "Default model";
        this.year = 1999;
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);

    }

}

class Motorbike extends Vehicle{

    private String type;

    public void displayMotorDetails(){
        super.displayDetails();
        System.out.println("Type : "+type);
    }
    public Motorbike(String type) {
        super();
        this.type = type;
    }

    public Motorbike(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }
}

class Car extends Vehicle{
    private int doors;

//    @Override
//    public void displayDetails() {
//        super.displayDetails();
//    }

    @Override
    public void displayDetails(){
        super.displayDetails();
    }

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }


    /*
    /Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50611:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/vidyadharbendre/java_workspace/learn_java_using_examples/src/com/C2_02_Java_Objects/out/production/learn_java_using_examples:/Users/vidyadharbendre/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-jdk8/1.9.0/kotlin-stdlib-jdk8-1.9.0.jar:/Users/vidyadharbendre/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib/1.9.0/kotlin-stdlib-1.9.0.jar:/Users/vidyadharbendre/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-common/1.9.0/kotlin-stdlib-common-1.9.0.jar:/Users/vidyadharbendre/.m2/repository/org/jetbrains/annotations/13.0/annotations-13.0.jar:/Users/vidyadharbendre/.m2/repository/org/jetbrains/kotlin/kotlin-stdlib-jdk7/1.9.0/kotlin-stdlib-jdk7-1.9.0.jar Trials.LearnInheritance.Example_1.Inheritance_learn_1
Brand : Toyota
Model : Fortuner
Year : 1990
Doors: 2
Brand : Bajaj
Model : Kawashaki
Year : 1999
Type : Regular
     */
// Method to display vehicle details
    public void displayCarDetails() {
        super.displayDetails();
        System.out.println("Doors: "+ doors);
    }
}

