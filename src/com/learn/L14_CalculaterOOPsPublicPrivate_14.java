/*
 * 14th Program
 *
 * Purpose:
 * This program demonstrates the use of public and private access modifiers within a Java class. It exemplifies
 * encapsulation by maintaining private attributes accessible only through public methods. It provides methods for
 * setting and retrieving values for two float attributes, as well as performing basic arithmetic operations and
 * displaying the results.
 *
 * Description:
 * This Java program, encapsulated within the class L14_CalculaterOOPsPublicPrivate_14, demonstrates the concept
 * of encapsulation by utilizing private attributes (number1 and number2) and public methods (setNumber1, setNumber2,
 * getNumber1, getNumber2, add, multiply, divide, displayResults) to control access to these attributes.
 * Private Attributes:
 * - number1 and number2: These are private float attributes that store numeric values, encapsulated within the
 * class to restrict direct access from outside.
 *
 * Public Methods:
 * - setNumber1, setNumber2: These methods set the values of number1 and number2, respectively.
 * - getNumber1, getNumber2: These methods retrieve the values of number1 and number2, respectively.
 * - add, multiply, divide: These methods perform addition, multiplication, and division operations on number1
 *   and number2.
 * - displayResults: This method internally calls arithmetic operations and displays their results in a structured
 *   format.
 *
 * The program serves as an educational example of how encapsulation can be used to control access to class attributes
 * and methods, enhancing code maintainability and security.
 */


class L14_CalculaterOOPsPublicPrivate_14 {
    // Private attributes
    private float number1;
    private float number2;

    // Public methods to access and modify attributes
    public void setNumber1(float num) {
        number1 = num;
    }

    public void setNumber2(float num) {
        number2 = num;
    }

    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }

    // Public methods for performing operations
    public float add() {
        return number1 + number2;
    }

    public float multiply() {
        return number1 * number2;
    }

    public float divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    // Public method to display the results
    public void displayResults() {
        float sum = add();
        float product = multiply();
        float quotient = divide();

        // Performing operations and displaying results within Class as a method
        System.out.println("Printing the below as defined in one of the methods");
        System.out.println("Addition (Public/Private).........: " + sum);
        System.out.println("Multiplication (Public/Private)...: " + product);
        System.out.println("Division (Public/Private).........: " + quotient);

    }

}

// compile the above program using the below mentioned command
/*
 * javac -d out ../../../out CalculaterOOPsPublicPrivate_14.java
 */
