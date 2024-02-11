package com.modules.M2_Introducing_Classes.S01_Class.C1_01_Class_Fundamentals;

class RectangleAccessingMembers {
    int length;
    int width;

    // Method to calculate area
    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        RectangleAccessingMembers rect = new RectangleAccessingMembers();

        // Accessing and setting dimensions directly
        rect.length = 5;
        rect.width = 10;

        // Calculating and displaying area
        System.out.println("Area by accessing members: " + rect.calculateArea());
    }
}

// The output of the above program is shown as below
/*
Area by accessing members: 50
 */