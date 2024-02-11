/*
 * Author:
 * Vidyadhar Bendre
 *
 * Email:
 * vidyadhar.bendre@gmail.com
 *
 * Purpose:
 * This program represents an Improved Calculator class with additional methods for arithmetic operations.
 *
 * Description:
 * This class, L11_ImprovedCalculator_11, demonstrates an improved calculator functionality by adding
 * more methods for arithmetic operations such as addition, multiplication, and division. It includes
 * a method to display the results after performing the calculations.
 */

class L11_ImprovedCalculator_11 {
    // Private attributes (Instance Variables)
    private float number1;
    private float number2;

    // Constructor to initialize number1 and number2 during object creation
    public L11_ImprovedCalculator_11(float num1, float num2) {
        this.number1 = num1;
        this.number2 = num2;
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

        System.out.println("Sum.................: " + sum);
        System.out.println("Product.............: " + product);
        System.out.println("Quotient............: " + quotient);
    }
}

// Compile the above using the below mentioned command
/*
 * javac -d ../../../out L11_ImprovedCalculator_11.java
 */
