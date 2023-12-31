package modules.M3_Inheritance.S1_01_Basics.C2_02_Types.E3_Hierachical_Or_Multilevel_Inheritance;

// Superclass
class Grandparent {
    public void displayGrandparent() {
        System.out.println("Displaying from Grandparent");
    }
}

// Subclass inheriting from Grandparent
class Parent extends Grandparent {
    public void displayParent() {
        System.out.println("Displaying from Parent");
    }
}

// Subclass inheriting from Parent
class Child extends Parent {
    public void displayChild() {
        System.out.println("Displaying from Child");
    }
}

// Main class for Multilevel Inheritance example
public class MultilevelInheritance {
    public static void main(String[] args) {
        Child myChild = new Child();
        myChild.displayGrandparent(); // Accessing method from Grandparent
        myChild.displayParent();      // Accessing method from Parent
        myChild.displayChild();       // Accessing method from Child
    }
}

// The output of the above program is shown as below:
/*
Displaying from Grandparent
Displaying from Parent
Displaying from Child
 */
