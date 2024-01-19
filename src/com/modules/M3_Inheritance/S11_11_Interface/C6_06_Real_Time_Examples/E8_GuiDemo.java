package com.modules.M3_Inheritance.S11_11_Interface.C6_06_Real_Time_Examples;

// Clickable interface
interface Clickable {
    void onClick();
}

// Concrete classes implementing the Clickable interface
class Button implements Clickable {
    @Override
    public void onClick() {
        System.out.println("Button clicked");
    }
}

class Link implements Clickable {
    @Override
    public void onClick() {
        System.out.println("Link clicked");
    }
}

// Usage
public class E8_GuiDemo {
    public static void main(String[] args) {
        Clickable buttonRefObj;
        buttonRefObj = new Button();

        Clickable linkRefObj;
        linkRefObj = new Link();

        buttonRefObj.onClick();
        linkRefObj.onClick();
    }
}

// The outpput of the above program is given below;
/*
Button clicked
Link clicked
 */