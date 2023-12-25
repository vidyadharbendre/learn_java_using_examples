package Lessons.Concepts.Inheritance;

public class Box {
    double l, h, w;

    // Control N or Comman N - short cut to create constructor

    public Box() {
        this.l = 1;
        this.h = 1;
        this.w = 1;
    }

    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box oldBox){
        this.l = oldBox.l;
        this.h = oldBox.h;
        this.w = oldBox.w;
    }

    public void displayInformation(){
        System.out.println("The length of the box...: "+this.l);
        System.out.println("The height of the box...: "+this.h);
        System.out.println("The width of the box....: "+this.w);

        System.out.println("Area of the Cube is.....: "+ this.l*this.h*this.w);
    }
}
