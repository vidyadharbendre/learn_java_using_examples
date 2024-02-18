package com.Modules.M5_MultiThreading.S13_Enumerations;

public class Enum_Constructor_Demo_5 {

    enum Laptop {
        MacBook(1000),
        Surface(8000),
        ThinkPad(7000);

        private float price;

        Laptop(float price) {
            this.price = price;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }



    public static void main(String[] args) {

    }
}

