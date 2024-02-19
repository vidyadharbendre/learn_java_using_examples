package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set2.Seven;

/*Question
Define synchronization in the context of multithreading.
Discuss the potential issues that can arise in a multithreaded
environment and explain how synchronization mechanisms, such as the
synchronized keyword, address these issues.
 */

/*Answer
Synchronization in the context of multithreading refers to the coordination of access to shared resources or critical sections of code among multiple threads to ensure consistency and avoid data corruption or race conditions.

In a multithreaded environment, several issues can arise due to concurrent access to shared resources:

Race Conditions: Race conditions occur when the outcome of a program depends on the timing or interleaving of multiple threads accessing shared resources. This can lead to unpredictable behavior or incorrect results.

Data Corruption: If multiple threads simultaneously modify shared data without proper synchronization, data corruption can occur, leading to inconsistencies in the program's state.

Deadlocks: Deadlocks occur when two or more threads are blocked indefinitely, each waiting for the other to release a resource, resulting in a stalemate situation where no progress can be made.

Synchronization mechanisms, such as the synchronized keyword in Java, address these issues by providing a way to control access to shared resources:

Mutual Exclusion: Synchronization ensures that only one thread can access a synchronized block or method at a time, preventing concurrent modifications and race conditions.

Visibility: Synchronization ensures that changes made by one thread to shared data are visible to other threads, preventing inconsistencies and ensuring data integrity.

The synchronized keyword can be applied to methods or blocks of code to achieve synchronization:

Synchronized Methods: By marking a method as synchronized, only one thread can execute that method at a time for a given instance of the class. This ensures that the method's critical section is accessed mutually exclusively.

 */

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
    private int n;

    public Pyramid() {
        this.n = 5;
    }

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