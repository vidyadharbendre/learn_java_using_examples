// 3rd Program
// This should be 6th Program

class CalculaterPublicPrivate {
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
}
