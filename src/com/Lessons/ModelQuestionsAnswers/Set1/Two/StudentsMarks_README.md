# Model Question Paper 1:

2. **Q2:Declare, call & define an Array. Besides, enter their marks as elements through keyboard & display their entered marks using static method.**

## Objective:
Demonstrate how to declare, initialize an array, input its elements through the keyboard, and display the entered marks using a static method in Java.

### Steps Involved:

1. **Declaration and Initialization of Array:**
    - Declare an array to store marks.

2. **Input Marks through Keyboard:**
    - Use a loop to input marks for each student through the keyboard.

3. **Display Entered Marks using a Static Method:**
    - Implement a static method to display the entered marks stored in the array.

### Java Code Example:

```java
import java.util.Scanner;

public class StudentsMarks {

    public static void main(String[] args) {
        int sizeArray;
        // Creating a Scanner object to read input
        Scanner scannerObj;
        scannerObj = new Scanner(System.in);

        // Asking user for the number of students/marks
        System.out.print("Enter the number of students marks in Java: ");
        sizeArray = scannerObj.nextInt();

        // Declaring an array to store marks
        int[] studentsMarksArray = new int[sizeArray];

        // Taking input for marks from the keyboard
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Enter Java marks for student " + (i + 1) + ": ");
            studentsMarksArray[i] = scannerObj.nextInt();
        }

        // Closing scanner
        scannerObj.close();

        // Calling the static method to display entered marks
        displayMarks(studentsMarksArray);
    }

    // Static method to display entered marks
    public static void displayMarks(int[] marks) {
        System.out.println("Entered marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}

// The output of the above program is shown as below:
/*
Enter the number of students marks in Java: 4
Enter Java marks for student 1: 68
Enter Java marks for student 2: 78
Enter Java marks for student 3: 63
Enter Java marks for student 4: 29
Entered marks:
68 78 63 29
 */
```