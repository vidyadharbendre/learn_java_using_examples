package Lessons.Concepts.Inheritance;

public class BoxMain {
    public static void main(String[] args) {
        Box boxObj1;
        boxObj1 = new Box();
        boxObj1.displayInformation();
        System.out.println("----------------------------");
        Box boxObj2;
        boxObj2 = new Box(5);
        boxObj2.displayInformation();
        System.out.println("----------------------------");

        Box boxObj3;
        boxObj3 = new Box(boxObj2);
        boxObj3.displayInformation();
        System.out.println("----------------------------");

        Box boxObj4;
        boxObj4 = new Box(boxObj1);
        boxObj4.displayInformation();
        System.out.println("----------------------------");


        BoxChild boxChildObj1;
        boxChildObj1 = new BoxChild();

        boxChildObj1.displayInformation();
        System.out.println("Weight in the BoxChild class...: "+boxChildObj1.weight);

        BoxChild boxChildObj2;
        boxChildObj2 = new BoxChild(1, 2, 3, 4);

        boxChildObj2.displayInformation();
    }

}

// The output of the above program is shown below
/*
The length of the box...: 1.0
The height of the box...: 1.0
The width of the box....: 1.0
Area of the Cube is.....: 1.0
----------------------------
The length of the box...: 5.0
The height of the box...: 5.0
The width of the box....: 5.0
Area of the Cube is.....: 125.0
----------------------------
The length of the box...: 5.0
The height of the box...: 5.0
The width of the box....: 5.0
Area of the Cube is.....: 125.0
----------------------------
The length of the box...: 1.0
The height of the box...: 1.0
The width of the box....: 1.0
Area of the Cube is.....: 1.0
----------------------------
 */