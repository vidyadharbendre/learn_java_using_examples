package com.modules.M3_Inheritance.S1_01_Basics.C1_01_What.E4_04_Example;

class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getters and setters for brand and model

    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    // Other common phone functionalities
}

class Samsung extends Phone {
    public Samsung(String model) {
        super("Samsung", model);
    }

    public void useSpen() {
        System.out.println("Using the S Pen feature...");
    }

    // Other Samsung-specific functionalities
}

class Apple extends Phone {
    public Apple(String model) {
        super("Apple", model);
    }

    public void faceIDUnlock() {
        System.out.println("Unlocking using Face ID...");
    }

    // Other Apple-specific functionalities
}

public class Inheritance_Example4 {
    public static void main(String[] args) {
        Samsung samsungPhoneObj;
        samsungPhoneObj = new Samsung("Galaxy S21");
        samsungPhoneObj.makeCall("1234567890"); // Output: Calling 1234567890
        samsungPhoneObj.useSpen(); // Output: Using the S Pen feature...

        Apple iphoneObj;
        iphoneObj = new Apple("iPhone 14");
        iphoneObj.makeCall("987654321"); // Output: Calling 987654321
        iphoneObj.faceIDUnlock(); // Output: Unlocking using Face ID...
    }
}

// The output of the above program is shown as below:
/*
Calling 1234567890
Using the S Pen feature...
Calling 987654321
Unlocking using Face ID...
 */

