import java.util.Scanner;


public class Add2Numbers {

    public static void main(String[] args) {
        float floatVar1, floatVar2, sum;

        Scanner inputObj;
        inputObj = new Scanner(System.in);

        System.out.println("Enter the first variable");
        floatVar1 = inputObj.nextFloat();

        System.out.println("Enter the Second variable");
        floatVar2 = inputObj.nextFloat();

        sum = floatVar1 + floatVar2;
        System.out.println(sum);



    }
}
/*
 * Compilation Command:
         * javac -d ../../../out Add2Numbers.java
         *
         * Execution Command:
         * java -cp ../../../out Add2Numbers

 */