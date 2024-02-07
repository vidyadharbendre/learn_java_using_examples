package com.modules.M5_MultiThreading.L99_Trials;

class OddNumbers{
    int i=1, n=10;
    public void displayOdd(){
        for (i = 1; i < n; i++) {
            if (i%2 != 0){
                System.out.println("Odd Number - : "+i);
            }
        }
    }
}

class EvenNumbers{
    int i=1, n=10;
    public void displayEven(){
        for (i = 1; i < n; i++) {
            if (i%2 == 0){
                System.out.println("Even Number - : "+i);
            }
        }
    }
}


public class SyncDemo1 {
    public static void main(String[] args) {
        OddNumbers oddNumbersRefObj;
        oddNumbersRefObj = new OddNumbers();

        EvenNumbers evenNumbersRefObj;
        evenNumbersRefObj = new EvenNumbers();

        oddNumbersRefObj.displayOdd();
        evenNumbersRefObj.displayEven();
    }
}
