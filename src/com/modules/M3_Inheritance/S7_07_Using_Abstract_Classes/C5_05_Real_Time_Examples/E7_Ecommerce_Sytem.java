package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E7_Ecommerce_Sytem {
    public static void main(String[] args) {
        ElectronicProduct electronicProduct = new ElectronicProduct("Smartphone", 79999.99, "Samsung");
        ClothingProduct clothingProduct = new ClothingProduct("T-Shirt", 1999.99, "M");

        // Example Usage:
        electronicProduct.displayDetails();
        System.out.println(); // Add a line break for better readability
        clothingProduct.displayDetails();
    }
}

abstract class Product {
    protected String name;
    protected double price;
    abstract void displayDetails();
}

class ElectronicProduct extends Product {
    private String brand;

    ElectronicProduct(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    @Override
    void displayDetails() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

class ClothingProduct extends Product {
    private String size;

    ClothingProduct(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    void displayDetails() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}

// The output of the above program is shown as below
/*

Electronic Product: Smartphone
Brand: Samsung
Price: 79999.99

Clothing Product: T-Shirt
Size: M
Price: 1999.99

 */