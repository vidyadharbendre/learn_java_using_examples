# Race Condition in Java

## Overview

In concurrent programming, a race condition occurs when the behavior of a program depends on the timing or interleaving of multiple threads, and the outcome of the program becomes unpredictable. Race conditions typically occur when multiple threads access shared resources or variables without proper synchronization, leading to unexpected results.

## Example: Printing Pyramid with Different Characters

To demonstrate a race condition, let's consider a simple Java program where two threads simultaneously draw a pyramid using different characters ('*' and '#') without using the `synchronized` keyword. Each thread will try to draw its own pyramid independently, potentially leading to interleaved output if not properly synchronized.

### Java Code Example:

```java
class A extends Thread {
    Pyramid p;

    A(Pyramid p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.draw_pyramid('*');
    }
}

class B extends Thread {
    Pyramid p;

    B(Pyramid p) {
        this.p = p;
    }

    @Override
    public void run() {
        p.draw_pyramid('#');
    }
}

class Pyramid {
    private int n;

    public Pyramid() {
        this.n = 5;
    }

    // Method to draw the pyramid without synchronization
    void draw_pyramid(char ch) {
        for (int i = 0; i < n; i++) {
            // Print spaces before each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print characters for each row
            for (int j = 0; j <= i * 2; j++) {
                System.out.print(ch);
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}

public class PyramidRaceConditionExample {
    public static void main(String[] args) {
        Pyramid pyramidRefObj = new Pyramid();

        // Create and start two threads
        A threadA = new A(pyramidRefObj);
        B threadB = new B(pyramidRefObj);
        threadA.start();
        threadB.start();
    }
}
```
### Expected Output:
The expected output of the program without synchronization should ideally be two separate pyramids, one made of '*' characters and the other made of '#' characters. However, due to the race condition, the output might be unpredictable and contain interleaved characters from both pyramids.

### Conclusion
Race conditions can lead to data corruption, inconsistency, or incorrect behavior in multithreaded programs. It's essential to properly synchronize access to shared resources or variables in order to avoid race conditions and ensure the correctness of concurrent programs