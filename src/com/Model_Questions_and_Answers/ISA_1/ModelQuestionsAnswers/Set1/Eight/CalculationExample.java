package Lessons.ModelQuestionsAnswers.Set1.Eight;

/*
1. Compile-time Polymorphism (Static Binding or Method Overloading):
Method overloading occurs when multiple methods in the same class have the same name but different parameters.
The compiler determines which method to call based on the number, type, and order of the parameters passed during the method invocation.


2. Run-time Polymorphism (Dynamic Binding or Method Overriding):
Method overriding occurs when a subclass provides a specific implementation of a method that is already provided by its superclass.
It allows a subclass to provide a specialized implementation of a method defined in its superclass.

*/

class CalculationExample {
    private int a;
    private int b;

    // Constructor to initialize values
    public CalculationExample(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add(int a, int b) {
        System.out.println("Adding two integers: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Adding two doubles: " + (a + b));
    }

    public static void main(String[] args) {
        CalculationExample calculationObj;
        calculationObj = new CalculationExample(9990, 8976);

        calculationObj.add(5, 10); // Calls the int version of add method
        calculationObj.add(5.5, 10.2); // Calls the double version of add method
    }
}
