package com.learn;

import java.util.Scanner;

public class GetInputs {
    public static void main(String[] args) {
        int input1;

        Scanner scannerRefObj;
        scannerRefObj = new Scanner(System.in);
        System.out.println("Enter an integer");
        input1 = scannerRefObj.nextInt();
        System.out.println("Entered value is : "+input1);


    }

}
