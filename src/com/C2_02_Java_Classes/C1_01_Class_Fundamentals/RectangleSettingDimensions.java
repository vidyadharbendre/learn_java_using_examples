package com.C2_02_Java_Classes.C1_01_Class_Fundamentals;

class RectangleSettingDimensions {
    int length;
    int width;

    // Method to set dimensions
    void setDimensions(int l, int w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        RectangleSettingDimensions rect = new RectangleSettingDimensions();

        // Setting dimensions using a method
        rect.setDimensions(5, 10);

        // Calculating and displaying area
        System.out.println("Area by setting dimensions: " + rect.calculateArea());
    }
}

// The output of the above program is shown as below
/*
Area by setting dimensions: 50
 */