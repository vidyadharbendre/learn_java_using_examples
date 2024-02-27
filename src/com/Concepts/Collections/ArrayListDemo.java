package com.Concepts.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> intNumbers;
        intNumbers = new ArrayList<Integer>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);

        System.out.println(intNumbers);

        System.out.println("--enhanced for loop--");
        for (Object intNumber : intNumbers) {
            System.out.println(intNumber);
        }
        System.out.println("--normal for loop--");
        for (int i = 0; i < intNumbers.toArray().length; i++) {
            System.out.println(intNumbers.toArray()[i]);
        }

    }
}
