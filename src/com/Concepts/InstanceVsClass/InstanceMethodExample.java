package Lessons.Concepts.InstanceVsClass;

public class InstanceMethodExample {
    private int value;

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {

        // Usage
        InstanceMethodExample obj;
        obj = new InstanceMethodExample();

        obj.setValue(10);
        int val = obj.getValue();

        System.out.println("val : "+val);

    }


}



