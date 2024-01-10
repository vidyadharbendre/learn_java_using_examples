package com.modules.M3_Inheritance.S1_01_Basics.C1_01_What.E7_07_Example;


// Example usage
public class InheritanceExample_FurnitureTypes {
    public static void main(String[] args) {
        Chair chairObj;
        chairObj = new Chair("Wood", "Medium");
        Table tableObj;
        tableObj = new Table("Glass", "Large");
        Cabinet cabinetObj;
        cabinetObj = new Cabinet("Metal", "Small");

        System.out.println("Chair Material: " + chairObj.getMaterial() + ", Size: " + chairObj.getSize());
        chairObj.sit();
        System.out.println();

        System.out.println("Table Material: " + tableObj.getMaterial() + ", Size: " + tableObj.getSize());
        tableObj.workOn();
        System.out.println();

        System.out.println("Cabinet Material: " + cabinetObj.getMaterial() + ", Size: " + cabinetObj.getSize());
        cabinetObj.storeItems();
    }
}

// Furniture superclass
class Furniture {
    private String material;
    private String size;

    public Furniture(String material, String size) {
        this.material = material;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}

// Chair subclass
class Chair extends Furniture {
    public Chair(String material, String size) {
        super(material, size);
    }

    public void sit() {
        System.out.println("You can sit on the chair.");
    }
}

// Table subclass
class Table extends Furniture {
    public Table(String material, String size) {
        super(material, size);
    }

    public void workOn() {
        System.out.println("You can work on the table.");
    }
}

// Cabinet subclass
class Cabinet extends Furniture {
    public Cabinet(String material, String size) {
        super(material, size);
    }

    public void storeItems() {
        System.out.println("You can store items in the cabinet.");
    }
}


// The output of the above program is shown below:

/*
Chair Material: Wood, Size: Medium
You can sit on the chair.

Table Material: Glass, Size: Large
You can work on the table.

Cabinet Material: Metal, Size: Small
You can store items in the cabinet.
 */