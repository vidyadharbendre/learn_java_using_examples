package com.Modules.M5_MultiThreading.S8_Interthread_Communication;

class Circle {
    private float radius = 0.0f;
    // Synchronized method to set the radius
    public synchronized void inputRadius(float r) {
        radius = r;
        notify();
    }

    // Synchronized method to output the area
    public synchronized void outputArea() {
        if (radius == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
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
        Circle circleRefObj;
        circleRefObj = new Circle();

        CT1 t1;
        t1 = new CT1(circleRefObj);

        CT2 t2;
        t2 = new CT2(circleRefObj);

        t1.start();
        t2.start();
    }
}
// The output of the above program is shown as below
/*
Area : 78.5
 */