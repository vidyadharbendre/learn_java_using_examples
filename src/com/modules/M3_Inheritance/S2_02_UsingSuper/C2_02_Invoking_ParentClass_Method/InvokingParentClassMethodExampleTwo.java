package modules.M3_Inheritance.S2_02_UsingSuper.C2_02_Invoking_ParentClass_Method;

public class InvokingParentClassMethodExampleTwo {
    public static void main(String[] args) {
        Car myCarObj;
        myCarObj = new Car();
        myCarObj.display();
    }
}


class Vehicle {
    int speed = 50;
    void display() {
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    int speed = 100;
    void display() {
        super.display(); // Accessing superclass method
        System.out.println("Car Speed: " + speed);
    }
}

// The output of the above program is shown as below
/*
Speed: 50
Car Speed: 100
 */