package com.Trials.LearnPolymorphism.Example_1;

public class polymorphism_CompileTime_learn_1 {
    public static void main(String[] args) {

        Overloading overloadingRefObj1;
        overloadingRefObj1 = new Overloading();
        overloadingRefObj1.area();

        Overloading overloadingRefObj2;
        overloadingRefObj2 = new Overloading(2);
        overloadingRefObj2.area(2);

        Overloading overloadingRefObj3;
        overloadingRefObj3 = new Overloading(2, 3);
        overloadingRefObj3.area(2, 3);

    }


}

class Overloading {
    private int side1;
    private int side2;
    private int side3;

    public Overloading() {
        this.side1 = -1;
    }

    public Overloading(int side1) {
        this.side1 = side1;
    }

    public Overloading(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Overloading(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public void area() {
        System.out.println("No arguments : " + "display default value of the one side : " + getSide1());
    }

    public void area(int side1) {
        System.out.println("One argument : " + "display area of the square: " + getSide1() * getSide1());
        System.out.println("One argument : " + "display area of the cube : " + getSide1() * getSide1() * getSide1());
    }

    public void area(int side1, int side2) {
        System.out.println("Two arguments: " + "display area of the rectangle: " + getSide1() * getSide2());
    }

    public void area(int side1, int side2, int side3) {
        System.out.println("Three arguments" + "display area of the cuboid: " + getSide3() * getSide2() * getSide1());
    }
}

// The output of the above program is shown as below:
/*

No arguments : display default value of the one side : -1
One argument : display area of the square: 4
One argument : display area of the cube : 8
One argument : display area of the square: 9
One argument : display area of the cube : 27
Two arguments: display area of the rectangle: 12
No arguments : display default value of the one side : 4
One argument : display area of the square: 16
One argument : display area of the cube : 64
Two arguments: display area of the rectangle: 20
Three argumentsdisplay area of the cuboid: 120

 */