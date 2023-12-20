package Trials;

import java.util.Scanner;

public class L19_UpdatedArrayUtilsConstructor {
    private int[] arrayNumbers;

    public L19_UpdatedArrayUtilsConstructor(int[] initialArray) {
        this.arrayNumbers = initialArray;
    }

    public void updateArrayElements() {
        Scanner getInputObj = new Scanner(System.in);

        System.out.println("Enter the index to update: ");
        int index = getInputObj.nextInt();

        if (index >= 0 && index < arrayNumbers.length) {
            System.out.println("Enter the new value: ");
            arrayNumbers[index] = getInputObj.nextInt();
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayArrayElements() {
        System.out.println("Array Elements:");
        for (int value : arrayNumbers) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        int[] initialArray = {1, 45, -9, 87, 77, 64, 12};

        L19_UpdatedArrayUtilsConstructor utilsObj = new L19_UpdatedArrayUtilsConstructor(initialArray);

        System.out.println("Original Length of the array: " + initialArray.length);

        utilsObj.displayArrayElements();

        System.out.println("Updated Array:");
        utilsObj.displayArrayElements();

        utilsObj.updateArrayElements();
        System.out.println("Array after updating:");
        utilsObj.displayArrayElements();
    }
}
