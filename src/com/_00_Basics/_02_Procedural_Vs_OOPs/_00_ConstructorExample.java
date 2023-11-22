public class _00_ConstructorExample {
    private int value;

    // Constructor with the same name as the class
    public _00_ConstructorExample(int val) {
        value = val;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        // Creating an instance of MyClass using the constructor
        _00_ConstructorExample obj;
        obj = new _00_ConstructorExample(10);

        // Calling a method within the object
        obj.displayValue();
    }
}
