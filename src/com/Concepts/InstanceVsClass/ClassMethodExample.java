package Lessons.Concepts.InstanceVsClass;

public class ClassMethodExample {
    private static int count = 0;
    public ClassMethodExample() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        // Usage
        int totalObjects = ClassMethodExample.getCount();
        System.out.println("totalObjects : "+totalObjects);

    }
}

