public class CalculatorDemo {
    public static void main(String[] args) {
        // Creating an object of the original Calculator class

        // Allocating reference 'calc' on the stack
        Calculator calc;
        // Allocating a 'Calculator' object on the heap and assigning its reference to 'calc'
        calc = new Calculator();

        // Setting values for number1 and number2
        calc.number1 = 10;
        calc.number2 = 5;

        // Performing operations and displaying results
        System.out.println("Addition..........................: " + calc.add());
        System.out.println("Multiplication....................: " + calc.multiply());
        System.out.println("Division..........................: " + calc.divide());

        // Creating an object of the CalculaterPublicPrivate class

        // Allocating reference 'calcPublicPrivate' on the stack
        CalculaterPublicPrivate calcPublicPrivate;

        // Allocating a 'Calculator' object on the heap and assigning its reference to 'calc'
        calcPublicPrivate = new CalculaterPublicPrivate();

        // Setting values for number1 and number2 using public methods
        calcPublicPrivate.setNumber1(10);
        calcPublicPrivate.setNumber2(5);

        // Performing operations and displaying results
        System.out.println("Addition (Public/Private).........: " + calcPublicPrivate.add());
        System.out.println("Multiplication (Public/Private)...: " + calcPublicPrivate.multiply());
        System.out.println("Division (Public/Private).........: " + calcPublicPrivate.divide());
    }
}

// The output of the above program is shown below:

/*

Addition..........................: 15.0
Multiplication....................: 50.0
Division..........................: 2.0
Addition (Public/Private).........: 15.0
Multiplication (Public/Private)...: 50.0
Division (Public/Private).........: 2.0

 */