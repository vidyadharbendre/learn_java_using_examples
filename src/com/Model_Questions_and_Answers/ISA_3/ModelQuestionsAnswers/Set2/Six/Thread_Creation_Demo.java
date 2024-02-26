package com.Model_Questions_and_Answers.ISA_3.ModelQuestionsAnswers.Set2.Six;

/*
What is Thread? Explain the two ways of creating a Thread in Java and also class diagram.
Provide examples to demonstrate the same.
*/

/*
A thread in Java represents a single sequential flow of control within a program. It allows concurrent execution of tasks, enabling programs to perform multiple operations simultaneously. Threads share the same memory space within a process but have their own execution stack.

There are two ways to create a thread in Java:

Extending the Thread class: This involves creating a subclass of the Thread class and overriding its run() method to define the task that the thread will execute.

Implementing the Runnable interface: This approach requires implementing the Runnable interface and providing an implementation for its run() method. The class implementing Runnable can then be passed as an argument to a Thread constructor.

Here's a class diagram illustrating the relationships between the Thread class, the Runnable interface, and a class that extends Thread or implements Runnable:

 */

// Class extending Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running using Thread class");
    }
}

// Class implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable interface");
    }
}

public class Thread_Creation_Demo {
    public static void main(String[] args) {
        // Creating and starting the thread by extending Thread class
        MyThread thread1_RefObj;
        thread1_RefObj = new MyThread();
        thread1_RefObj.start();

        // Creating a thread by implementing Runnable interface
        MyRunnable myRunnable_RefObj;
        myRunnable_RefObj = new MyRunnable();
        Thread thread2_RefObj;
        thread2_RefObj = new Thread(myRunnable_RefObj);
        thread2_RefObj.start();
    }
}

// The output of the above program is shown as below
/*
Thread running using Thread class
Thread running using Runnable interface
 */