package modules.M3_Inheritance.S1_01_Basics.C2_02_Types.E4_Hybrid_Inheritance;


// Interface 1
interface Interface1 {
    void method1();
}

// Interface 2
interface Interface2 {
    void method2();
}

// Class implementing Interface1
class MyClass implements Interface1 {
    public void method1() {
        System.out.println("Implementation of method1");
    }
}

// Class extending MyClass and implementing Interface2
class SubClass extends MyClass implements Interface2 {
    public void method2() {
        System.out.println("Implementation of method2");
    }
}

// Main class for Hybrid Inheritance example
public class HybridInheritance {
    public static void main(String[] args) {
        SubClass mySubClass = new SubClass();
        mySubClass.method1(); // Accessing method1 from Interface1
        mySubClass.method2(); // Accessing method2 from Interface2
    }
}

//The output of the above program is shown as below:
/*
Implementation of method1
Implementation of method2
 */