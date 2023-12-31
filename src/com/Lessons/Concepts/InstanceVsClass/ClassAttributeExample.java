package Lessons.Concepts.InstanceVsClass;

public class ClassAttributeExample {
    private static int count = 0; // Class attribute

    // Constructor
    public ClassAttributeExample() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Usage
        ClassAttributeExample obj1;
        obj1 = new ClassAttributeExample();
        System.out.println("Total Count.....: " + obj1.getCount());

        ClassAttributeExample obj2;
        obj2 = new ClassAttributeExample();
        System.out.println("Total Count.....: " + obj2.getCount());

        int totalObjects = ClassAttributeExample.getCount();
        System.out.println("Total Objects...: " + totalObjects);

    }
}
