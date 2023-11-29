public class OOPCalculatorDisplay {
    public static void main(String[] args) {
        // Creating three instances of CalculatorConstructor with different values
        CalculatorConstructor calcObj1 = new CalculatorConstructor(10, 5);
        CalculatorConstructor calcObj2 = new CalculatorConstructor(20, 4);
        CalculatorConstructor calcObj3 = new CalculatorConstructor(15, 3);

        // Calling displayResults for each instance
        System.out.println("Results for calcObj1:");
        calcObj1.displayResults();

        System.out.println("\nResults for calcObj2:");
        calcObj2.displayResults();
        System.out.println("\nResults for calcObj3:");
        calcObj3.displayResults();
    }
}
