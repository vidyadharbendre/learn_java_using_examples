// Object-Oriented Java code
public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    }

    public void add(int a, int b) {
        result = a + b;
    }

    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(3, 4);
        int result = calc.getResult();
        System.out.println("Result: " + result);
    }
}
