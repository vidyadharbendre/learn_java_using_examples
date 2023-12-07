public class CircleConstructor {
    //attributes
    private float radius;

    //constructor class
    public CircleConstructor(float initialRadiusValue){
        this.radius = initialRadiusValue;
    }

    //getter methods for accessing private
    public float getRadiusAttribute(){
        return radius;
    }
    //setter method for modifying the private attribute
    public void setRadiusAttribute(float setNewRadiusValue){
        this.radius = setNewRadiusValue;

    }

    double areaCircle(){
        return (3.14*radius*radius);
    }
    double perimeterCircle(){
        return(2*3.14*radius);
    }

    void displayResults(){
        double area, perimeter;
        area = areaCircle();
        perimeter = perimeterCircle();

        System.out.println("Area of the circle :"+area);
        System.out.println(("Perimeter of the circle "+perimeter));


    }

    public static void main(String[] args) {
        // Creating an object of CircleConstructor
        CircleConstructor circleObj;
        circleObj = new CircleConstructor(5.0f);

        // Display initial radius
        System.out.println("Initial Radius: " + circleObj.getRadiusAttribute());

        // Display area and perimeter
        circleObj.displayResults();

        // Change the radius using the setter method
        circleObj.setRadiusAttribute(7.0f);

        // Display updated radius, area, and perimeter
        System.out.println("Updated Radius: " + circleObj.getRadiusAttribute());
        circleObj.displayResults();
        // Display updated radius, area, and perimeter
        System.out.println("Updated Radius: " + circleObj.getRadiusAttribute());
    }
}