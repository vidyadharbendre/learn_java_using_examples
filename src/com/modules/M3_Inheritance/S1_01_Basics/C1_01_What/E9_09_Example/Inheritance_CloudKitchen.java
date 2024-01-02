package modules.M3_Inheritance.S1_01_Basics.C1_01_What.E9_09_Example;

// Example usage
public class Inheritance_CloudKitchen {
    public static void main(String[] args) {
        Fruit appleObj;
        appleObj = new Fruit("Apple", "Sweet");
        Vegetable spinachObj;
        spinachObj = new Vegetable("Spinach", "Green");
        Protein chickenBreastObj;
        chickenBreastObj = new Protein("Chicken Breast", 25.0);

        System.out.println("Fruit Name: " + appleObj.getName() + ", Taste: " + appleObj.getTaste());
        appleObj.nutritionalValue();
        System.out.println();

        System.out.println("Vegetable Name: " + spinachObj.getName() + ", Color: " + spinachObj.getColor());
        spinachObj.nutritionalValue();
        System.out.println();

        System.out.println("Protein Name: " + chickenBreastObj.getName() + ", Protein Content: " + chickenBreastObj.getProteinContent() + "g");
        chickenBreastObj.nutritionalValue();
    }
}
// Food superclass
class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void nutritionalValue() {
        System.out.println("The nutritional value of " + name + " is being displayed.");
    }
}

// Fruit subclass
class Fruit extends Food {
    private String taste;

    public Fruit(String name, String taste) {
        super(name);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    // Additional methods or functionalities specific to Fruit can be added here
}

// Vegetable subclass
class Vegetable extends Food {
    private String color;

    public Vegetable(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Additional methods or functionalities specific to Vegetable can be added here
}

// Protein subclass
class Protein extends Food {
    private double proteinContent;

    public Protein(String name, double proteinContent) {
        super(name);
        this.proteinContent = proteinContent;
    }

    public double getProteinContent() {
        return proteinContent;
    }

    // Additional methods or functionalities specific to Protein can be added her
}

// The output of the above program is shown below:
/*
Fruit Name: Apple, Taste: Sweet
The nutritional value of Apple is being displayed.

Vegetable Name: Spinach, Color: Green
The nutritional value of Spinach is being displayed.

Protein Name: Chicken Breast, Protein Content: 25.0g
The nutritional value of Chicken Breast is being displayed.
 */