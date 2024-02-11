package com.modules.M2_Introducing_Classes.S01_Class.C1_01_Class_Fundamentals;

class RectangleConstructingInitializing {
    int length;
    int width;

    // Constructor to initialize dimensions
    RectangleConstructingInitializing(int l, int w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        // Creating object with constructor, initializing dimensions
        RectangleConstructingInitializing rect = new RectangleConstructingInitializing(5, 10);

        // Calculating and displaying area
        System.out.println("Area by constructing: " + rect.calculateArea());
    }
}

// The output of the above program is shown as below
/*
Area by constructing: 50
 */