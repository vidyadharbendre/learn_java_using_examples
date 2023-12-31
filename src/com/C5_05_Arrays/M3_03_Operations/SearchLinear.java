package C5_05_Arrays.M3_03_Operations;

public class SearchLinear {
    public static void main(String[] args) {
        int[] arrayNumbers = {1, 2, 3, 4, 88, -2, 66, 737, 1000};
        int targetElement = 88;
        int targetIndex = searchNumber_Linear(arrayNumbers, targetElement);

        if (targetIndex == -99) {
            System.out.println("The targetElement " + targetElement + " doesn't exist in the given array");
        } else {
            System.out.println("The given number exists and its index value is " + targetIndex);
            System.out.println(arrayNumbers[targetIndex]);
        }
    }

    public static int searchNumber_Linear(int[] arrayNumbers, int targetElement) {
        int index;
        if (arrayNumbers.length == 0) {
            return -1;
        }

        for (index = 0; index < arrayNumbers.length; index++) {
            int eachElement = arrayNumbers[index];
            if (eachElement == targetElement) {
                return index;
            }
        }
        return -99;
    }
}
