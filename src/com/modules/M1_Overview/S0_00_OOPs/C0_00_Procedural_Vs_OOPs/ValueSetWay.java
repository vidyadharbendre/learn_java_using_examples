package C0_00_Basics.S2_02_Procedural_Vs_OOPs;

public class ValueSetWay {
    private int value; // Private variable to store the value

    // Setter method for 'value'
    public void setValue(int val) {
        value = val; // Set the 'value'
    }

    public static void main(String[] args) {
        ValueSetWay obj;
        obj = new ValueSetWay(); // Create an instance
        obj.setValue(3 + 4); // Set the value by performing addition
        System.out.println("Result: " + obj.value); // Display the computed sum
    }
}

//Result: 7