package Lessons.Concepts.InstanceVsClass;

public class InstanceAttributeExample {
    private int value; // Instance attribute

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {

// Usage
        InstanceAttributeExample obj1;
        obj1 = new InstanceAttributeExample();
        InstanceAttributeExample obj2;
        obj2 = new InstanceAttributeExample();

        obj1.setValue(10);
        obj2.setValue(20);

        int val1 = obj1.getValue();
        int val2 = obj2.getValue();

        System.out.println("val1 : "+val1);
        System.out.println("val2 : "+val2);

    }

}

