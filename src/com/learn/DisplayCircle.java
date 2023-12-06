public class DisplayCircle {

    public static void main(String[] args) {
        double area, perimeter;

        CircleClass cirObj;
        cirObj = new CircleClass();

        cirObj.radius = 5;

        area = cirObj.perimeterCircle();
        perimeter = cirObj.areaCircle();

        System.out.println("Area"+area);
        System.out.println("PErmiter"+perimeter);

    }
}
