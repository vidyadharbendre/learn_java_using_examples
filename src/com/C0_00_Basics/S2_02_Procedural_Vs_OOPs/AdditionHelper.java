package C0_00_Basics.S2_02_Procedural_Vs_OOPs;

public class AdditionHelper {
    private int value; // Private variable to store the value

    // Method to perform addition
    public void performAddition(int a, int b) {
        value = a + b; // Performing addition and assigning the result to 'value'
    }

    public static void main(String[] args) {
        AdditionHelper obj;
        obj = new AdditionHelper(); // Create an instance
        obj.performAddition(3, 4); // Perform addition using the method
        System.out.println("Result: " + obj.value); // Display the computed sum
    }
}
// The output of the above program is shown below:
// Result: 7
