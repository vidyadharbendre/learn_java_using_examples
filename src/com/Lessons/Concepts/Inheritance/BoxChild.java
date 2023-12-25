package Lessons.Concepts.Inheritance;

public class BoxChild extends Box{
    double weight;

    public BoxChild() {
        this.weight = -1;
    }

    public BoxChild(double l, double h, double w, double weight) {
        super(l, h, w);// parent call - through super keyword calling parent
        this.weight = weight;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("The weight of the child box...: "+this.weight);
    }
}
