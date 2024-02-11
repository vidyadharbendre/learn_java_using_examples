import java.util.Scanner;

public class getInput {
    public static void main(String[] args) {
        int var1;

        Scanner inputObj;
        inputObj = new Scanner(System.in);

        System.out.println("Enter integer as input");
        var1 = inputObj.nextInt();

        System.out.println("Entered data"+var1);




    }
}
