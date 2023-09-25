public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int minus = minus(num1, num2);
        System.out.println("뺄셈: " + minus);
    }

    private static int add(int a, int b) {
        return a + b;
    }
    private static int minus(int a, int b) {
        return a - b;
    }
}