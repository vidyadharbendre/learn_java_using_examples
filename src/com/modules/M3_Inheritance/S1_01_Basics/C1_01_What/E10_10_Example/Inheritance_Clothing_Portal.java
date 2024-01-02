package modules.M3_Inheritance.S1_01_Basics.C1_01_What.E10_10_Example;

// Example usage
public class Inheritance_Clothing_Portal {
    public static void main(String[] args) {
        Shirt tShirtObj;
        tShirtObj = new Shirt("Medium", "Blue", "Short Sleeves");
        Pants jeansObj;
        jeansObj = new Pants("32", "Black", "Slim Fit");
        Dress summerDressObj;
        summerDressObj = new Dress("Small", "Yellow", "Floral");

        System.out.println("Shirt Size: " + tShirtObj.getSize() + ", Color: " + tShirtObj.getColor() + ", Sleeve Type: " + tShirtObj.getSleeveType());
        System.out.println();

        System.out.println("Pants Size: " + jeansObj.getSize() + ", Color: " + jeansObj.getColor() + ", Fit: " + jeansObj.getFit());
        System.out.println();

        System.out.println("Dress Size: " + summerDressObj.getSize() + ", Color: " + summerDressObj.getColor() + ", Style: " + summerDressObj.getStyle());
    }
}

// Clothing superclass
class Clothing {
    private String size;
    private String color;

    public Clothing(String size, String color) {
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}

// Shirt subclass
class Shirt extends Clothing {
    private String sleeveType;

    public Shirt(String size, String color, String sleeveType) {
        super(size, color);
        this.sleeveType = sleeveType;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    // Additional methods or functionalities specific to Shirt can be added here
}

// Pants subclass
class Pants extends Clothing {
    private String fit;

    public Pants(String size, String color, String fit) {
        super(size, color);
        this.fit = fit;
    }

    public String getFit() {
        return fit;
    }

    // Additional methods or functionalities specific to Pants can be added here
}

// Dress subclass
class Dress extends Clothing {
    private String style;

    public Dress(String size, String color, String style) {
        super(size, color);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    // Additional methods or functionalities specific to Dress can be added here
}

// The output of the above program is shown below:
/*
Shirt Size: Medium, Color: Blue, Sleeve Type: Short Sleeves

Pants Size: 32, Color: Black, Fit: Slim Fit

Dress Size: Small, Color: Yellow, Style: Floral
 */
