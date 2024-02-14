package com.Modules.M5_MultiThreading.S7_Synchronization.C1_Synchronized_Method;


class A extends Thread{
    Pyramid p;

    A (Pyramid p){
        this.p = p;
    }

    @Override
    public void run(){
        p.draw_pyramid('*');
    }

}

class B extends Thread{
    Pyramid p;

    B (Pyramid p){
        this.p = p;
    }

    @Override
    public void run(){
        p.draw_pyramid('#');
    }

}

class Pyramid {
    int n = 5;

    synchronized void draw_pyramid(char ch) {
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

public class SynchPyramidDisplay {
    public static void main(String[] args) {
        Pyramid pyramidRefObj = new Pyramid();
//        pyramidRefObj.draw_pyramid('*');

        A threadA;
        threadA = new A(pyramidRefObj);

        B threadB;
        threadB = new B(pyramidRefObj);

        threadA.start();
        threadB.start();

    }
}

// The output of the above program is shown as below

// Without Synchronized

/*
    *
   ***
      #
   ###
  #####
 #*****
 *****######
########**
*********
#
 */

// With synchronized
/*
    *
   ***
  *****
 *******
*********
    #
   ###
  #####
 #######
#########
 */

// The same above program can be converted into the synchronized block
/*
synchronized (this) { // Synchronize on the same monitor object
 */