package Lessons.ModelQuestionsAnswers.Set3.Two;

public class NumberPrinter {

    // Method to print numbers from 1 to 10
    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Creating an object of NumberPrinter class
        NumberPrinter printerObj;
        printerObj = new NumberPrinter();

        // Calling the method to print numbers
        printerObj.printNumbers();
    }
}

// The output of the above program is shown as below:
/*
1
2
3
4
5
6
7
8
9
10
 */