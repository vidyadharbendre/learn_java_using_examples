package com.lab.program2;

/*
2. Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA main
method to illustrate Stack operations.
 */

class Stack {
    private int[] stackArray;
    private int top;
    private static final int MAX_SIZE = 10;

    public Stack() {
        // Initialize the stack with the specified maximum size
        stackArray = new int[MAX_SIZE];
        // Initialize top to -1 indicating an empty stack
        top = -1;
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            // Increment top and add the value to the stack
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack overflow! Cannot push " + value);
        }
    }

    public void pop() {
        if (top >= 0) {
            // Pop the top element and decrement top
            int poppedValue = stackArray[top--];
            System.out.println("Popped: " + poppedValue);
        } else {
            System.out.println("Stack underflow! Cannot pop from an empty stack.");
        }
    }

    public void display() {
        if (top >= 0) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

public class StackExample {
    public static void main(String[] args) {
        // Create an instance of the Stack class
        Stack myStackRefObj;
        myStackRefObj = new Stack();

        // Illustrate stack operations in the main method
        myStackRefObj.display(); // Display an empty stack

        myStackRefObj.push(5);   // Push elements onto the stack
        myStackRefObj.push(10);
        myStackRefObj.push(15);
        myStackRefObj.display(); // Display the stack after pushes

        myStackRefObj.pop();      // Pop an element from the stack
        myStackRefObj.display(); // Display the stack after pop

        myStackRefObj.pop();      // Pop another element from the stack
        myStackRefObj.display(); // Display the stack after another pop

        myStackRefObj.pop();      // Pop another element from the stack
        myStackRefObj.display(); // Display the stack after another pop

        myStackRefObj.pop();      // Try to pop from an empty stack
    }
}

// The output of the above program is shown as below
/*
Stack is empty.
Pushed: 5
Pushed: 10
Pushed: 15
Stack elements: 5 10 15
Popped: 15
Stack elements: 5 10
Popped: 10
Stack elements: 5
Popped: 5
Stack is empty.
Stack underflow! Cannot pop from an empty stack.
 */
