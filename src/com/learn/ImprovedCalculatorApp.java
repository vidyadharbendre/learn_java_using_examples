public class ImprovedCalculatorApp {
    public static void main(String[] args) {

        // Stack memory allocation for reference variables
        ImprovedCalculator calc1;
        ImprovedCalculator calc2;
        ImprovedCalculator calc3;

        // Heap memory allocation for objects
        calc1 = new ImprovedCalculator(10, 5); // Creating 'calc1' on the heap with values 10 and 5
        calc2 = new ImprovedCalculator(20, 8); // Creating 'calc2' on the heap with values 20 and 8
        calc3 = new ImprovedCalculator(15, 3); // Creating 'calc3' on the heap with values 15 and 3

        /*
        // Creating instances of ImprovedCalculator
        ImprovedCalculator calc1 = new ImprovedCalculator(10, 5);
        ImprovedCalculator calc2 = new ImprovedCalculator(20, 8);
        ImprovedCalculator calc3 = new ImprovedCalculator(15, 3);
        */

        // Displaying results for each calculator instance
        System.out.println("Results for Calculator 1:");
        calc1.displayResults();

        System.out.println("\nResults for Calculator 2:");
        calc2.displayResults();

        System.out.println("\nResults for Calculator 3:");
        calc3.displayResults();
    }
}

// The output of the above program is
/*

Results for Calculator 1:
Sum.................: 15.0
Product.............: 50.0
Quotient............: 2.0

Results for Calculator 2:
Sum.................: 28.0
Product.............: 160.0
Quotient............: 2.5

Results for Calculator 3:
Sum.................: 18.0
Product.............: 45.0
Quotient............: 5.0


 */