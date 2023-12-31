package Lessons.Concepts.Keywords.Static;

public class InstanceVsClass {
    // Instance variable
    private int instanceVar;

    // Class variable (static)
    private static int classVar;

    public InstanceVsClass(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    public void displayValues() {
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Class Variable: " + classVar);
    }

    public static void main(String[] args) {
        InstanceVsClass obj1;
        obj1 = new InstanceVsClass(10);
        InstanceVsClass obj2;
        obj2 = new InstanceVsClass(20);

        obj1.displayValues(); // Displays variables for obj1
        obj2.displayValues(); // Displays variables for obj2
    }
}

// The output of the above program is shown as below:
/*
Instance Variable: 10
Class Variable: 0
Instance Variable: 20
Class Variable: 0
 */