

// This should be 11th Program

public class L12_ImprovedCalculatorDisplay_12 {
    public static void main(String[] args) {

        // Stack memory allocation for reference variables
        L11_ImprovedCalculator_11 calcObj1;
        L11_ImprovedCalculator_11 calcObj2;
        L11_ImprovedCalculator_11 calcObj3;

        // Heap memory allocation for objects
        calcObj1 = new L11_ImprovedCalculator_11(10, 5); // Creating 'calcObj1' on the heap with values 10 and 5
        calcObj2 = new L11_ImprovedCalculator_11(20, 8); // Creating 'calcObj2' on the heap with values 20 and 8
        calcObj3 = new L11_ImprovedCalculator_11(15, 3); // Creating 'calcObj3' on the heap with values 15 and 3

        /*
        // Creating three instances of CalculatorConstructor with different values
        L11_ImprovedCalculator_11 calcObj1 = new L11_ImprovedCalculator_11(10, 5);
        L11_ImprovedCalculator_11 calcObj2 = new L11_ImprovedCalculator_11(20, 4);
        L11_ImprovedCalculator_11 calcObj3 = new L11_ImprovedCalculator_11(15, 3);
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

// javac -d out .\L12_ImprovedCalculatorDisplay_12.java
// java -cp out L12_ImprovedCalculatorDisplay_12

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
