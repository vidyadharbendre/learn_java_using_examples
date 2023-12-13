public class ParameterizedConstructor {
    private int attribute; // Declaring a private attribute

    // Parameterized constructor taking an initial value
    public ParameterizedConstructor(int initialValue){
        attribute = initialValue; // Initializing the attribute with the passed value
    }

    public static void main(String[] args) {
        ParameterizedConstructor paramObj; // Declaration of object reference

        // Creating an instance of ParameterizedConstructor with initial value 66
        paramObj = new ParameterizedConstructor(66);

        // Printing the value of the attribute of the created object
        System.out.println("The value assigned for the attribute is: " + paramObj.attribute);
    }
}
