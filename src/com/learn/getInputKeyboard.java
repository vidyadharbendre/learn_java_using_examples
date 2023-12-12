import java.util.Scanner;

public class getInputKeyboard {
    public static void main(String[] args) {
        int var1;
        float var2;
        Scanner getInput;
        getInput = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        var1 = getInput.nextInt();
        System.out.println("You entered: "+ var1);

        System.out.println("Enter a float value: ");
        var2 = getInput.nextFloat();
        System.out.println("You entered float value: "+ var2);

        getInput.nextByte();

        getInput.close();
    }
}
