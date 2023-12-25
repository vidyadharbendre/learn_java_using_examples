package Lessons.Concepts.Inheritance2;

public class Shape {
    float side;
    double area;
    String shape;

    public Shape(float side){
        this.side = side;
        this.shape = "Circle";
        this.area = 3.14*side*side;
    }

    public void displayInformation(){
        System.out.println("The area of the "+this.shape  +" is...: "+this.area);
    }
}
