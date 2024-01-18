package com.modules.M3_Inheritance.S7_07_Using_Abstract_Classes.C5_05_Real_Time_Examples;

public class E3_Online_Shopping_Cart {
    public static void main(String[] args) {
        OnlineShoppingCart onlineShoppingCartRefObj;
        onlineShoppingCartRefObj = new OnlineShoppingCart();

        onlineShoppingCartRefObj.addItem("Laptop", 120000);
        onlineShoppingCartRefObj.addItem("Headphone", 1000);
        onlineShoppingCartRefObj.addItem("mouse", 800);
        onlineShoppingCartRefObj.removeItem("Headphone");
        onlineShoppingCartRefObj.checkout();

    }

}


abstract class Cart{
    abstract void addItem(String itemName, double price);
    abstract void removeItem(String itemName);
    abstract void checkout();

}

class OnlineShoppingCart extends Cart{
    @Override
    void addItem(String itemName, double price) {
        System.out.println("Added " + itemName + " to the cart Price "+ price);
    }

    @Override
    void removeItem(String itemName) {
        System.out.println("Removed " + itemName + " from the Cart ");
    }

    @Override
    void checkout() {
        System.out.println("Checked Out. Thank you for Shopping");
    }

}

// The output of the above program is shown as below:
/*

Added Laptop to the cart Price 120000.0
Added Headphone to the cart Price 1000.0
Added mouse to the cart Price 800.0
Removed Headphone from the Cart
Checked Out. Thank you for Shopping

 */