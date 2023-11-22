public class MyClass {
    private int value;

    // Constructor with the same name as the class
    public MyClass(int val) {
        value = val;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass using the constructor
        MyClass obj = new MyClass(10);

        // Calling a method within the object
        obj.displayValue();
    }
}
