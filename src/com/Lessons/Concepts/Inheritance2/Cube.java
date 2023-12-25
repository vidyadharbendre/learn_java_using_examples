package Lessons.Concepts.Inheritance2;

public class Cube extends Square{
    float side2;

    public Cube(float side, float side1, float side2) {
        super(side, side1);
        this.side = side;
        this.side1 = side1;
        this.side2 = side2;
        if((this.side == this.side1) && (this.side1 == this.side2)) {
            this.shape = "Cube";
        }
        else{
            this.shape = "cuboid";
        }
        this.area = this.side*this.side1*this.side2;
    }
}
