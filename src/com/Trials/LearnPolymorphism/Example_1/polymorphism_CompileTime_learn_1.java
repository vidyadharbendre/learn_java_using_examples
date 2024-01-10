package com.Trials.LearnPolymorphism.Example_1;

public class polymorphism_CompileTime_learn_1 {
    public static void main(String[] args) {

        Overloading overloadingRefObj1;
        overloadingRefObj1 = new Overloading();
        overloadingRefObj1.area();

        com.Trials.LearnInheritance.Example_6.Overloading overloadingRefObj2;
        overloadingRefObj2 = new com.Trials.LearnInheritance.Example_6.Overloading(2);
        overloadingRefObj2.area(2);


        com.Trials.LearnInheritance.Example_6.Overloading overloadingRefObj3;
        overloadingRefObj3 = new com.Trials.LearnInheritance.Example_6.Overloading(3, 4);
        overloadingRefObj3.area(3);
        overloadingRefObj3.area(3, 4);

        com.Trials.LearnInheritance.Example_6.Overloading overloadingRefObj4;
        overloadingRefObj4 = new com.Trials.LearnInheritance.Example_6.Overloading(4, 5, 6);
        overloadingRefObj4.area();
        overloadingRefObj4.area(4);
        overloadingRefObj4.area(4, 5);
        overloadingRefObj4.area(4, 5, 6);




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