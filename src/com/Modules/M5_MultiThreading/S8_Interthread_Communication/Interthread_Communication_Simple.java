package com.Modules.M5_MultiThreading.S8_Interthread_Communication;

/*
 * This program demonstrates interthread communication in Java using synchronized methods and wait-notify mechanism.
 *
 * The Circle class represents a geometric circle with a radius attribute.
 * It has two synchronized methods: inputRadius(float r) to set the radius and outputArea() to output the area of the circle.
 * The outputArea() method waits for the radius to be set if it's initially 0 and then computes and prints the area.
 *
 * The CT1 class extends Thread and represents a thread that outputs the area of the circle.
 * The CT2 class extends Thread and represents a thread that sets the radius of the circle.
 *
 * In the main method of the Interthread_Communication_Simple class, instances of Circle, CT1, and CT2 classes are created.
 * The CT1 and CT2 threads are started, which respectively output the area of the circle and set its radius.
 *
 * The output of the program demonstrates the area of the circle computed after setting its radius.
 */

class Circle {
    private float radius = 0.0f;

    // Synchronized method to set the radius
    public synchronized void inputRadius(float r) {
        radius = r;
        notify();
    }

    // Synchronized method to output the area
    public synchronized void outputArea() {
        if (radius == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Area : " + 3.14 * radius * radius);
    }
}

class CT1 extends Thread {
    private final Circle circle;

    public CT1(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void run() {
        circle.outputArea();
    }
}

class CT2 extends Thread {
    private final Circle circle;

    public CT2(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void run() {
        circle.inputRadius(100);
    }
}

public class Interthread_Communication_Simple {
    public static void main(String[] args) {
        Circle circleRefObj = new Circle();
        CT1 t1 = new CT1(circleRefObj);
        CT2 t2 = new CT2(circleRefObj);

        t1.start();
        t2.start();
    }
}

// The output of the above program is shown as below
/*
Area : 31400.0
 */