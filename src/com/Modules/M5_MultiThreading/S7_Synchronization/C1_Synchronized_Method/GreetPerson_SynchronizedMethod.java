package com.Modules.M5_MultiThreading.S7_Synchronization.C1_Synchronized_Method;
/*
1. Execute the below program with and without synchronized keyword
2. Note down the output in each case
 */
class Greet{
    public synchronized void DisplayMessage(String name){
        for (int i = 0; i < 5; i++) {
            System.out.println("Good Morning: "+name);
            System.out.println();
        }

        try {
            Thread.sleep(1000);

        }catch (InterruptedException e1){
            System.out.println(name+e1.getMessage());
        }
    }
}

class MyGreetThread extends Thread{
    Greet greet;
    String name;

    public MyGreetThread(Greet greet, String name) {
        this.greet = greet;
        this.name = name;
    }


    @Override
    public void run() {
        super.run();
        greet.DisplayMessage(name);
    }
}

public class GreetPerson_SynchronizedMethod {
    public static void main(String[] args) {

        Greet greetRefObj;
        greetRefObj = new Greet();

        MyGreetThread myGreetThreadRefObj1;
        myGreetThreadRefObj1 = new MyGreetThread(greetRefObj, "1-Highest Priority");

        MyGreetThread myGreetThreadRefObj2;
        myGreetThreadRefObj2 = new MyGreetThread(greetRefObj, "2-Medium Priority");

        MyGreetThread myGreetThreadRefObj3;
        myGreetThreadRefObj3 = new MyGreetThread(greetRefObj, "3-Lowest Priority");

        myGreetThreadRefObj1.start();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e1){
            System.out.println(e1.getMessage());
        }


        myGreetThreadRefObj2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myGreetThreadRefObj3.start();

    }
}
// The output of the above program is shwon as below
/*
Good Morning: 1-Highest Priority

Good Morning: 1-Highest Priority

Good Morning: 1-Highest Priority

Good Morning: 1-Highest Priority

Good Morning: 1-Highest Priority

Good Morning: 2-Medium Priority

Good Morning: 2-Medium Priority

Good Morning: 2-Medium Priority

Good Morning: 2-Medium Priority

Good Morning: 2-Medium Priority

Good Morning: 3-Lowest Priority

Good Morning: 3-Lowest Priority

Good Morning: 3-Lowest Priority

Good Morning: 3-Lowest Priority

Good Morning: 3-Lowest Priority


Process finished with exit code 0
 */