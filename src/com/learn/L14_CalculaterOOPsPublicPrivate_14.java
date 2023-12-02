// 14th Program

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
javac -d out .\CalculaterOOPsPublicPrivate_14.java
* */