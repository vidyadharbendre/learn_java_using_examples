package Lessons.Concepts.Inheritance2;

public class Square extends Shape{
    float side1;

    public Square(float side, float side1) {
        super(side);
        this.side = side;
        this.side1 = side1;
        this.shape = "Square";
        this.area = this.side*this.side1;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
    }
}
