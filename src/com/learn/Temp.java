import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        float farVar1, celOut, verifyOutput;


        System.out.println("Enter farenheit variable");
        Scanner inputObj;
        inputObj = new Scanner(System.in);

        farVar1 = inputObj.nextFloat();

        System.out.println("Entered data "+ farVar1);

        celOut = (farVar1 - 32)*5/9;
        System.out.println("Converted Celsius value "+celOut);

        verifyOutput = (9 * celOut)/5 + 32;
        System.out.println("Converted Celsius value "+verifyOutput);


    }


}
