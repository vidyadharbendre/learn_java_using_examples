public class OOPCalculatorDisplay {
    public static void main(String[] args) {

        // Stack memory allocation for reference variables
        CalculatorConstructor calcObj1;
        CalculatorConstructor calcObj2;
        CalculatorConstructor calcObj3;

        // Heap memory allocation for objects
        calcObj1 = new CalculatorConstructor(10, 5); // Creating 'calcObj1' on the heap with values 10 and 5
        calcObj2 = new CalculatorConstructor(20, 8); // Creating 'calcObj2' on the heap with values 20 and 8
        calcObj3 = new CalculatorConstructor(15, 3); // Creating 'calcObj3' on the heap with values 15 and 3

        /*
        // Creating three instances of CalculatorConstructor with different values
        CalculatorConstructor calcObj1 = new CalculatorConstructor(10, 5);
        CalculatorConstructor calcObj2 = new CalculatorConstructor(20, 4);
        CalculatorConstructor calcObj3 = new CalculatorConstructor(15, 3);
        */
        // Calling displayResults for each instance
        System.out.println("Results for calcObj1:");
        calcObj1.displayResults();

        System.out.println("\nResults for calcObj2:");
        calcObj2.displayResults();
        System.out.println("\nResults for calcObj3:");
        calcObj3.displayResults();
    }
}

// The output of the above program is shown as below
/*

Results for calcObj1:
Sum.................: 15.0
Product.............: 50.0
Quotient............: 2.0

Results for calcObj2:
Sum.................: 24.0
Product.............: 80.0
Quotient............: 5.0

Results for calcObj3:
Sum.................: 18.0
Product.............: 45.0
Quotient............: 5.0

 */
